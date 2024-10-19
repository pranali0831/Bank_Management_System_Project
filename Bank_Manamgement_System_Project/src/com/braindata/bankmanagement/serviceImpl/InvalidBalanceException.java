package com.braindata.bankmanagement.serviceImpl;

public class InvalidBalanceException extends Exception {
	public InvalidBalanceException(String msg)
	{
		super(msg);
	}

}
