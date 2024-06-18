public class factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = fact(num);
        System.out.println("Fact Of Num is  = " + fact);
    }
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }}}
