package com.example.mapper;

import com.example.dto.AccountDto;
import com.example.entity.Account;

public class AccountMapper {
//to map/convert AccountDto into Accountjpa entity
	public static Account mapToAccount(AccountDto accountDto)
	{
		Account account =new Account(
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
				);
		return account;
	}
	
	//to convert  Accountjpa entity into AccountDto 
	public static AccountDto mapToAccountDto(Account account)
	{
		AccountDto accountDto=new AccountDto(
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
				); 
		return accountDto;
	}
}
