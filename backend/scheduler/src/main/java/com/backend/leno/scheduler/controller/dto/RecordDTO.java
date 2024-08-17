package com.backend.leno.scheduler.controller.dto;

import java.time.LocalDateTime;

public record RecordDTO(
		Long id,
		
		String service,
		
		String customer,
		
		String location,
		
		LocalDateTime dateTime,
		
		boolean done,
		
		boolean canceled		
		) {

}
