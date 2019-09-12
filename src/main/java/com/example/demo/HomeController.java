package com.example.demo;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prasad u 
 * This is an controller use for calling Finger Print Servers.
 *
 */
@RestController
public class HomeController {

	/**
	 * This is an method which UI calls to invoke exe from Ui
	 */
	@GetMapping("/callexe")
	public void CallExe() {

		try {
			Process process = new ProcessBuilder("C:\\EHAT.exe").start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
