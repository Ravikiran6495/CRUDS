package com.hefshine.Demo;

import java.util.List;
import java.util.Optional;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@Autowired
	StrRepo studenr;

	@RequestMapping("/")
	public String Welcome(Model model)
	{
		List<Student> ll = studenr.findAll();
		model.addAttribute("al", ll);
		return "welcome.jsp";
	}
	
	@RequestMapping("home")
	public String Home(Model model)
	{
		Student student=new Student();
		model.addAttribute("student",student);
		return "index.jsp";
		
	}
	
	
	
	@RequestMapping("add")
	public String Add(@ModelAttribute Student student,Model model)
	{
		studenr.save(student);
		
		List<Student> ll = studenr.findAll();
		model.addAttribute("al", ll);
		return "welcome.jsp";
	}
	
	
	@RequestMapping("{id}")
	public String Delete(@PathVariable int id)
	{
		studenr.deleteById(id);
	
		return "redirect:/";
	}
	
	

	
	
}
