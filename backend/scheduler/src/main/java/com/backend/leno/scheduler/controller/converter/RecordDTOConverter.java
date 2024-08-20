package com.backend.leno.scheduler.controller.converter;
import java.util.Optional;

import com.backend.leno.scheduler.controller.dto.RecordDTO;
import com.backend.leno.scheduler.model.Record;
import org.springframework.stereotype.Component;

@Component
public class RecordDTOConverter {	
	
	public RecordDTO convert(Record record) {
		return Optional.ofNullable(record)
				.map(source -> new RecordDTO(
						source.getId(),
						source.getService(),
						source.getCustomer(),
						source.getLocation(),
						source.getDateTime(),
						source.isDone(),
						source.isCanceled()
						))
				.orElse(null);
	}
	
	public Record convert(RecordDTO dto) {
		return Optional.ofNullable(dto)
				.map(source -> Record.builder()
						.id(source.id())
						.service(source.service())
						.customer(source.customer())
						.location(source.location())
						.dateTime(source.dateTime())
						.done(source.done())
						.canceled(source.canceled())
						.build())
				.orElse(null);
	}
}
