package com.cisc181.eNums;

public enum eTitle {
	PROFESSOR, DEAN, SECRATARY;
	
	private eTitle(int Title){
		this.Title = Title;
	}

	private int Title;
	
	public int getTitle(){
		return Title;
	}

}
