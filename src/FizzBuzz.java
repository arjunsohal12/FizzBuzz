/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 0;
        while(i < 100) {
            i = doFizzBuzz(i);

        }
    }

    private static int doFizzBuzz(int i) {
        String output = "";
        if (i % 3 == 0) {
            output+= "fizz";
        }
        else if (i % 5 == 0){
            output+="buzz";
        }
        else {
            output = String.valueOf(i);
        }
        i++;
        System.out.println(output);
        return i;
    }
}
