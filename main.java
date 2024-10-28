class ClassName {
    public static void main(String arg[]) {
        // Data types
        int var = 10; // number , 4 byte
        byte bt = 2; // number , 1 byte
        short st = 34; // nu,mber , 2 byte
        long lg = 3333333333L; // number , 8 byte

        char ch = 'A'; // character , 2 byte
        boolean bool = true; // boolean , 1 byte
        float ft = 10.45f; // number , 4 byte
        double db = 34.34; // number , 8 byte

        // multiple variables
        int a = 10, b = 20, c = 30;
        int x; // variable declaration
        int y, z; // variable declaration
        x = 10; // variable initialization
        y = 20; // variable initialization
        z = 30; // variable initialization
        System.out.println("Hello World");
        System.out.println(x + y + z);
        System.out.println("The value of y is " + y);

        // String
        String name = "Ellis"; // String, length = 5 byte
        System.out.println(name);

        // Math Class
        int max = Math.max(10, 20);
        Math.min(10, 20);
        int abs = Math.abs(-10);
        double ceil = Math.ceil(10.5);
        double floor = Math.floor(10.5);
        float round = Math.round(10.5);

        System.out.println("The value of max is " + max);
        System.out.println("The value of abs is " + abs);
        System.out.println("The value of ceil is " + ceil);
        System.out.println("The value of round is " + round);
        System.out.println("The value of floor is " + floor);

        // Java boolean
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);

        // ARITHMETIC OPERATORS
        int num1 = 10, num2 = 20;
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println("The value of sum is " + sum);
        System.out.println("The value of sub is " + sub);
        System.out.println("The value of mul is " + mul);
        System.out.println("The value of div is " + div);
        System.out.println("The value of mod is " + mod);

        // Operator precedence , ==> *, /, %, +, -
        int num3 = 5 * 10;
        System.out.println("The value of num3 is " + num3);

        System.out.println("The multiplation of " + 5 * 10);
        System.out.println("The multiplation of " + (5 + 5 * 10));
        System.out.println("The multiplation of " + (5 + 5 + 10));

        // Relational operators
        int num4 = 10, num5 = 20;
        System.out.println(num4 > num5);
        System.out.println(num4 < num5);
        System.out.println(num4 == num5);
        System.out.println(num4 != num5);

        /*
         * Logical operators that return Boolean values (true or false)
         * > greater than
         * < less than
         * >= greater than or equal to
         * <= less than or equal to
         * == equal to
         * != not equal to
         * 
         */

        System.out.println(5 > 10);
        System.out.println(5 < 10);

        // logical operators
        System.out.println(10 > 5 && 5 > 10);
        System.out.println(10 > 5 || 5 > 10);
        System.out.println(!(10 > 5));

        /*
         * & AND
         * | OR
         * ^ XOR
         * ! NOT
         * 
         */
        System.out.println(5 >= 5 & 5 <= 10);
        System.out.println(5 >= 5 | 5 < 10);
        System.out.println(!(5 >= 5));

        // Conditional statements if - else
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else
            System.out.println("Good evening.");

        // Nested if esle statements
        // task write a program to determine discount on ticket based on age
        /*
         * age <= 12 = 75%
         * age 13-18 = 50%
         * age > 18 = 10%
         */

        int age = 18;
        if (age < 12)
            System.out.println("Discount is 75%");
        else if (age >= 13 && age <= 18)
            System.err.println("Discount is 50%");
        else if (age > 18)
            System.out.println("Discount is 10%");
        else
            System.out.println("Invalid age");

        // switch case statement
        switch (age) {
            case 12:
                System.out.println("Discount is 75%");
                break;
            case 13:
                System.out.println("Discount is 50%");
                break;
            case 18:
                System.out.println("Discount is 10%");
                break;
            default:
                System.out.println("Invalid age");
                break;
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }

        // Loops
        // while
        int i = 1;
        while (i <= 5) {
            System.out.println("While " + i);
            i++; // increment operator i = i + 1
        }

        // do while
        int j = 1;
        do {
            System.out.println("Do While " + j);
            j++;
        } while (j <= 5);

        // for loop
        /*
         * For loop is used to iterate over a block of code a fixed number of times
         * for (initialization; condition; increment/decrement)
         * for (statement1 ; statement2 ; statement3)
         */
        for (int k = 1; k <= 5; k++) {
            System.out.println("For" + k);
        }

        for (int l = 0; l <= 5; l++) {
            System.out.println("The value of l is " + l);
        }
    }
}

// Java execution

// 1. Write code
// 2 . Compile Code (JKD Compiler read codes. Chekss Error,)
// 3. Compiler Generates Byte Code file with same name as class name
// 4.Byte Code is executed by JVM(Java Virtual Machine)