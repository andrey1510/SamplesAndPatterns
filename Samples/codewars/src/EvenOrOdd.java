public class EvenOrOdd {
    private static String even_or_odd(int number) {

       // % - остаток от деления
        if (number%2 == 0) {
            return "Even";
        } else {
           return  "Odd";
        }



    }

    public static void main(String[] args) {

        System.out.println(even_or_odd(6));
    }
}
