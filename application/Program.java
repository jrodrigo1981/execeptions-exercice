package com.rodrigo.aula146.application;

import java.util.Locale;
import java.util.Scanner;

import com.rodrigo.aula143.model.exceptions.DomainException;
import com.rodrigo.aula146.model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String houder = sc.nextLine();
			System.out.print("initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			double limit = sc.nextDouble();
			Account account = new Account(number, houder, balance, limit);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println(account);
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
