/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your gpa is: " + gpa);
        
        System.out.print("Are you a student: ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student: " + isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student.");
        }
        else{
            System.out.println("You are not enrolled.");
        }
        scanner.close();
    }
}
*/
//-------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your fav color: ");
        String color = scanner.nextLine();
        
        System.out.println("You are " + age + " years old.");
        System.out.println("Your fav color is " + color);


        scanner.close();
    }
}
*/
//-----------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Calculate area of a rectangle

        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is " + area + "cm^2");

        scanner.close();
    }
}
*/
//------------------------------------------------------------------------------------------------
/* 
import java.util.Scanner;

public class Main{
    public static void main(String[] agrs){

        // Mad Libs Game

        Scanner scanner = new Scanner(System.in);

        String adj1;
        String noun;
        String adj2;
        String verb;
        String adj3;

        System.out.print("Enter adjective1: ");
        adj1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun = scanner.nextLine();
        System.out.print("Enter adjective2: ");
        adj2 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb = scanner.nextLine();
        System.out.print("Enter adjective3: ");
        adj3 = scanner.nextLine();
        
        System.out.println("Today I went a " + adj1 + " zoo");
        System.out.println("In an exihibit, I saw a " + noun + ".");
        System.out.println(noun + " was " + adj2 + " and " + verb + "!");
        System.out.println("I was " + adj3 + "!");

    }
}
*/
//----------------------------------------------------------------------------------------
/*
public class Main{
    public static void main(String[] args){

        // Arithmetic

        int x = 10;
        int y = 2;
        int z;

        //z = x + y;
        //z= x - y;
        //z = x * y;
        //z = x / y;
        //z = x % y;

        //x += y;
        //x -= y;
        //x *= y;
        //x /= y;
        //x %= y;

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}
*/
//----------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}
*/
//---------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // IF STATEMENTS

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name! ");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        //GROUP 2
        if(age == 0){
            System.out.println("You are a baby!");
        }
        else if(age < 18){
            System.out.println("You are a child!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age >= 65){
            System.out.println("You are a senior!");
        }
        else{
            System.out.println("You haven't been born yet!");
        }

        //GROUP 3
        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are NOT a student!");
        }
        scanner.close();
    }
}
*/
//-----------------------------------------------------------------------------------------------------
/*
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Random random = new Random();

        int number;
        number = random.nextInt();
        System.out.println(number);
    }
}
*/
/*
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Random random = new Random();

        int number;

        number = random.nextInt(1, 6); //1,2,3,4,5

        System.out.println(number);
    }
}
*/
/*
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
*/
/*
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Random random = new Random();

        double number;

        number = random.nextDouble(); //between 0 and 1

        System.out.println(number);
    }
}
*/
/*
import java.util.Random;

public class Main{
    public static void main(String[] args){

        Random random = new Random();

        boolean isHead;

        isHead = random.nextBoolean();

        System.out.println(isHead);

        if(isHead){
            System.out.print("HEADS!");
        }
        else{
            System.out.print("TAILS!");
        }
    }
}
*/
//--------------------------------------------------------------------------------------------------------
/*
public class Main{
    public static void main(String[] args){

        //MATH CLASS

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double result1;
        double result2;
        double result3;
        double result4;
        double result5;
        double result6;
        double result7;
        double result8;

        result1 = Math.pow(2, 3);
        result2 = Math.abs(-5);
        result3 = Math.sqrt(9);
        result4 = Math.round(3.14);
        result5 = Math.ceil(3.14);
        result6 = Math.floor(3.99);
        result7 = Math.max(10, 20);
        result8 = Math.min(10, 20);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Hyphotenus c = Math.sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.print("The hyphotenus (side c) is: " + c + "cm");

        scanner.close();
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //circumference = 2 * Math.PI * radius;
        //area = Math.PI * Math.pow(radius, 2);
        //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        Scanner scanner = new Scanner(System.in);

        double circumference;
        double area;
        double radius;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;

        area = Math.PI * Math.pow(radius, 2);

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("THe area is: %.1fcm^2\n", area);
        System.out.printf("The volume is: %.1fcm^3\n", volume);

        scanner.close();
    }
}
*/
//------------------------------------------------------------------------------------------------------
/*
public class Main{
    public static void main(String[] args){

        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        // specifier-character

        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstletter);
        System.out.printf("You are %d years old.\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old.", name, age);
    }
}
*/
/*
public class Main{
    public static void main(String[] args){

        // .precision

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.2f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);
    }
}
*/
/*
public class Main{
    public static void main(String[] args){

        // .precision

        // + = output a plus
        // , = comma grouping seperator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space is positive 

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price3);

        double price4 = 900.99;
        double price5 = 100000.15;
        double price6 = -54000.01;

        System.out.printf("%,.2f\n", price4);
        System.out.printf("%,.2f\n", price5);
        System.out.printf("%,.2f\n", price6);

        double price7 = 9.99;
        double price8 = 100.15;
        double price9 = -54.01;

        System.out.printf("%(.2f\n", price7);
        System.out.printf("%(.2f\n", price8);
        System.out.printf("%(.2f\n", price9);

        double price10 = 9.99;
        double price11 = 100.15;
        double price12 = -54.01;

        System.out.printf("% .2f\n", price10);
        System.out.printf("% .2f\n", price11);
        System.out.printf("% .2f\n", price12);
    }
}
*/
/*
public class Main{
    public static void main(String[] args){

        // width

        // 0 = zero is padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
*/
//-----------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // COMPOUND INTEREST CALCULATOR

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        //System.out.println("The amount after " + years + "is: $" + amount);
        System.out.printf("Enter the amount after %d years is $%.2f", years, amount);
        scanner.close();
        
    }
}
*/
//-------------------------------------------------------------------------------------------------
/*
public class Main{
    public static void main(String[] args){

        // NESTED IF STATEMENTS

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount %20");
                System.out.println("You get a student discount %10");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount %10");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount %20");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }
        System.out.printf("The price of ticket is: $%.2f", price);
    }
}
*/
//---------------------------------------------------------------------------------------------------
/* 
public class Main{
    public static void main(String[] args){

        // STRING METHODS

        String name = "Password";
        /*
        //int length = name.length();
        //char letter = name.charAt(1);
        //int index = name.indexOf(" ");
        //int lastIndex = name.lastIndexOf("o");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("o", "a");
        */
        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }
        */
        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any spaces");
        }
        */
        /* 
        if(name.equals("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
        */
        /* 
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
        */
       /*
    }
}
*/
//------------------------------------------------------------------------------------------------------
/*
public class Main{
    public static void main(String[] args){

    //SUBSTRINGS

        String email = "yigitalin@gmail.com";
        //String username = email.substring(0, 9);
        //String domain = email.substring(9, 19);
        //String domain = email.substring(9);
        //String username = email.substring(0, email.indexOf("@"));
        //String domain = email.substring(email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);
        //System.out.println(username);
        System.out.println(domain);
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@"));

        System.out.println("Your username is: " + username);
        System.out.println("Your domain is: " + domain);

        scanner.close();
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }
        scanner.close();
    }
}
*/
//---------------------------------------------------------------------------------------------------------
/* 
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // HEIGHT CONVERSION PROGRAM

        // Declare variables
        // welcome message 
        // prompt for user choice
        // option 1 convert lbs to kgs
        // option 2 convert kgs to lbs
        // else print not a valid choice

        Scanner scanner = new Scanner(System.in);

        Double weight;
        Double newWeight;
        int choice;

        System.out.println("***HEIGHT CONVERSION PROGRAM***");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Enter an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs: %.2f", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs: %.2f", newWeight);
    }
    else{
        System.out.println("That was not a valid choice");
    }
    scanner.close();
}
}
*/
//---------------------------------------------------------------------------------------------------------
/*
public class Main{
    public static void main(String[] args){

        // TERNARY OPERATOR
        // variable = (condition) ? ifTrue : ifFalse;

        /*
        int score = 70;

        if(score >= 60){
            System.out.println("PASS!");
        }
        else{
            System.out.println("FAIL!");
        }
        */
        /*
        int score = 70;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.print(passOrFail);
        */
        /*
        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.print(evenOrOdd);
        */
        /*
        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M" : "P.M";

        System.out.print(timeOfDay);
        */
        /*
        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.print(taxRate);
        */
       /*
    }
}
*/
//--------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // TEMPERATURE CONVERTION
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit: (C or F) ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1fdegree%s", newTemp, unit);


    }
}
*/
//------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //ENHANCED SWITCH

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("Enter a day: ");
        day = scanner.nextLine();

        if(day.equals("Monday")){
            System.out.print("It's a weekday!");
        }
        else if(day.equals("Tuesday")){
            System.out.print("It's a weekday!");
        }
        else if(day.equals("Wednesday")){
            System.out.print("It's a weekday!");
        }
        else if(day.equals("Thursday")){
            System.out.print("It's a weekday!");
        }
        else if(day.equals("Friday")){
            System.out.print("It's a weekday!");
        }
        else if(day.equals("Saturday")){
            System.out.print("It's a weekend!");
        }
        else if(day.equals("Sunday")){
            System.out.print("It's a weekend!");
        }
        else{
            System.out.print(day + " is not a day!");
        }
        scanner.close();
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("Enter a day: ");
        day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It's a weekday!");
            case "Saturday", "Sunday" -> 
                System.out.println("It's a weekend!");
            default -> System.out.println(day + " is not a day!");
        }
        scanner.close();
    }
}
*/
//---------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // CALCULATOR PROGRAM

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+,-,*,/,^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.print("Cannot divide by zero!");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
            }
            if(validOperation){
                System.out.print(result);
            }
            scanner.close();
        }
    }
