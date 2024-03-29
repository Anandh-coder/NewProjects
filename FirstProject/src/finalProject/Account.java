package finalProject;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	
	Scanner input = new Scanner(System.in);
	//DecimalFormat moneyFormat = new DecimalFormat("'$###,##0.00'");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;		
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance ;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calcSavingsWithdraw(double amount) {
		savingsBalance = (savingsBalance - amount);
		return savingsBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}
	
	public double calcSavingsDeposit(double amount) {
		savingsBalance = checkingBalance + amount;
		return savingsBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + checkingBalance);
		System.out.println("Amount you want to withdraw from checking account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) > 0) {
			calcCheckingWithdraw(amount);
			System.out.println("Current Checking Account Balance: " + checkingBalance);
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + checkingBalance);
		System.out.println("Amount you want to deposit for checking account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("Current Checking Account Balance: " + checkingBalance);
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	public void getSavingsWithdrawInput() {
		System.out.println("Savings Account Balance: " + savingsBalance);
		System.out.println("Amount you want to withdraw from savings account: ");
		double amount = input.nextDouble();
		
		if((savingsBalance - amount) > 0) {
			calcSavingsWithdraw(amount);
			System.out.println("Current Savings Account Balance: " + savingsBalance);
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	public void getSavingsDepositInput() {
		System.out.println("Savings Account Balance: " + savingsBalance);
		System.out.println("Amount you want to deposit for checking account: ");
		double amount = input.nextDouble();
		
		if((savingsBalance + amount) >= 0) {
			calcSavingsDeposit(amount);
			System.out.println("Current Checking Account Balance: " + savingsBalance);
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}

}
