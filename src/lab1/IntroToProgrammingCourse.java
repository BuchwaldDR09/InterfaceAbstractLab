package lab1;

public class IntroToProgrammingCourse extends Course {
    @Override
    public String toString(){
        return "Introduction to Programming Course: " + this.getCourseName() + "\n Course num: " + this.getCourseNumber() + "\n Credits: " 
                + this.getCredits();
    }
}
