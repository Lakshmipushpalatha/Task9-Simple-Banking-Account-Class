import java.util.*;
import java.util.*;
class BankAccount
{
  private String accountNumber;
  private String holderName;
  private double balance;
  public BankAccount(String accountNumber,String holderName,double initialBalance)
  { 
    this.accountNumber=accountNumber;
    this.holderName=holderName;
    if(initialBalance>=0)
    {
      this.balance=initialBalance;
    }
    else
    {
      this.balance=0;
    }
  }
  public void deposit(double amount)
  {
    if(amount>0)
    {
      balance+=amount;
      System.out.println("deposit successful!");
    }
    else
    System.out.println("Invalid deposit amount");
  }
  public void withdraw(double amount)
  {
    if(amount<=0)
    {
      System.out.println("Invalid withdraw amount");
    }
    else if(amount>balance)
    {
      System.out.println("Insufficient balance");
    }
    else
    {
    balance-=amount;
    System.out.println("Withdraw successful");
    }
  }
  public double getBalance()
  {
    return balance;
  }
  public void displayDetails()
  {
    System.out.println("account Number :" +accountNumber);
    System.out.println("Holder Name :" +holderName);
    System.out.println("Balance :" +getBalance());
  }
}
public class Task9
{
  public static void main(String[]args)
  {
    BankAccount account =new BankAccount("123456" , "Lakshmi" , 5000.0);
    account.displayDetails();
    account.deposit(1000.0);
    System.out.println("Balance after deposit: " +account.getBalance());
    account.withdraw(2000.0);
    System.out.println("Balance after withdraw: " +account.getBalance());
  }
}