import java.util.Scanner;

public class Main {

    static String mySurname = "Zubovich";


    public static void main(String[] args) {
        sumOfNumbers();
//        nextIntIssue();
//        ifClause();
//        ternary();
//        switchCase();
//        whileOperator();

//        String[] books = new String[5];
//        books[0] = "Harry Potter";
//        books[1] = "Crime and Punishment";
//        books[2] = "Silmarillion";
//        books[3] = "Dune";
//        books[4] = "Java for dummies";

//        for (int i = 0; i < books.length; i++) {
//            System.out.printf("Book %d: %s\n", i + 1, books[i]);
//        }
//
//        for(String book : books) {
//            System.out.println(book);
//        }
//
//        System.out.println(books[9]);
//        books[3] = "Java for Dummies";
//
//        System.out.println(books[3]);
//
//
//        String[] movies = new String[] { "1+1", "Avatar", "Titanic", "Full Metal Jacket" };

//        String[][] students = new String[][] {
//                { "Vadim", "Zubovich" },
//                { "Vasiliy", "Pupkin" },
//                { "Evlampiy", "Sidorov" }
//        };
//
//        System.out.printf("Name: %s, Surname: %s", students[0][0], students[0][1]);


    }

    public static void method() {
        mySurname = "skjvhb";
        System.out.println("Method output");
    }

    public static void ifClause() {
        System.out.print("Please enter your score: ");
        int userScore = new Scanner(System.in).nextInt();

        if (userScore >= 70) {
            System.out.println("You get an A");
        } else if (userScore >= 50) {
            System.out.println("You get a B");
        } else if (userScore >= 30) {
            System.out.println("You get a C");
        } else {
            System.out.println("You get a D");
        }

        System.out.println("End of Program");
    }

    public static void ternary() {
        System.out.print("Please enter your score: ");
        int userScore = new Scanner(System.in).nextInt();

        String result = userScore >= 70 ? "Congrats!" : "LOOSER!";

        System.out.println(result);
    }

    public static void switchCase() {
        System.out.println("Choose your language:\n1 - English\n2 - Русский\n3 - Italiano\n4 - Espanol");
        int selectedLanguage = new Scanner(System.in).nextInt();

        String hello;

        hello = switch (selectedLanguage) {
            case 1 -> {
                System.out.println("You've chosen English");
                yield "Hello!";
            }
            case 2 -> "Привет!";
            case 3 -> "Ciao!";
            case 4 -> "Hola!";
            default -> "Sorry, wrong selection";
        };
    }

    public static void whileOperator() {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);

         while (userInput.isEmpty()) {
            System.out.println("Please enter something");
            userInput = scanner.nextLine();
        }

        System.out.println("Thanks, Bye!");
    }

    public static void nextIntIssue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter a string");
        String userString = scanner.nextLine();

        System.out.println(userInput + " " + userString);
    }

    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int userInput = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i <= userInput; i++) {
            sum += i;
        }

        System.out.printf("Sum of numbers from 0 to %d is %d", userInput, sum);
    }
}