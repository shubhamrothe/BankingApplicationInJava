package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.AccountDto;
import com.example.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	
	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	//Add Account REST API
	@PostMapping
	public ResponseEntity<AccountDto> addAccout(@RequestBody AccountDto accoutDto, AccountDto accountDto){
		//AccountDto accountDto;
		return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
	}

}
