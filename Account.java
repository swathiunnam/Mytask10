package oops;

import java.util.Scanner;

public class Account {
    int ano;
    String name,type;
     double balance;
     void details(int n,String nm,String t,double b){
        ano=n;
        name=nm;
        type=t;
        balance=b;
     }
     void show(){
        System.out.println(ano+" "+name+" "+type+" "+balance);
     }
     void  deposit(double b){
           balance+=b;
           System.out.println("Deposit amount:"+b);
     }
    void withdraw(double b){
        if(balance<b){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=b;
            System.out.println("withdraw amount"+b);
        }
    }
        void checkAmount(){
            System.out.println("Balance is"+balance);
        }

    
   

    public static void main(String[] args) {
        Account a1=new Account();
        a1.details(123456,"swathi","savings",10000);
        a1.show();
        a1.deposit(5000); 
        a1.withdraw(2000);
        a1.checkAmount();

        

        
    }
    
}
