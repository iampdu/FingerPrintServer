package com.example.demo;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/callexe")
	public String CallExe() {

		try {
			Process process = new ProcessBuilder("C:\\EHAT.exe").start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "success";
	}

}
