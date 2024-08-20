package com.backend.leno.scheduler.controller;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Page<Record> findPaginated(@RequestParam(name = "service", required = false) String service,
            @RequestParam(name = "customer", required = false) String customer,
            @RequestParam(name = "location", required = false) String location,
            @RequestParam(name = "initialDate", required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate initialDate,
            @RequestParam(name = "finalDate", required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate finalDate,
            @RequestParam(name = "done", required = false) Boolean done,
            @RequestParam(name = "canceled", required = false) Boolean canceled,
            @RequestParam(name = "page", defaultValue = "10") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {
		
		return recordService.findPaginated(service, customer, location, initialDate, finalDate, canceled, done, page, size);
	}
	
	
	@PostMapping
	public Record save(@RequestBody Record record) {
		return recordService.save(record);
	}
}
