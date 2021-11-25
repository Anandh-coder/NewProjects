package finalProject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
	
	Scanner choice = new Scanner(System.in);
	DecimalFormat MoneyFormat = new DecimalFormat("'$'##,##0.00");
	
	Map<Integer, Integer> data = new HashMap<>();
	int x = 1;
	public void getlogin() throws IOException {
		
		do {
			try {
				data.put(79891, 4268);
				data.put(81799, 2684);
				System.out.println("Welcome to the ATM Project");
				System.out.println("Enter your customer number");
				setCustomerNumber(choice.nextInt());
				
				System.out.println("Enter your PIN Numner: ");
				setPinNumber(choice.nextInt());
				
			} catch (Exception e) {
				System.out.println("\n" + "Invalid Character(s). only Numbers." + "/n");
				x = 2;
				x ++;
				OptionMenu om = new OptionMenu();
				om.getlogin();
			}			
			
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if(data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			}else 
				System.out.println("\n" + "Invalid Customer and Pin number" + "\n");			
			
		}while (x == 1);		
		
	}	
	
	
	public void getAccountType() {
		System.out.println("Select the Account you want to Access");
		System.out.println(" Type 1 - Checking Account");
		System.out.println(" Type 2 - Savings Account");
		System.out.println(" Type 3 - Exit");
		
		int Selection = choice.nextInt();
		
		switch(Selection) {
		
		case 1: 
			getChecking();
			break;
			
		case 2:
			getSavings();
			break;
			
		case 3:
			System.out.println("Thank you for using this ATM, Bye. /n");
			break;
			
		default :
			System.out.println("/n" + "Invalid Choice." + "/n");
			getAccountType();
		}
	}
	
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw");
		System.out.println(" Type 3 - Deposit");
		System.out.println(" Type 4 - Exit");
		System.out.println(" Choice: ");
		
		int Selection = choice.nextInt();
		
		switch(Selection) {
		
		case 1:
			System.out.println("Checking Account Balance: " + MoneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM, Bye. /n");
			break;
			
		default :
			System.out.println("/n" + "Invalid Choice." + "/n");
			getChecking();
			
		}
		
		
			
		 			
						
		}
	
	public void getSavings() {
		System.out.println("Checking Account: ");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw");
		System.out.println(" Type 3 - Deposit");
		System.out.println(" Type 4 - Exit");
		System.out.println(" Choice: ");
		
		int Selection = choice.nextInt();

		switch(Selection) {
		
		case 1:
			System.out.println("Savings Account Balance: " + MoneyFormat.format(getSavingsBalance()));
			getAccountType();
			break;
		
		case 2:
			getSavingsWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingsDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM, Bye. /n");
			break;
			
		default :
			System.out.println("/n" + "Invalid Choice." + "/n");
			getChecking();
			
		}
		
					
	}
	
	
	}
	


