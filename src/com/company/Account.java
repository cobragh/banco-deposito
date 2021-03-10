package com.company;

public class Account {
    private int number;
    private int account;
    private String holder;

    private double initialDeposit;
    private double balance;
    private double depositValue;
    private double NovoDepositValue;
    private double withdraw;



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


    public void setInitialDeposit(double initalDeposit){
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



    public void setWithdraw(double withdraw){
        this.balance -= (withdraw + 5.00);
    }

    public double getWithdraw(){
        return this.withdraw;
    }

    public String toString(){
    return
        "Account data: \n"+
                "Account " + getAccount() +
                ", Holder: " + getHolder() +
                ", Balance : $ " + getBalance();
    }
}

