package com.example.registration;

public class BankAccount {
    private String accountNo;
    private String name;
    private double balance;

    public BankAccount() {} // Required no-arg constructor

    // Getters
    public String getAccountNo() { return accountNo; }
    public String getName() { return name; }
    public double getBalance() { return balance; }

    // Setters
    public void setAccountNo(String accountNo) { this.accountNo = accountNo; }
    public void setName(String name) { this.name = name; }
    public void setBalance(double balance) { this.balance = balance; }
}
