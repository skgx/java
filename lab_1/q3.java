package lab_1;
import java.util.*;
public class q3 {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = s.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }

        System.out.println("factorial is "+fact);
    }
}
