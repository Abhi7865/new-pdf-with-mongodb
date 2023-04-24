package com.example.demo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LoanDatabase {
	@Id
    private String LoanNumber;
	private String firstName;
	private String lastName;
	private String dob;
	private float loanAmount;
	private int loanTennure;
	private float LoanEmi;

   
    private byte[] Loanpdf;

    
    

	public String getLoanNumber() {
		return LoanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		LoanNumber = loanNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanTennure() {
		return loanTennure;
	}

	public void setLoanTennure(int loanTennure) {
		this.loanTennure = loanTennure;
	}

	public float getLoanEmi() {
		return LoanEmi;
	}

	public void setLoanEmi(float loanEmi) {
		LoanEmi = loanEmi;
	}

	public byte[] getLoanpdf() {
		return Loanpdf;
	}

	public void setLoanpdf(byte[] pdf) {
		Loanpdf = pdf;
	}
    
    
}
