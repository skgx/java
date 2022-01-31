package lab_1;
import java.util.*;
public class q2 {

    public static void main(String[] args) {
        float n,m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length and breadth ");
        n = s.nextFloat();
        m=s.nextFloat();

        float area=m*n;
        float perimeter=2*(m+n);
        System.out.println("area is "+area);
        System.out.println("perimeter is "+perimeter);
    }
}
