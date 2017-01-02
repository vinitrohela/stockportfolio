package com.allstate;


public class Client extends Brokerage {
    protected String clientName;
    protected int age;
    protected String gender;
    protected int currentCash;

    public Client(String brokerageName, String clientName, int age, String gender) {
        super(brokerageName);
        this.clientName = clientName;
        this.age = age;
        this.gender = gender;
    }

    public int getCurrentCash() {
        return currentCash;
    }

    public void setCurrentCash(int currentCash) {
        this.currentCash = currentCash;
    }

    public int depositFund(int fund){
        return this.currentCash += fund;
    }

    public int withdrawFund(int fund){
        if(fund<= this.currentCash)
            return this.currentCash -= fund;
        return this.currentCash;
    }
}
