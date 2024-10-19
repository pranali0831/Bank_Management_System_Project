package com.braindata.bankmanagement.service;

import com.braindata.bankmanagement.serviceImpl.InvalidAccountNoException;
import com.braindata.bankmanagement.serviceImpl.InvalidAdharNoException;
import com.braindata.bankmanagement.serviceImpl.InvalidAgeException;
import com.braindata.bankmanagement.serviceImpl.InvalidMobNoException;
import com.braindata.bankmanagement.serviceImpl.InvalidBalanceException;
import com.braindata.bankmanagement.serviceImpl.InvalidGenderException;
import com.braindata.bankmanagement.serviceImpl.InvalidAgeException;

public interface Rbi {
	
	public void createAccount() throws InvalidAccountNoException, InvalidMobNoException, InvalidAdharNoException,InvalidBalanceException, InvalidAgeException, InvalidGenderException ;
	public void displayAllDetails();
	public void depositeMoney();
	public void withdrawal();
	public void balanceCheck();

}

