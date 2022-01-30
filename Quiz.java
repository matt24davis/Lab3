package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> myQuestions = new ArrayList<Question>();
    Scanner sc = new Scanner(System.in);

       private void add_question() {
           String inputString;
           System.out.println("What is the question text?");
           String setText= sc.nextLine();
           System.out.println("What is the answer?");
           System.out.println("How Difficult?");
           //int addedH = sc.nextInt();
           inputString= sc.nextLine();
           //Question myQuest = new Question(setText);



       }


    }
    /*private String remove_question(){

    }
    private String modify_question(){

    }
    private String give_quiz(){

    }/*


