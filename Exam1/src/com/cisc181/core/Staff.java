package com.cisc181.core;

import java.util.Date;
import com.cisc181.eNums.eTitle;

public class Staff extends Employee {

	 private int Title;

	   public Staff(int title){
	        this.Title = title;
	    }

	    public void setTitle(int title){
	        this.Title = title;
	    }
	    public int getTitle(){
	        return this.Title;
	    }

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			int Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}
}