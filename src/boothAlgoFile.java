

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
/**
 * Servlet implementation class boothAlgoFile
 */
@WebServlet("/boothAlgoFile")
public class boothAlgoFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       static int flag = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public boothAlgoFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings({ "resource", "unused" })
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		PrintWriter pw = response.getWriter();
		if(ServletFileUpload.isMultipartContent(request))
		{
			
				             try 
				             {
				            	 int[] count=new int[2];
		 			             int i=0;
		 			             String fn[] ={"Input.txt","Input2.txt"};
				            	 
				            	 	@SuppressWarnings("unchecked")
									List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
				 			                
				 			          for(FileItem item : multiparts)
				 			          {
				 			        	 
				 			              if(!item.isFormField())
				 			              {			 			            	 
				 			              
					                         String name = new File(item.getName()).getName();
					                         
					                         String UPLOAD_DIRECTORY="/home/5115/Documents/tmp";
					                         
					                         item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
					                         
					                         File oldName = new File("/home/5115/Documents/tmp/"+name);
					                         
					                         name=name.replace(' ','-');
					                         
					                         File newName = new File("/home/5115/Documents/tmp/"+name);
					                         
					                          if(oldName.renameTo(newName)) 
					                          {
					                             System.out.println("renamed");
					                          } else 
					                          {
					                             System.out.println("Error");
					                          }			                         
				                         			                    			         							         							         		    				         		    
					                        String file1;
					          	 			BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/5115/Documents/tmp/"+name));	 					 								          	 			
					           						
					          	 			//int count1 = 0,count2 = 0;
					          	 			while (( file1 = bufferedReader.readLine()) != null)
					           				{
					          	 				try
					          	 				{
					          	 					int fc1 = Integer.parseInt(file1);
					          	 					
						          	 				count[i]=count[i] + 1;	          	 				
						          	 				//pw.print(count[i]+"]"+file1+" ("+flag+")"+"\n");
						          	 										          	 				
						          	 				
					          	 				}catch(Exception e)
					          	 				{
					          	 					String msg = "Input file is INVALID";					          	 				   					                               
					          	 					response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);					                              
					          	 					response.setHeader("Location", "index.jsp?msg="+msg+"");  
					          	 					//pw.write("Input file is INVALID");					          	 					
					          	 				}
					           				}
					          	 			
					          	 			if(i==1)
					          	 			{
					          	 				if(count[0]>=count[1])
					          	 				{
							          	 		   File afile =new File("/home/5115/Documents/tmp/"+name);
							          	 		 
							          	    	   if(afile.renameTo(new File("/home/5115/"+fn[i]+"")))
							          	    	   {
							          	    		   System.out.println("File is moved successful!");
							          	    	   }else
							          	    	   {
							          	    		   System.out.println("File is failed to move!");
							          	    	   }
					          	 				}
					          	 				else
					          	 				{
					          	 					pw.write("File 2 contain more numbers than File 1");
					          	 					return;
					          	 				}
					          	 			}
					          	 			else if(i==0)
					          	 			{
					          	 				File afile =new File("/home/5115/Documents/tmp/"+name);
						          	 		 
					          	 				if(afile.renameTo(new File("/home/5115/"+fn[i]+"")))
					          	 				{
					          	 					System.out.println("File is moved successful!");
					          	 				}else
					          	 				{
					          	 					System.out.println("File is failed to move!");
					          	 				}
					          	 			}
					          	 
					          	 			i++;
					          	 			
					          	 			
					          	 			
				                     }
				 
				                 }
				 		 
				                request.setAttribute("message", "File Uploaded Successfully");
	
			             } catch (Exception ex) 
			             {
			                request.setAttribute("message", "File Upload Failed due to " + ex);
			 
			             }   
				             
				             
				             // ------------------------------------------------------------------------------------------------
				             
				             
				             
				          // ===============================================================================================================
				    		 
				    		 
				     
			            
	 
	         }
			else
	         {
	 
	             request.setAttribute("message","Sorry this Servlet only handles file upload request");
	
	         }
		      			 
			         //request.getRequestDispatcher("/result.jsp").forward(request, response);
		Runtime rt = Runtime.getRuntime();
        RuntimeExec rte = new RuntimeExec();
        RuntimeExec.StreamWrapper error = null;
		 RuntimeExec.StreamWrapper output;

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
	             System.out.println("Output:\n "+output.message);
	             //pw.println(output.message);
	             
	            
	             // ===================================================================================
	             
	            
	             
	            String numberx;
	 			BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/5115/Output.txt"));	 					 			

	 			pw.print("<!DOCTYPE html>");
	 			pw.print("<html lang='en'>");
	 			pw.print("  <head>");
	 			pw.print("		<title>Result | VISU Grid</title>");
	 			pw.print("		<meta charset='utf-8' />");
	 			pw.print("		<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	 			pw.print("		<link rel='stylesheet' type='text/css' href='css/bootstrap.css'>");
	 			pw.print("		<link rel='stylesheet' type='text/css' href='css/font-awesome.css'>");
	 			pw.print("		<link rel='stylesheet' id='camera-css'  href='css/camera.css' type='text/css' media='all'>");
	 			pw.print("");
	 			pw.print("		<link rel='stylesheet' type='text/css' href='css/slicknav.css'>");
	 			pw.print("		<link rel='stylesheet' href='css/prettyPhoto.css' type='text/css' media='screen' title='prettyPhoto main stylesheet' charset='utf-8' />");
	 			pw.print("		<link rel='stylesheet' type='text/css' href='css/style.css'>");
	 			pw.print("		<link rel='shortcut icon' type='image/x-icon' href='images/logo.png' />");
	 			pw.print("		");
	 			pw.print("		<script type='text/javascript' src='js/jquery-1.8.3.min.js'></script>");
	 			pw.print("");
	 			pw.print("		<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700|Open+Sans:700' rel='stylesheet' type='text/css'>");
	 			pw.print("		<script type='text/javascript' src='js/jquery.mobile.customized.min.js'></script>");
	 			pw.print("		<script type='text/javascript' src='js/jquery.easing.1.3.js'></script> ");
	 			pw.print("		<script type='text/javascript' src='js/camera.min.js'></script>");
	 			pw.print("		<script type='text/javascript' src='js/myscript.js'></script>");
	 			pw.print("		<script src='js/sorting.js' type='text/javascript'></script>");
	 			pw.print("		<script src='js/jquery.isotope.js' type='text/javascript'></script>	");
	 			pw.print("		<script>");
	 			pw.print("			jQuery(function(){");
	 			pw.print("					jQuery('#camera_wrap_1').camera({");
	 			pw.print("					transPeriod: 500,");
	 			pw.print("					time: 3000,");
	 			pw.print("					height: '490px',");
	 			pw.print("					thumbnails: false,");
	 			pw.print("					pagination: true,");
	 			pw.print("					playPause: false,");
	 			pw.print("					loader: false,");
	 			pw.print("					navigation: false,");
	 			pw.print("					hover: false");
	 			pw.print("				});home");
	 			pw.print("			});");
	 			pw.print("		</script>");
	 			pw.print("		");
	 			pw.print("	</head>");
	 			pw.print("	<body>");
	 			pw.print("    ");
	 			pw.print("    <!--home start-->");
	 			pw.print("    ");
	 			pw.print("    <div id='home'>");
	 			pw.print("    	<div class='headerLine'>");
	 			pw.print("	<div id='menuF' class='default'>");
	 			pw.print("		<div class='container'>");
	 			pw.print("			<div class='row'>");
	 			pw.print("				<div class='logo col-md-4'>");
	 			pw.print("					<div>");
	 			pw.print("						<a href='#'>");
	 			pw.print("							<img src='images/logo.png'>");
	 			pw.print("						</a>");
	 			pw.print("					</div>");
	 			pw.print("				</div>");
	 			pw.print("				<div class='col-md-8'>");
	 			pw.print("					<div class='navmenu'style='text-align: center;'>");
	 			pw.print("						<ul id='menu'>");
	 			pw.print("							<li class='active' ><a href='index.jsp'>Home</a></li>");
	 			pw.print("						");
	 			pw.print("						</ul>");
	 			pw.print("					</div>");
	 			pw.print("				</div>");
	 			pw.print("			</div>");
	 			pw.print("		</div>");
	 			pw.print("	</div>");
	 			pw.print("<div class='container'>");
	 			pw.print("			<div class='row wrap'>");
	 			pw.print("				<div class='col-md-12 gallery'> ");
	 			pw.print("						<div class='camera_wrap camera_white_skin' id='camera_wrap_1'>");
	 			pw.print("							<div data-thumb='' data-src='images/slides/blank.gif'>");
	 			pw.print("								<div class='img-responsive camera_caption fadeFromBottom'>");
	 			pw.print("									<h2>Result.</h2>");
	 			pw.print("								</div>");
	 			pw.print("							</div>							");
	 			pw.print("						</div><!-- #camera_wrap_1 -->");
	 			pw.print("				</div>");
	 			pw.print("			</div>");
	 			pw.print("		</div>		");
	 			pw.print("	</div>");
	 			pw.print("		  ");
	 			pw.print("    </div>");
	 			pw.print("    ");
	 			pw.print("   			");
	 			
	 			pw.print("   <div class='container' id='news'>			<div class='row'>				<div class='col-md-9 col-xs-12 forma'>			<form method='get' action='download'><div class='cBtn col-xs-12'><button class='send' type='submit'>Download Output as .txt File</button></form></div>");
	 			
	 			pw.print("		<div class='container'>");
	 			pw.print("			<div class='row'>");
	 			pw.print("				<div class='col-md-9 col-xs-12 forma'>");
	 			pw.print("					");	 				 				 				 		
	 										
				
	 			while (( numberx = bufferedReader.readLine()) != null)
				{
	 				//pw.print(numberx+"\n");
	 				int a1 = numberx.indexOf(">");
	 				int a2 = numberx.indexOf("*");
	 				int a3 = numberx.indexOf("=");
	 				int a4 = numberx.length();
	 				
	 				//pw.print("\n"+a1+" "+a2+" "+a3+" "+a4+"\n");
	 				
	 				String m1 = "", m2 = "" ,m3 = "";	 				
					 			
	 				a1++;
	 				
	 				for(int i=a1;i<a2;i++)
	 				{
	 					m1 = m1 + numberx.charAt(i);
	 						 					
	 				}
	 				//pw.print("["+m1+"]");
	 				
	 				a2++;
	 				
	 				for(int i=a2;i<a3;i++)
	 				{
	 					m2 = m2 + numberx.charAt(i);	 					
	 				}
	 				
	 				//pw.print("("+ m2+")");
	 				
	 				a3++;
	 				
	 				for(int i=a3;i<a4;i++)
	 				{
	 					m3 = m3 + numberx.charAt(i);	 					
	 				}	 			
	 				 				
	 			pw.print("						<input type='text' class='col-md-6 col-xs-12 name' name='fn' id='fn' value='"+m1+"  * "+m2+" = "+m3+"' readonly/>					");	 				
	 				
				}
	 			
	 			pw.print("						</div>");
	 			pw.print("					");
	 			pw.print("				</div>");
	 			pw.print("			</div>");
	 			pw.print("		</div>	");
	 			pw.print("								");
	 			pw.print("    </div>    ");
	 			pw.print("    ");
	 			pw.print("       <div class='container'>	");
	 			pw.print("			");
	 			pw.print("			<script type='text/javascript'>");
	 			pw.print("				jQuery(window).load(function(){");
	 			pw.print("					items_set = [");
	 			pw.print("					");
	 			pw.print("						{category : 'branding', lika_count : '77', view_count : '234', src : 'images/prettyPhotoImages/pic9.jpg', title : 'Foil Mini Badges', content : '' },");
	 			pw.print("						");
	 			pw.print("						{category : 'polygraphy', lika_count : '45', view_count : '100', src : 'images/prettyPhotoImages/pic7.jpg', title : 'Darko – Business Card Mock Up', content : '' },");
	 			pw.print("						");
	 			pw.print("						{category : 'text_styles', lika_count : '22', view_count : '140', src : 'images/prettyPhotoImages/pic8.jpg', title : 'Woody Poster Text Effect', content : '' }");
	 			pw.print("						");
	 			pw.print("");
	 			pw.print("					];");
	 			pw.print("					jQuery('.portfolio_block').portfolio_addon({");
	 			pw.print("						type : 1, // 2-4 columns simple portfolio");
	 			pw.print("						load_count : 3,");
	 			pw.print("						");
	 			pw.print("						items : items_set");
	 			pw.print("					});");
	 			pw.print("					$('#container').isotope({");
	 			pw.print("					  animationOptions: {");
	 			pw.print("						 duration: 900,");
	 			pw.print("						 queue: false");
	 			pw.print("					   }");
	 			pw.print("					});");
	 			pw.print("				});");
	 			pw.print("				");
	 			pw.print("				");
	 			pw.print("				");
	 			pw.print("			</script>");
	 			pw.print("		</div>");
	 			pw.print("    </div>    ");
	 			pw.print("    ");
	 			pw.print("    <!--news start-->");
	 			pw.print("			<div class='container'>");
	 			pw.print("				<div class='row downLine'>");
	 			pw.print("					<div class='col-md-12 text-right'>");
	 			pw.print("");
	 			pw.print("					</div>");
	 			pw.print("					<div class='col-md-6 text-left copy'>");
	 			pw.print("						<p style='color:black' >Copyright © 2015 PICT. All Rights Reserved.</p>");
	 			pw.print("					</div>");
	 			pw.print("					<div class='col-md-6 text-right dm'>");
	 			pw.print("						<ul id='downMenu'>							");
	 			pw.print("							<li class='active' ><a style='color:black'  href='index.jsp'>Home</a></li>");
	 			pw.print("					</ul>");
	 			pw.print("					</div>");
	 			pw.print("				</div>");
	 			pw.print("			</div>");
	 			pw.print("		</div>");
	 			pw.print("    </div>		");
	 			pw.print("	<script src='js/jquery.prettyPhoto.js' type='text/javascript' charset='utf-8'></script>");
	 			pw.print("	<script src='js/bootstrap.min.js'></script>");
	 			pw.print("	<script src='js/jquery.slicknav.js'></script>");
	 			pw.print("	</body>	");
	 			pw.print("</html>");
	 							         
	             
        } catch (IOException e) 
        {
                    e.printStackTrace();
        } catch (InterruptedException e) 
        {
                    e.printStackTrace();
        }
		}

}
