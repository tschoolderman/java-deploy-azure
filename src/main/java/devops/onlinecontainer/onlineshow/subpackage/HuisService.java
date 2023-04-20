package devops.onlinecontainer.onlineshow.subpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HuisService {

	@Autowired
	HuisRepository hr;
	
	public void serviceMethode() {
		hr.save(new Huis());
		System.out.println("in de service methode");
	}
}