*/
//-------------------------------------------------------------------------------------------------------------
/*
public class Main{
    public static void main(String[] args){
        
        //LOGICAL OPERATORS

        int temp = -10;
        boolean isSunny = false;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD!");
            System.out.println("It is SUNNY outside!");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is GOOD!");
            System.out.println("It is CLOUDY outside!");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad!");
        }
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        Scanner scanner = new Scanner(System.in);
        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.print("Username must be between 4-12 characters.");   
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.print("Username must not contains spaces or underscores");
        }
        else{
            System.out.print("Welcome " + username);
        }
        scanner.close();
    }
}
*/
//----------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // WHILE LOOPS

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
        scanner.close();
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.print("You have quit the game!");
        scanner.close();
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age can't be negative.");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.print("You are " + age + " years old.");
        scanner.close();
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do{
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();
        }
        while(number < 1 || number > 10);

        System.out.println("You picked " + number);
        scanner.close();
    }
}
*/
//-----------------------------------------------------------------------------------------------------
/*
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,11);

        System.out.println("***NUMBER GUESSING GAME***");
        System.out.println("Guess a number between 1-10: ");

        do{
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            attempts++;

        if(guess < randomNumber){
            System.out.println("TOO LOW! Try again!");
        }
        else if(guess > randomNumber){
            System.out.println("TOO HIGH! Try again!");
        }
        else{
            System.out.println("CORRECT! The number was " + randomNumber);
            System.out.println("# of attempts: " + attempts);
        }
        }
        while(guess != randomNumber);

        scanner.close();
    }
}
*/
/*
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("***NUMBER GUESSING GAME***");
        System.out.printf("Guess a number between %d-%d:\n", min, max);

        do{
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again!");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again!");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        }
        while(guess != randomNumber);

        scanner.close();
    }
}
*/
//---------------------------------------------------------------------------------------------------------

public class Main{
    public static void main(String[] args){

        System.out.println("Hello World!");
    }
}
