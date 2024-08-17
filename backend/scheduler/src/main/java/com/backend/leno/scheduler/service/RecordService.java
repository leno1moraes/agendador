package com.backend.leno.scheduler.service;

import com.backend.leno.scheduler.repository.RecordRepository;
import com.backend.leno.scheduler.model.Record;
import org.springframework.stereotype.Service;

@Service
public class RecordService {
	
	private final RecordRepository repository;
	
	public RecordService(RecordRepository repository) {
		this.repository = repository;
	}
	
	public Record save(Record record) {
		return repository.save(record);
	}
}
