package com.company;

public class Account {
    private int number;
    private int account;
    private String holder;
    private double initialDeposit;
    private double balance;
    private double depositValue;
    private double NovoDepositValue;


    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }


    public void setAccount(int account){
        this.account = account;
    }
    public int getAccount(){
        return this.account;
    }


    public void setHolder(String holder){
        this.holder = holder;
    }
    public String getHolder(){
        return this.holder;
    }


    public void setInitalDeposit(double initalDeposit){
        this.initialDeposit = initalDeposit;
    }

    public double getNovoDepositValue() {
        return NovoDepositValue;
    }

    public void setNovoDepositValue(double novoDepositValue) {
        NovoDepositValue = novoDepositValue;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance + this.initialDeposit + this.depositValue + NovoDepositValue;
    }

    public double getDepositValue() {
        return depositValue;
    }

    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
    }

    public String toString(){
    return
        "Account data: \n"+
                "Account " + getAccount() +
                ", Holder: " + getHolder() +
                ", Balance : $ " + getBalance();
    }
}

