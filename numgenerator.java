import java.util.*;
class numgenerator
{
    Scanner sc =new Scanner(System.in);
     numgenerator()
    {
        
        int num=1+(int)(100*Math.random());
        int m=5;//trials
        System.out.println("_________________________________________");
        System.out.println("\n      Number Guessing Game ");
        System.out.println("_________________________________________");
        System.out.println("\nWelcome to the Number Guessing Game!");
        System.out.println("\nA number is generated between 1 to 100");
        System.out.println("Make the correct guess for the number generated ");

        int guess,i;
        for(i=0;i<m;i++)
        {
            System.out.println("\nGuess the number");
        guess=sc.nextInt();
        if(guess==num)
        {
            System.out.println("Congratulation!!! Your guess is correct. ");
             break;
        }
        
        else if(guess<num && i!=m-1)
        {
            System.out.println("The number is too high than "+guess);
            // break;
        }
        
        else if(guess>num && i!=m-1)
        {
            System.out.println("The number is too low than "+guess);
        }
        }

        if(i==m)
        {
            System.out.println("You have exhausted 5 trials");

            System.out.println("The number was " + num);
        }
        
        System.out.println("\npress 1 to play again");
        System.out.println("press 2 to exit");
        System.out.println("\nEnter your choice");
        int choice ;
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
               new numgenerator();
                break;

            case 2:
                System.out.println("You are now out of the game");
                System.out.println("Well played!!!");
                break;
        }   
    }
    public static void main(String args[])
    {
         new numgenerator();
         
    }
}