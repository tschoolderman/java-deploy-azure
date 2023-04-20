package devops.onlinecontainer.onlineshow.subpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HuisEndpoint {

	@Autowired
	HuisService hs;
	
	@GetMapping("test")
	public String itWorks() {
		System.out.println("print backend endpoint");
		hs.serviceMethode();
		return "het lukt";
	}
}
