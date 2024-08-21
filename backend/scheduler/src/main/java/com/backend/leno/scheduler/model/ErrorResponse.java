package com.backend.leno.scheduler.model;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {
	
	private int status;
	private String message;
	
	public static ErrorResponse invalidArgument(FieldError fieldError) {
		return ErrorResponse.builder()
				.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
				.message(fieldError.getDefaultMessage())
				.build();
	}
	
}
