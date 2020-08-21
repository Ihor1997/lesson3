package main.java.homework_2;

public class Task_2 {

    public static void main(String[] args) {

    }


      public String getName(){
          String result = "";
          for (int i = 0; i < 5; i++) {
              for (int j = 0; j < 5; j++) {
                  result += "* ";
              }
              result += "\n";
          }
          return result;
      }



  }


