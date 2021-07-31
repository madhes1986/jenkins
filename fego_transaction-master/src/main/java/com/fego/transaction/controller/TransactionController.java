package com.fego.transaction.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fego.transaction.common.response.SuccessResponse;
import com.fego.transaction.dto.ConsentResponseDto;
import com.fego.transaction.dto.TransactionRequestDto;
import com.fego.transaction.service.TransactionService;

@RestController
@RequestMapping(path = "v1/transaction")
public class TransactionController {
	private final TransactionService service;

	public TransactionController(TransactionService service) {
		this.service = service;
	}

	@Transactional
	@PostMapping(path = "/save-txn")
	public SuccessResponse<ConsentResponseDto> add(@RequestBody @Valid TransactionRequestDto transactionRequestDto) {
		return new SuccessResponse<ConsentResponseDto>(service.save(transactionRequestDto), HttpStatus.OK);
	}
}