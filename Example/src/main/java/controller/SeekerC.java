package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Seeker;
import repository.SeekerR;

@RestController
@CrossOrigin(allowedHeaders="*")
@Controller
@RequestMapping("/api")
public class SeekerC {
	
	@Autowired
	private SeekerR seekerR;
	
	@PostMapping("/seeker2")
	public Seeker createSeeker(Seeker seeker) {
		// TODO Auto-generated method stub
		return seekerR.save(seeker);
	}
	
	@PostMapping("/seeker")
	public Seeker addSeeker(Seeker seeker) {
		// TODO Auto-generated method stub
		System.out.println("rashed");
		System.out.println(seeker);
		
		return seekerR.save(seeker);

	}
	
	@PutMapping("/seeker1")
	public Seeker updateSeeker(Seeker seeker) {
		// TODO Auto-generated method stub
		return seekerR.save(seeker);
	}
	
	@DeleteMapping("/{empid}")
	public void  deleteSeeker(@PathVariable ("empid")Long empid) {
			// TODO Auto-generated method stub
			 seekerR.findById(empid);
		}
		
	@GetMapping	("/{empid}")
	public void  getSeeker(@PathVariable ("empid")Long empid) {
		// TODO Auto-generated method stub
		 seekerR.findById(empid);
		
		

	}
	
	
	@GetMapping
	public List<Seeker> getAllSeeker() {
		// TODO Auto-generated method stub
		return seekerR.findAll();
	}
	

}
