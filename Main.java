package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Question> myQuestions = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean mainLoop=true;
        int a;
        while(true){
            System.out.println("What would you like to do? " +
                    "\n 1. Add a question to the quiz" +
                    "\n 2. Remove a question from the quiz" +
                    "\n 3. Modify a Question in the quiz" +
                    "\n 4. Take the quiz" +
                    "\n 5. Quit");
                a = sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("choice 1 was selected");
                    break;
                case 2:
                    System.out.println("choice 2 was selected");
                    break;
                case 3:
                    System.out.println("choice 3 was selected");
                    break;
                case 4:
                    System.out.println("choice 4 was selected");
                    break;
                case 5:
                    System.out.println("choice 5 was selected");
                    System.exit(0);
                    break;
                default:
                    System.out.print("This is not a valid menu option please select another \n");
                    break;
            }



            }





    }



    }

