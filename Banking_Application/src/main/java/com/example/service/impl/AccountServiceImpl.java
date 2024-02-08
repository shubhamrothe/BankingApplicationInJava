package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.AccountDto;
import com.example.entity.Account;
import com.example.mapper.AccountMapper;
import com.example.repository.AccountRepository;
import com.example.service.AccountService;

@Service  //to automatically create spring bean for this class
public class AccountServiceImpl implements AccountService  {
	
	private AccountRepository accountRepository;
	
	@Autowired  //from spring boot3 we can ignored this
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}


	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account=AccountMapper.mapToAccount(accountDto);
		Account savedAccount=accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

}
