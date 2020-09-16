public class variables {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum " + "of " + x + " and " + y + " is " + sum);
        // xy
        int prd = x * y;
        System.out.println("Product " + "of " + x + " and " + y + " is " + prd);
        // x/y , y/x , x % y
        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        // exp NOTE the difference between two expression
        int exp1 = x * y / x + y;
        int exp2 = (x * y) / (x + y);
        System.out.println(exp1);
        System.out.println(exp2);
        // The precedence of *, /, % is same but greater than +,-

        // Power
        int exp3 = (int) Math.pow(2, 3);
        System.out.println(exp3);
        System.out.println(Math.pow(2, 3));

    }

}
