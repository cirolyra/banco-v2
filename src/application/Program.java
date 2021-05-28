package application;

import java.util.Locale;
import java.util.Scanner;

import entities.account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		account conta;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)?");
		char answer = sc.nextLine().charAt(0);

		if (answer != 'y') {
			conta = new account(number, holder);
			
		} else {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			conta = new account(number, holder, deposit);
			
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		conta.deposit(value);
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		conta.withdraw(value);
		System.out.println("Update account data: ");
		System.out.println(conta);
		

		sc.close();
	}

}
