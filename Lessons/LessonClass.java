package Lessons;


import Student.StudentClass;

import java.util.*;

public abstract class LessonClass {

   /*
        LessonClass class is abstract class

        Create 2 private variables
        1) static int totalCreditCount
        2) LinkedHashMap Key is String, value is Integer, name is classNameAndScore

        one private StudentClass object.

     */

   private static int totalCreditCount;
   private LinkedHashMap<String, Integer> classNameAndScore = new LinkedHashMap<>();
   private StudentClass studentClass;

    /*
        Create a method name is topics

        This method is a abstract method

        Return type is String ArrayList

     */

    public abstract ArrayList<String> topics();

     /*
    Create a constructor for the LessonClass
    parameter is StudentClass object

    make StudentClass instance variable equal to StudentClass parameter

    call the setCreditCount method  which you are expected to create below
     */

    public LessonClass(StudentClass studentClass) {
        this.studentClass = studentClass;
        setCreditCount();
    }

    /*

        Create a method name setCreditCount
        No parameter and no return type

        Create an arraylist name is lessonsName
        Ask to user "Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music"
        After asking also add the credit to totalCreditCount(this comes from the instance variable)


        If the user took the class (you wrote in the console with the scanner class) is already exits in the arraylist and the user would like to take it again

        Then print "You already took this class please choose other class"

        If the user didn't take that class before, then add it to the arraylist, and add the credit of the class(which comes from the lessonsName list) to the
        totalCreditCount(you need to use checkCredit method)

        NOTE: The user can add a class until totalCreditCount equals to 7

         */
   public void setCreditCount(){
       List<String> lessonName = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);

       while (totalCreditCount<=7) {
           System.out.println("Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music");
           String str = scanner.nextLine();

           if (lessonName.contains(str)) {
               System.out.println("You already took this class please choose other class");

           } else {
               lessonName.add(str);
               totalCreditCount += checkCredit(str);
           }

       }

   }


     /*
    Create a method name is checkCredit
    parameter is one String lessonName
    return type is int

    IF the lessonName = Math
     credit should be 3

     IF the lessonName = Science
     credit should be 4

      IF the lessonName = Biology
     credit should be 2

      IF the lessonName = Chemistry
     credit should be 2

      IF the lessonName = Music
     credit should be 3

     if the class is non of these options
        Throw an exception "You class name is not a valid class name."

    After the if statement
     put lessonName as a key in the classNameAndScore
     value should take from the next method which is RandomNum
     */
public int checkCredit(String lessonName){
    int credit = 0;
    if (lessonName.equalsIgnoreCase("Math")){
        credit = 3;
    }else if (lessonName.equalsIgnoreCase("Science")){
        credit = 4;
    }else if (lessonName.equalsIgnoreCase("Biology")){
        credit = 2;
    }else if (lessonName.equalsIgnoreCase("Chemistry")){
        credit = 2;
    }else if (lessonName.equalsIgnoreCase("Music")){
        credit = 3;
    }else {
        throw new RuntimeException("You class name is not a valid class name.");
    }
    classNameAndScore.put(lessonName, RandomNum());

    return credit;

}

    /*
    Create a method name is RandomNum
    no parameter
    Return type is int

    create an int number between 0 to 100
     */
public int RandomNum(){
    Random random = new Random();
    return random.nextInt(101);
}

    /*
    Create a get method for the ClassNameAndScore
     */

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }
}
