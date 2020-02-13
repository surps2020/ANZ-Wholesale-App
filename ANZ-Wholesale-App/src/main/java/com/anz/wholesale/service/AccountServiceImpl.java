package com.anz.wholesale.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.anz.wholesale.bean.AccountList;
import com.anz.wholesale.bean.AccountTranscation;

import ch.qos.logback.core.net.SyslogOutputStream;


@Service
public class AccountServiceImpl implements AccountService{

	private static List<AccountList> accounts;
	private static Map<String, AccountTranscation> transcations;
	private static List<AccountTranscation> transcationsList;

	
	public AccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}
  
	static{
		accounts= AccountLists();
		transcations= AccountTranscationLists();
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
  	if(transcations.containsKey(accountNumber))
	{
     transcationsList.add(transcations.get(accountNumber));
	 }
	return transcationsList;
}
private static Map<String, AccountTranscation> AccountTranscationLists(){
    Map<String,AccountTranscation> transcations= new HashMap<String,AccountTranscation>();
    transcations.put("123-2223-212",new AccountTranscation("123-2223-212", "CurrentAccount", "01/12/2012", "SGD",0.00,9540.98,"Credit",""));
    transcations.put("123-2223-213",new AccountTranscation("123-2223-213", "SavingAccount", "01/12/2012", "SGD",0.00,7492.22,"Credit",""));
	return transcations;
}
}
