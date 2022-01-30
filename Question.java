package com.company;

public class Question {
    private static String Text;
    private static  String Answer;
    private static int  Hardness;

    public Question() {

    }

    public String getText() {
       return Text;
   }
   public static void setText(String newText) {
       Text=newText;
   }
   public String getAnswer(){
       return  Answer;
   }
   public static void setAnswer(String newAnswer) {
        Answer = newAnswer;
    }
    public int getHardness() {
        return Hardness;
    }
    public static void setHardness(int newHardness){
       Hardness=newHardness;
    }

    public Question(String newText, String newAnswer, int newHardness){
       Text=newText;
       Answer=newAnswer;
       Hardness=newHardness;

   }



}
