package com.braindata.bankmanagement.serviceImpl;
import java.io.*;
public class InvalidAccountNoException extends Exception{

	
	public InvalidAccountNoException(String msg)
	{
		super(msg);
	}
}
