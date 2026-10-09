public class Day1CoreJava {
    public static void main(String[] args) {
        demonstrateVariablesAndTypes();
        demonstrateCasting();
        demonstrateOperators();
        demonstrateConditionals();
        demonstrateLoops();
        demonstrateJumpStatements();
        demonstrateMethods();
        demonstrateArrays();
        demonstrateStrings();
        System.out.println("Prime numbers up to 20:");
        printPrimes(20);
        System.out.println("Multiplication table of 7:");
        printMultiplicationTable(7);
    }

    private static void demonstrateVariablesAndTypes() {
        int age = 21;
        double percentage = 87.5;
        char grade = 'A';
        boolean learning = true;
        String name = "Yathin";
        int[] scores = {85, 90, 88};

        System.out.println("Variables: " + age + ", " + percentage + ", " + grade + ", " + learning);
        System.out.println("Non-primitive values: " + name + ", " + scores.length);
    }

    private static void demonstrateCasting() {
        int integerValue = 25;
        double widenedValue = integerValue;
        double decimalValue = 25.75;
        int narrowedValue = (int) decimalValue;

        System.out.println("Implicit casting: " + widenedValue);
        System.out.println("Explicit casting: " + narrowedValue);
    }

    private static void demonstrateOperators() {
        int a = 12;
        int b = 5;

        System.out.println("Arithmetic: " + (a + b) + ", " + (a - b) + ", " + (a * b) + ", " + (a / b) + ", " + (a % b));
        System.out.println("Relational: " + (a > b) + ", " + (a == b));
        System.out.println("Logical: " + (a > 0 && b > 0) + ", " + (a < 0 || b > 0));
        System.out.println("Bitwise: " + (a & b) + ", " + (a | b) + ", " + (a ^ b));
    }

    private static void demonstrateConditionals() {
        int number = 12;
        String result;

        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "zero";
        }

        int dayNumber = 3;
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Unknown";
        }

        System.out.println("Conditional result: " + result);
        System.out.println("Switch result: " + dayName);
    }

    private static void demonstrateLoops() {
        int forSum = 0;
        for (int i = 1; i <= 5; i++) {
            forSum += i;
        }

        int whileValue = 1;
        int whileProduct = 1;
        while (whileValue <= 4) {
            whileProduct *= whileValue;
            whileValue++;
        }

        int doWhileValue = 1;
        int doWhileSum = 0;
        do {
            doWhileSum += doWhileValue;
            doWhileValue++;
        } while (doWhileValue <= 4);

        System.out.println("For loop sum: " + forSum);
        System.out.println("While loop product: " + whileProduct);
        System.out.println("Do-while loop sum: " + doWhileSum);
    }

    private static void demonstrateJumpStatements() {
        int continueSum = 0;
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            continueSum += i;
        }

        int breakValue = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            breakValue = i;
        }

        System.out.println("Continue result: " + continueSum);
        System.out.println("Break result: " + breakValue);
        System.out.println("Return result: " + square(6));
    }

    private static void demonstrateMethods() {
        System.out.println("Method result: " + add(8, 4));
        System.out.println("Overloaded method result: " + add(8.5, 4.5));
    }

    private static void demonstrateArrays() {
        int[] numbers = {4, 7, 1, 9, 2};
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int total = 0;
        int maximum = numbers[0];
        for (int number : numbers) {
            total += number;
            maximum = Math.max(maximum, number);
        }

        System.out.println("Array total: " + total);
        System.out.println("Array maximum: " + maximum);
        System.out.println("Matrix values:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static void demonstrateStrings() {
        String text = "Java Basics";
        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Contains Java: " + text.contains("Java"));
        System.out.println("Reversed: " + reversed);
        System.out.println("Immutable original: " + text);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printPrimes(int limit) {
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printMultiplicationTable(int number) {
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(number + " x " + multiplier + " = " + number * multiplier);
        }
    }

    private static int square(int number) {
        return number * number;
    }

    private static int add(int first, int second) {
        return first + second;
    }

    private static double add(double first, double second) {
        return first + second;
    }
}
