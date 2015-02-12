

package lab2;


public interface Course {
    
    
    public abstract String getCourseName();
    
    public void setCourseName(String courseName);
    
    public abstract String getCourseNumber();
    
    public void setCourseNumber(String courseNumber);
    
    public abstract double getCredits();
    
    public void setCredits(double credits);
    
    @Override
    public abstract String toString();
    
}
