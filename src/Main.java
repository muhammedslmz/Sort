import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n1,n2,n3;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 3 number you want to sort.");
        System.out.print("Number 1: ");
        n1=input.nextInt();

        System.out.print("Number 2: ");
        n2=input.nextInt();

        System.out.print("Number 3: ");
        n3=input.nextInt();

        if(n1>n2 && n1>n3)
        {
            if(n2>n3)
            {
                System.out.println(n1+">"+n2+">"+n3);
            }
            else if(n2==n3)
            {
                System.out.println(n1+">"+n2+"="+n3);
            }
            else
            {
                System.out.println(n1+">"+n3+">"+n2);
            }
        }
        else if(n1>n2 && n1<n3)
        {
            System.out.println(n3+">"+n1+">"+n2);
        }
        else if (n1<n2 && n1<n3)
        {
            if(n2>n3)
            {
                System.out.println(n2+">"+n3+">"+n1);
            }
            else if(n2==n3)
            {
                System.out.println(n2+"="+n3+">"+n1);
            }
            else
            {
                System.out.println(n3+">"+n2+">"+n1);
            }
        }
    }
}
