import java.util.Scanner;

public class Multiples_of_number {

    public static int Multiples(int n,int k)
    {
        if(k==1)
        {
            System.out.println(n);
            
        }

        else
        {
            Multiples(n, k-1);
            System.out.println(n*k);
        }
        return k;
    }
    
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.print("Enter a value of K: ");
        int k = sc.nextInt();

        int result = Multiples(n,k);
        System.out.println("The Multiples of number is: " + result);
    }
}
