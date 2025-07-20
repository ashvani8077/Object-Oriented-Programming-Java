package ATMMachine;

import java.util.Scanner;

public class ATM {
    float Balance;
    int PIN=5674;
    public  void checkPin(){
        System.out.println("Enter your pin: ");
        Scanner sc=new Scanner(System.in);
        int enterPin=sc.nextInt();
        if(enterPin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin!");
        }
    }

    public void menu(){
        System.out.println("Enter your choice" );
        System.out.println("1: Check A/C Balance");
        System.out.println("2: Withdraw Money");
        System.out.println("3: Deposit Money");
        System.out.println("4: Exit");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                showBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            default:
                System.out.println("Thanks for visit!!!");
                break;
        }
    }

    public  void showBalance(){
        System.out.println("Balance: "+Balance);
        System.out.println("========================");
        menu();
    }

    public  void withdrawMoney(){
        System.out.println("Enter amount you want to withdraw");
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        if(money<Balance){
            System.out.println("Withdraw success: "+money);
            Balance=Balance-money;
            System.out.println("========================");
            menu();
        }
        else{
            System.out.println("Indufficient Balance!!");
            System.out.println("========================");
            menu();
        }

    }

    public void depositMoney(){
        System.out.println("How much money you want to deposit: ");
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        Balance=Balance+money;
        System.out.println("Deposite Success");
        System.out.println("========================");
        menu();
    }

    public static void main(String[] args) {
        ATM a=new ATM();
        a.checkPin();
    }
}
