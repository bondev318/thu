package com.example.mssv.hoten.a_cau2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.mssv.hoten.a_cau2.entity.Subject;

@RestController
public class SubjectController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/subject")
	public List<Subject> getAll() {
		ResponseEntity<Subject[]> response = restTemplate.getForEntity("subject",
				Subject[].class);

		return Arrays.asList(response.getBody());
	}

	@PostMapping("/subject")
	public Subject create(@RequestBody Subject subject) {

		return restTemplate.postForObject("subject", subject, Subject.class);
	}
}
