public class Reduce {
    public static void main(String[] args) {
        int n = 125;
        while(n != 0) {
            if (n % 2 == 0) {
                n = n/2;
            }
            else {
                n--;
            }
            System.out.println(n);
        }
    }
}
