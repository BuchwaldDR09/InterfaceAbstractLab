package lab1;

public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        AdvancedJavaCourse AdvJava = new AdvancedJavaCourse();
        
        AdvJava.setCourseName("Advanced Java 101");
        AdvJava.setCourseNumber("234325");
        AdvJava.setCredits(4);
        AdvJava.setPrerequisites("Introduction to Java\n");
        System.out.println(AdvJava.toString());
        
        IntroJavaCourse IntJava = new IntroJavaCourse();
        IntJava.setCourseName("Introduction to Java 3");
        IntJava.setCourseNumber("234555");
        IntJava.setCredits(2);
        IntJava.setPrerequisites("Introduction to Programming\n");
        System.out.println(IntJava.toString());
        
        Course IntPro = new IntroToProgrammingCourse();
        IntPro.setCourseName("Intro to Programming 34");
        IntPro.setCourseNumber("890022");
        IntPro.setCredits(4);
        System.out.println(IntPro.toString());
        
      
    }
    
}
