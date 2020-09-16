import java.util.*;

public class takingInput {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String name = scn.nextLine();
        System.out.println("Dear " + name + " Here is the Counting.");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

}
