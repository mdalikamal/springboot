package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}")
	public String getuserDetail(@PathVariable("userID") int id) {
		System.out.println(id);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home view..");
		String string = null;
		System.out.println(string.length());
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("query_box") String query) {
		String url = "https://www.google.com/search?q=" + query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}

	
}