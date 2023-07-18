package day05.practice;

public class AxisATM extends Account implements ATM {
	
	Account axis = new Account();
	

	
	@Override
	public boolean deposit(String account, double amount) {
		if(amount > 0) {
			axis.setAccNo(account);
			axis.setBalance(axis.getBalance()+amount);
			return true;
		} else {
			System.out.println("Amount should Not be zero or below");
			return false;
		}
	}
	

	@Override
	public boolean withdraw(String account, double amount) throws Exception {
		
		final double charges = 5.0;

		if(axis.getBalance() < 5000) {
			throw new Exception("Insufficient Balance");
		} else {
			axis.setAccNo(account);
			axis.setBalance(axis.getBalance() - (amount + charges));
			return true;
		}
		
		
	}

	
	@Override
	public double getBalance() {
		System.out.println("AccNo:"+axis.getAccNo());
		
		return axis.getBalance();
		
		
	}

}
