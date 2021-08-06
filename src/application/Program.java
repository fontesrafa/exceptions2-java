package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Program {

       public static void main(String[] args) {


              Scanner sc = new Scanner(System.in);

              System.out.println("Enter account data:");
              System.out.print("Number: ");
              Integer number = sc.nextInt();
              System.out.print("Holder: ");
              sc.nextLine();
              String holder = sc.nextLine();
              System.out.print("Initial balance: ");
              Double balance = sc.nextDouble();
              System.out.print("Withdraw limit: ");
              Double withdrawLimit = sc.nextDouble();

              Account account = new Account(number, holder, balance, withdrawLimit);

              System.out.print("Enter amount for withdraw: ");
              sc.nextLine();
              Double withdraw = sc.nextDouble();

              try {
                     account.withdraw(withdraw);
                     System.out.println("New balance: " + account.getBalance());
              } catch (DomainException e) {
                     System.out.println("Withdraw error: " + e.getMessage());
              }
              sc.close();
       }
}
