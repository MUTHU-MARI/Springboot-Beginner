package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController
public class welcomemsg {
	String name="MUTHU";
	@GetMapping("/")
	public String getwelcomemsg()
	{
		return name + " Welcome you to this page";
	}

}
