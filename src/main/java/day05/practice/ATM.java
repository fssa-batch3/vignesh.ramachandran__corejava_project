package day05.practice;

public interface ATM {
	
	boolean deposit(String account, double amount);
	
    boolean withdraw(String account,double amount) throws Exception;
    double getBalance();

}
