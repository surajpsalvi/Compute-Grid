import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class RuntimeExec 
{
	static ArrayList<String> op = new ArrayList<String>();
	public StreamWrapper getStreamWrapper(InputStream is, String type)
	{
            return new StreamWrapper(is, type);
	}
	class StreamWrapper extends Thread 
	{
	    InputStream is = null;
	    String type = null;          
	    String message = null;
	 
	    public String getMessage() {
	            return message;
	    }
	 
	    StreamWrapper(InputStream is, String type) {
	        this.is = is;
	        this.type = type;
	    }
	 
	    public void run() {
	        try {
	            BufferedReader br = new BufferedReader(new InputStreamReader(is));
	            StringBuffer buffer = new StringBuffer();
	            String line = null;
	            int c= 0;
	            while ( (line = br.readLine()) != null) 
	            {
	            	c++;
	                buffer.append(""+line+"\n");//.append("\n");	                
	            }
	            message = buffer.toString();
	        } catch (IOException ioe) {
	            ioe.printStackTrace();  
	        }
	    }
}
  
 
// this is where the action is
@SuppressWarnings("unused")
public static void main(String[] args) {
            Runtime rt = Runtime.getRuntime();
            RuntimeExec rte = new RuntimeExec();
            StreamWrapper error, output;
 
            try {
                        Process proc = rt.exec("/home/5115/test2.sh");
                        error = rte.getStreamWrapper(proc.getErrorStream(), "ERROR");
                        output = rte.getStreamWrapper(proc.getInputStream(), "OUTPUT");
                        int exitVal = 0;
 
                        error.start();
                        output.start();
                        error.join(3000);
                        output.join(3000);
                        exitVal = proc.waitFor();
                        System.out.println("Output:\n "+output.message+"\nError: "+error.message);
            } catch (IOException e) {
                        e.printStackTrace();
            } catch (InterruptedException e) {
                        e.printStackTrace();
            }
            }
}