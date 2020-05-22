package io.amanproject.Controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.amanproject.Service.TryService;

@Controller
public class TryController {

	@Autowired
	private TryService tr;
	
	
	@GetMapping("/")
	public String pleasework2(Model model) {
		return "newf";
	}
	
	@GetMapping("/fortune")
	public String pleasework3(Model model) {
		model.addAttribute("work", tr.call());
		return "newf2";
	}
}
