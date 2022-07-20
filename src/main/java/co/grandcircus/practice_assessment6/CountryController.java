package co.grandcircus.practice_assessment6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CountryController {
	
	@Autowired 
	private CountryRepository repo; 
	
	@RequestMapping("/")
	public String listCountries(Model model) {
		List<Country> countries = repo.findAll();
		model.addAttribute("countries", countries);
		return "listCountries";
	}
	
//	@PostMapping("/countries-by-continent")
//	public String showResult(Model model, @RequestParam String continent) {
//		model.addAttribute("result", repo.findByContinent(continent));
//		return "/countries-by-continent";
//	}
//	
	@PostMapping("/countries-by-continent")
	public String showResult(Model model, @RequestParam String continent) {
		
		List<Country> results = repo.findByContinent(continent);
		model.addAttribute("results", results);
	
		return "/countries-by-continent";
	}
}

