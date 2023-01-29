// Name of programmer:Dustin Petersen
// Name of program: Hello World
// Date started: 1/24/2023
//
// Description of program: Ask user for her first name and echo back in a greeting.
// Input/Processing/Output: user input in console, output is System.out in console
// Purpose of program: CIT-63 assignment Spring 2023
//
// References:
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Objects;
import java.util.Scanner;
public class HelloWorld01 {
    public static void main(String[] args) {
        // Variable declarations
        String friend = "";
        String greeting = "";
        String response = "";
        Scanner userInput = new Scanner(System.in);

        System.out.println("\n\n");
        // Input: get user name
        System.out.println("Hello friend, enter your preferred name: ");
        friend = userInput.nextLine();

        // Processing: Create a greeting
        greeting = "Hello " + friend + ", I hope you are doing well today!";

        // Output:
        System.out.println("\n\n" + greeting + "\n\n");

        // Input: asking if friend is doing well
        Scanner answerInput = new Scanner(System.in);


        System.out.println("Are you doing well today?");
        response = answerInput.nextLine();

        // If else statement to make decision logic on question that was asked
        if (Objects.equals(response,  "yes")) {
            System.out.println("Awesome! I am doing well also!");
        } else if(Objects.equals(response, "no")) {
            System.out.println("Aww, I hope things get better!");
        } else {
            System.out.println("There seems to be some sort of error!");
        }

    }
}