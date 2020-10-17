package com.fengkuang.java.多线程16.线程同步165;
public class Account {
    // 封装账户编号、账户余额的两个成员变量
    private String accountNo;
    private double balance;
    public Account() {
    }
    // 构造器
    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    // 此处省略了accountNo和balance的setter和getter方法
    // accountNo的setter和getter方法
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountNo() {
        return this.accountNo;
    }
    // balance的setter和getter方法
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    // 下面两个方法根据accountNo来重写hashCode()和equals()方法
    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj != null && obj.getClass() == Account.class) {
            var target = (Account) obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }
}