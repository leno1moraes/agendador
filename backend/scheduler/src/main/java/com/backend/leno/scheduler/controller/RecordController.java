package com.backend.leno.scheduler.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.leno.scheduler.model.Record;

import com.backend.leno.scheduler.service.RecordService;

@RestController
@RequestMapping("/record")
@CrossOrigin("*")
public class RecordController {
		
	private final RecordService recordService;
	
	public RecordController(RecordService recordService) {
		this.recordService = recordService;
	}
	
	@GetMapping
	public String testarGet() {
		return "Olá Mundo";
	}
	
	@PostMapping
	public Record save(@RequestBody Record record) {
		return recordService.save(record);
	}
}
