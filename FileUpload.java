package tcs.groupB;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.common.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FileUpload() {
        super();
       
    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
	try {
		sf.parseRequest((RequestContext) request);
	} catch (FileUploadException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		}
		FileItem x= write(new File("C:/Users/USER/workspace/upload"+getServletName()));

		private FileItem write(File file) {
			// TODO Auto-generated method stub
			return null;
		}

	
	}

