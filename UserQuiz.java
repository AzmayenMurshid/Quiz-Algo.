package com.example.ICS3U;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class UserQuiz {
    private static final ArrayList<String> nations = new ArrayList<String>(); // Initializing array list
    public static void main(String[] args) {

        //Populating array list with nations
        String[] countries = new String[]{ //Creating array of countries
                "Canada", "United States", "Mexico", "Brazil", "Argentina",
                "Chile", "Columbia", "Peru", "Venezuela", "Uruguay"};

        nations.addAll(Arrays.asList(countries)); //Adding countries to array list

        // User Information
        System.out.println("Enter Username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        while (username.equals("")) {
            System.out.println("\n\nPlease enter a valid username!");
            main(args); //Recursive function call
        }
        System.out.println("\nWelcome " + username + "!");
        System.out.println("\nLet's play a geography trivia game!");

        int Score = 0;

        for(int i = 0; i < 10; i++) { // Main game loop
            Random random = new Random();
            int randomNumber = random.nextInt(nations.size()); // Randomizing questions
            Scanner input = new Scanner(System.in); // Scanner initialization
            System.out.printf("\nWhat is the capital of %s%n",nations.get(randomNumber)); //String formation
            switch (nations.get(randomNumber)) { // Switch statement to check the correct answer for multiple scenarios
                // Case statements for multiple scenarios
                case "Canada" -> {
                    System.out.println("""
                            A. Ottawa
                            B. Toronto
                            C. Vancouver
                            D. Montreal""");

                    String answer = input.nextLine();
                    if (answer.equals("A") || answer.equals("a") || answer.equals("Ottawa") || answer.equals("ottawa")) {
                        // or statements for multiple answers
                        System.out.println("\nCorrect!\n\n");
                        Score++; // Score increment
                    }
                    else {
                        System.out.println("\nIncorrect! the answer was Ottawa\n\n");
                    }
                    break;
                }
                case "United States" -> {
                    System.out.println("""
                            A. Washington
                            B. New York
                            C. Los Angeles
                            D. Chicago""");

                    String answer = input.nextLine();
                    if (answer.equals("A") || answer.equals("a") || answer.equals("Washington") || answer.equals("washington")) {
                        System.out.println("\nCorrect!\n\n");
                        Score++;
                    }
                    else {
                        System.out.println("\nIncorrect! the answer was Washington\n\n");
                    }
                    break;
                }
                case "Mexico" -> {
                    System.out.println("""
                            A. Mexico City
                            B. Merida
                            C. Cancun
                            D. Oaxaca""");
                    String answer = input.nextLine();
                    if (answer.equals("A") || answer.equals("a") || answer.equals("Mexico City") || answer.equals("mexico city")) {
                        System.out.println("\nCorrect!\n\n");
                        Score++;
                    }
                    else{
                        System.out.println("\nIncorrect! the answer was Mexico City\n\n");
                    }
                    break;
                }
                case "Brazil" -> {
                    System.out.println("""
                            A. Sao Paulo
                            B. Reo de Janeiro
                            C. Brasilia
                            D. Belo Horizonte""");

                    String answer = input.nextLine();
                    if (answer.equals("C") || answer.equals("c") || answer.equals("Brasilia") || answer.equals("brasilia")) {
                        System.out.println("\nCorrect!");
                        Score++;
                    }
                    else {
                        System.out.println("\nIncorrect! the answer was Brasilia\n\n");
                    }
                    break;
                }
                case "Argentina" -> {
                    System.out.println("""
                            A. Tucuman
                            B. Cordoba
                            C. Rosario
                            D. Buenos Aires""");

                    String answer = input.nextLine();
                    if(answer.equals("D") || answer.equals("d") || answer.equals("Buenos Aires") || answer.equals("buenos aires")) {
                        System.out.println("\nCorrect!\n\n");
                        Score++;
                    }
                    else{
                        System.out.println("\nIncorrect! the answer was Buenos Aires\n\n");
                    }
                    break;
                }
                case "Chile" -> {
                    System.out.println("""
                            A. Valparaiso
                            B. Santiago
                            C. Antofagasta
                            D. Vina del Mar""");

                    String answer = input.nextLine();
                    if (answer.equals("B") || answer.equals("b") || answer.equals("Santiago") || answer.equals("santiago")) {
                        System.out.println("\nCorrect!\n\n");
                        Score++;
                    }
                    else{
                        System.out.println("\nIncorrect! the answer was Santiago\n\n");
                    }
                    break;
                }
                case "Columbia" -> {
                    System.out.println("""
                            A. Bogota
                            B. Medellin
                            C. Cartagena
                            D. Cali""");

                    String answer = input.nextLine();
                    if (answer.equals("A") || answer.equals("a") || answer.equals("Bogota") || answer.equals("bogota")) {
                        System.out.println("\nCorrect!\n\n");
                        Score++;
                    }
                    else{
                        System.out.println("\nIncorrect! the answer was Bogota\n\n");
                    }
                    break;
                }
                case "Peru" -> {
                    System.out.println("""
                            A. Arequipa
                            B. Lima
                            C. Cusco
                            D. Trujillo""");

                    String answer = input.nextLine();
                    if (answer.equals("B") || answer.equals("b") || answer.equals("Lima") || answer.equals("lima")) {
                        System.out.println("\nCorrect!\n\n");
                        Score++;
                    }
                    else{
                        System.out.println("\nIncorrect! the answer was Lima\n\n");
                    }
                    break;
                }
                case "Venezuela" -> {
                    System.out.println("""
                            A. Valencia
                            B. Maracaibo
                            C. Caracas
                            D. Maracay""");

                    String answer = input.nextLine();
                    if (answer.equals("C") || answer.equals("c") || answer.equals("Caracas") || answer.equals("caracas")) {
                        System.out.println("\nCorrect!\n\n");
                        Score++;
                    }
                    else{
                        System.out.println("\nIncorrect! the answer was Caracas\n\n");
                    }
                    break;
                }
                case "Uruguay" -> {
                    System.out.println("""
                            A. Salto
                            B. Punta del Este
                            C. La Paz
                            D. Montevideo""");

                    String answer = input.nextLine();
                    if (answer.equals("D") || answer.equals("d") || answer.equals("Montevideo") || answer.equals("montevideo")) {
                        System.out.println("\nCorrect!\n\n");
                        Score++;
                    }
                    else{
                        System.out.println("\nIncorrect! the answer was Montevideo\n\n");
                    }
                    break;
                }
            }
            nations.remove(randomNumber);
        }

        System.out.println("\nThe trivia is over\n");
        System.out.printf("Your score is %d out of %d%n", Score, 10); // Score reveal

        System.out.println("\n\nWould you like to play again? (Y/N)"); // Play again
        Scanner reRun = new Scanner(System.in);
        String answer = reRun.nextLine();

        if (answer.equals("N") || answer.equals("n")) { // If no, exit program
            System.out.println("""
                    Thanks for playing!

                    Closing program...""");
            System.exit(0); // Terminating program
        }
        else if (answer.equals("Y") || answer.equals("y")) {
            System.out.println("\nLet's play again!");
            main(args); // Recursive function call
        }
        else {
            System.out.println("""
                    Thanks for playing!

                    Closing program...""");
            System.exit(0); // Terminating program
        }

    }
}
