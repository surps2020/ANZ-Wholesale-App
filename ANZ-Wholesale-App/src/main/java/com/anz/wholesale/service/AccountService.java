package com.anz.wholesale.service;


import java.util.List;

import com.anz.wholesale.bean.AccountList;
import com.anz.wholesale.bean.AccountTranscation;

public interface AccountService {
	List<AccountList> getAllAccountList();
	List<AccountTranscation> getAllTranscationList(String accountNumber);
}
