package com.backend.leno.scheduler.service;

import com.backend.leno.scheduler.repository.RecordCustomRepository;
import com.backend.leno.scheduler.repository.RecordRepository;
import com.backend.leno.scheduler.model.Record;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class RecordService {
	
	private final RecordRepository repository;
	private final RecordCustomRepository customRepository;
	
	public RecordService(RecordRepository repository, RecordCustomRepository customRepository) {
		this.repository = repository;
		this.customRepository = customRepository;
	}
	
	public Record save(Record record) {
		return repository.save(record);
	}
	
	
	public Page<Record> findPaginated(String service, String customer, String location, LocalDate initialDate,
			LocalDate finalDate, Boolean canceled, Boolean done, int page, int size){
		return customRepository.findPaginated(service, customer, location, initialDate, finalDate, canceled, done, page, size);
	}
	
}
