package lab1;

import javax.swing.JOptionPane;


public class IntroJavaCourse extends Course{
    private String prerequisites;

    public String getPrerequisites() {
        return prerequisites;
    }
    @Override
    public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        super.setCredits(credits);
    }
    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    @Override
    public String toString(){
        return "Introduction to Java Course: " + this.getCourseName() + "\n Course num: " + this.getCourseNumber() + "\n Credits: " 
                + this.getCredits() + "\n Prerequisites: " + this.getPrerequisites();
    }

}
