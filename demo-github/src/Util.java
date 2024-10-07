public class Util {

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

//    static int calculateSum(int a, int b) {
//        return a + b;
//    }
//
//    static int calculateSum(int a, int b, int c) {
//        return a + b + c;
//    }

    private static int calculateSum(int a, int... numbers) {
        int sum = a;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

//    static float calculateSum(float a, float b) {
//        return a + b;
//    }

    static int calculateSum(int a, String b) {
        return a + Integer.parseInt(b);
    }

    public static void changeString(String myStr) {
        myStr = "New string";

    }

    public static void changeString(MyString myStr) {
        myStr.value = "New string";

    }
}
