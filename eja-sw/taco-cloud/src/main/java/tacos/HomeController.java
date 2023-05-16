package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // controller
public class HomeController {
	
	@GetMapping("/") // root way (/)
	public String home() {
		return "home"; // return name template
	}

}
