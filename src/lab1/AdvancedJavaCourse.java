package lab1;

import javax.swing.JOptionPane;


public class AdvancedJavaCourse extends Course {
    private String prerequisites;    
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String getPrerequisites() {
        return prerequisites;
    }
    
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public String toString(){
        return "Advanced Java Course: " + this.getCourseName() + "\n Course num: " + this.getCourseNumber() + "\n Credits: " 
                + this.getCredits() + "\n Prerequisites: " + this.getPrerequisites();
    }
}

