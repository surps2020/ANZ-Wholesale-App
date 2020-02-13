package com.anz.wholesale.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.anz.wholesale.bean.AccountList;
import com.anz.wholesale.bean.AccountTranscation;


@Service
public class AccountServiceImpl implements AccountService{

	private static List<AccountList> accounts;
	private static List<AccountTranscation> transcations;
	
	public AccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}
  
	static{
		accounts= AccountLists();
		transcations= AccountTranscations();
   }
	
	
public List<AccountList> getAllAccountList() {
       return accounts;
   }

private static List<AccountList> AccountLists(){
       List<AccountList> accounts= new ArrayList<AccountList>();
       accounts.add(new AccountList(585309209, "SGSavings726", "Saving","08/11/2018","SGD",84327.51));
       accounts.add(new AccountList(791066619, "AUSavings933", "Saving","08/11/2018","SGD",880050.93));
       return accounts;
   }

public List<AccountTranscation> getAllTranscationList(String accountNumber) {
	return  transcations.stream().filter(x-> x.getAccountNumber() == accountNumber).collect(Collectors.toList());
	}
	
private static List<AccountTranscation> AccountTranscations(){
    List<AccountTranscation> transcations= new ArrayList<AccountTranscation>();
    transcations.add(new AccountTranscation("123-2223-212", "CurrentAccount", "01/12/2012", "SGD",0.00,9540.98,"Credit",""));
    transcations.add(new AccountTranscation("123-2223-212", "CurrentAccount", "01/12/2012", "SGD",0.00,7497.82,"Credit",""));
    transcations.add(new AccountTranscation("123-2223-213", "SavingAccount", "01/12/2012", "SGD",0.00,7492.22,"Credit",""));

    return transcations;
}
}
