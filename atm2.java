import java.util.Scanner;
class atm 
{
    
    public static void main(String args[])
    {
    int choice,accno,pno;
    double depo,wd;
    userbank ub=new userbank();
    System.out.println("________________________________________");
    System.out.println("\n||| Welcome to Atm Management System|||");
    System.out.println("________________________________________\n");
    // System.out.println("Enter your choice");
    Scanner sc = new Scanner(System.in);
    //choice= sc.nextInt();
    while(true)
    {
    System.out.println("1.Deposit");
    System.out.println("2.Withdraw");
    System.out.println("3.Check Balance");
    System.out.println("4.Exit");
     System.out.println("\nEnter your choice");
     choice= sc.nextInt();
    switch(choice)
    {
        case 1:
            System.out.println("Enter pin number ");
            pno=sc.nextInt();
            System.out.println("Enter the amount to be deposited ");
            depo=sc.nextDouble();
            ub.deposit(depo);
            break;
        
        case 2:
            System.out.println("\nEnter pin number ");
            pno=sc.nextInt();
            System.out.println("Enter the amount you want to withdraw ");
            wd=sc.nextDouble();
            ub.withdraw(pno,wd);
            break;
        
        case 3:
            ub.check();
            break;

        case 4:
            System.exit(0);
            break;
        
        default:
            System.out.println("Incorrect choice");

    }
    }
    }
}
class userbank 
{
    double Balance=1000;
     public void deposit(double dep)
     {
        Balance+=dep;
        System.out.println("\nThe Amount deposited is " +dep+" and the balance is "+Balance +"\n");

     }

     public void withdraw(int accno,double withd)
     {
       
        if(withd<=Balance-1000)
        {
            Balance-=withd;
            System.out.println("\nWithdrawal successful. New balance: " + Balance +"\n");
        }
        else{
             System.out.println("\nWithdrawal failed. Insufficient funds or would fall below 1000 rupees.\n");
         
        }
     }

     public void check()
     {
        System.out.println("\nYour account has a balance of rupees "+Balance +"\n");
     }
}
