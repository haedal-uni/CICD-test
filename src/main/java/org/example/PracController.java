package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PracController {
	@Value("${hello.world}")
	private String helloWorld;

	@GetMapping("/hello")
	public String hello(){
		return "coco";
	}

	@GetMapping("/hello2")
	public String getHelloWorld(){
		return helloWorld;
	}

}