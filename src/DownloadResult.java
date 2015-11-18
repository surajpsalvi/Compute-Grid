

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadResult
 */
@WebServlet("/download")
public class DownloadResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static final int BYTES_DOWNLOAD = 1024;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setContentType("APPLICATION/OCTET-STREAM");   
		response.setHeader("Content-Disposition","attachment; filename=Output.txt");   
		PrintWriter out = response.getWriter();  
		FileInputStream fileInputStream = new FileInputStream("/home/5115/Output.txt");  
		
		int i;   
		while ((i=fileInputStream.read()) != -1) {  
			out.write(i);   
		}   
		fileInputStream.close();   
		out.close();
		
		File tmpFile=new File("/home/5115/Output.txt");
		if(tmpFile.delete()){
			System.out.println(tmpFile.getName() + " is deleted!");
		}else{
			System.out.println("Delete operation is failed.");
		}
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
