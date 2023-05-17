package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PracController {

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}

}