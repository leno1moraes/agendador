package com.backend.leno.scheduler.controller.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RecordDTO(
		Long id,
		
		@NotBlank(message = "O campo seviço não pode estar vazio")
		@Size(min = 3, max = 20, message = "O tamanho do campo serviço deve estar entre 3 e 20 caracteres")
		String service,

		@NotBlank(message = "O campo cliente não pode estar vazio")
		@Size(min = 3, max = 20, message = "O tamanho do campo cliente deve estar entre 3 e 20 caracteres")
		String customer,
		
		@NotBlank(message = "O campo localização não pode estar vazio")
		@Size(min = 3, max = 50, message = "O tamanho do campo localização deve estar entre 3 e 20 caracteres")		
		String location,
		
		@NotNull(message = "O campo data e hora não pode estar nulo")
		LocalDateTime dateTime,
		
		boolean done,
		
		boolean canceled		
		) {

}
