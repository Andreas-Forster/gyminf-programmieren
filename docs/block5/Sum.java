public class Sum {

    static int calculateSum( int i ) {
        if ( i > 1 ) {
            return i + calculateSum(i - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int result = calculateSum(3);
        System.out.println(result);
    }
}