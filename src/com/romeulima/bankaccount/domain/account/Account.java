package com.romeulima.bankaccount.domain.account;

public class Account {
    private Integer accountNumber;
    private String holderName;
    private Double balance = 0.0;

    public Account(Integer accountNumber, String holderName, Double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        deposit(initialDeposit);
    }

    public Account(Integer accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.holderName = accountHolder;
    }

    public Account(){}

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double value){
        balance += value;
    }

    public void withdraw(Double value){
        balance -= value + 5.0;
    }

    public String toString(){
        return "Account "
                + accountNumber
                + ", Holder: "
                + holderName
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
