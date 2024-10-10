import enums.Browser;
import geometry.Circle;
import geometry.GeometricShape;
import geometry.Rectangle;
import geometry.Square;
import goods.dolls.Doll;
import goods.dolls.DollHead;
import goods.dolls.DollOutfit;
import goods.dolls.EyeColor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String mySurname = "Zubovich";

    public static final double PI = 3.1415923;

    public static void main(String[] args) {

//        writeToFile();
        try {
            readFromFile();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, no such file");
        }
        //        System.out.println("Starting program");
//
//        try {
//            int x = Integer.parseInt("10");
//            int a = 10 / 0;
//            System.out.println(a);
//        } catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero ");
//        } catch (NumberFormatException e) {
//            System.out.println("Cannot cast string to int " + e.getMessage());
//        }
//
//        Circle circle12 = new Circle(12);
//        Circle circle35 = new Circle(35);
//        Square square = new Square(10);
//        Rectangle rectangle = new Rectangle(15, 98);
//
//        addUpAreas(circle12, circle35, square, rectangle);


//        createDolls();
//
//        String myOldString = "old str";
//        MyString myInitialString = new MyString("old str");
//
//        System.out.println(myInitialString.value);
//
//        Util.changeString(myInitialString);
//
//        System.out.println(myInitialString.value);
//
//
////        String myString = "This is my string";
////
//////        int sumOfTenAndFive = Util.calculateSum(1);
////
////        String.format(";skjghsljdgh %d", 10);
////
//        final RubberDuck yellowDuckSizeS = new RubberDuck("yellow", "S", 4.99);
//        //
//        goods.ducks.RubberDuck greenDuck = new goods.ducks.RubberDuck("green", "M");
//
//        yellowDuckSizeS.price = 5.99;
//
//        System.out.println(yellowDuckSizeS.getColor());
//
//        System.out.println(yellowDuckSizeS.getColor());
//
//        yellowDuckSizeS.printInfo();
//
//        yellowDuckSizeS.addToCart(4);
//
//        Util.sayHello("Vadim");
//        Util.sayHello("Vasili");
//        Util.sayHello("Aleksandra");


//        sumOfNumbers();
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

        for (int i = 0; i <= userInput; i++) {
            sum += i;
        }

        System.out.printf("Sum of numbers from 0 to %d is %d", userInput, sum);
    }

    public static void createDolls() {
        DollHead headForLucy = new DollHead("Blonde", EyeColor.GREY, false);
        DollOutfit outfitForLucy = new DollOutfit("Dress", "Red");
        Doll lucy = new Doll(headForLucy, outfitForLucy, "White", "Lucy", false, 15);

        System.out.println(lucy.getDollInfo());

        Doll debbie = new Doll("Black", EyeColor.BLUE, false, "suit", "Blue",
                "Black", "Debbie", false, 19.99);

        System.out.println(debbie.getDollInfo());
    }

    public static void addUpAreas(GeometricShape... shapes) {
        double sum = 0;

        for (GeometricShape shape : shapes) {
            sum += shape.getArea();
            shape.printShapeInfo();
        }

        System.out.println("Area of all the indicated circles is: " + sum);
    }

    public static void enumDemo() {
        Browser browser = Browser.firefox;

        switch (browser) {
            case chrome -> System.out.println("You've chosen Chrome");
            case firefox -> System.out.println("You've chosen Firefox");
            case safari -> System.out.println("You've chosen Safari");
            case edge -> System.out.println("You've chosen Edge");
            case ie -> System.out.println("You've chosen Internet Explorer");
        }
    }

    public static void collections() {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vadim");
        names.add("Jake");
        names.add("Jill");
        names.add("John");
        names.add(2, "Jackie");
        names.add("Eugene");


        List<String> namesThatStartWithJ = names.stream().filter(name -> name.startsWith("J"))
                .sorted().toList();

        namesThatStartWithJ.forEach(System.out::println);
        System.out.println("==================================");
        names.forEach(System.out::println);


//        for(String name : names) {
//            System.out.println(name);
//        }
    }

    public static void writeToFile() {
        try {
            FileWriter file = new FileWriter("D:\\my_new_file.txt", true);
            file.write("Hello, again this is my file data\n");
            file.write("My file is appended\n");
            file.close();
        } catch (IOException e) {
            System.out.println("Sorry, cannot write to file. Full error message: " + e.getMessage());
        }

    }

    public static void readFromFile() throws FileNotFoundException {
        File file = new File("D:\\my_new_file.txt");
        Scanner fileScanner = new Scanner(file);
        ArrayList<String> dataFromFile = new ArrayList<>();

        while (fileScanner.hasNext()) {
            dataFromFile.add(fileScanner.nextLine());
        }

        dataFromFile.forEach(System.out::println);
    }
}