package day05.practice;

public class IciciATM extends AxisATM implements ATM{
	
	Account icici = new Account();
	
	
	@Override
	public boolean deposit(String account, double amount) {
		if(amount > 0) {
			icici.setAccNo(account);
			icici.setBalance(icici.getBalance()+amount);
			return true;
		} else {
			System.out.println("Amount should Not be zero or below");
			return false;
		}
	}

	@Override
	public boolean withdraw(String account, double amount) throws Exception {
		
		double charges = 10.0;
		
		if(icici.getBalance() < 5000) {
			throw new Exception("Account balance is less than 5000");
		} else {
			icici.setAccNo(account);
			icici.setBalance(icici.getBalance() - amount - charges);
			return true;
		}
		
	}

	@Override
	public double getBalance() {
		System.out.println("AccNo:"+icici.getAccNo());
		
		return icici.getBalance();
	}

}
