import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // figure out the largest number;
        // firsr we will assume one variable of value to be maximum
        // and we are going to check with other variable b
        // if b is max the max=b; and if c>max then max=c;

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
