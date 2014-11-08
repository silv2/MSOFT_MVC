package sk.fiit.silvia.MVC.model;

/**
 * Created by silvia on 03/11/2014.
 */
public class Grade {
    private String grade;

    public Grade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public boolean checkIfGrade(){
        int gradeInt = Integer.parseInt(grade);
        boolean isGrade = false;
        if (gradeInt > 0 && gradeInt <6) isGrade = true;
        return isGrade;
    }

    public void validate(){
        boolean isGrade = checkIfGrade();
        if (!isGrade) grade = "You submitted wrong grade";
    }
}
