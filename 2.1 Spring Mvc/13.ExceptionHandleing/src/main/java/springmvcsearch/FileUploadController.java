package springmvcsearch;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/fileForm")
	public String showUploadForm() {
		return "filesForm";
	}
	@RequestMapping(path="/uploadimage",method = RequestMethod.POST)
	public String FileUpload(@RequestParam("profile")CommonsMultipartFile file,HttpSession s)
	{
		System.out.println(file.getSize());
		byte[] data=file.getBytes();
		System.out.println("file upload");
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+file;
		System.out.println(path);
		try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("Fileupload");
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		return "filesuccess";
	}

}
