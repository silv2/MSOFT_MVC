package sk.fiit.silvia.MVC.model;

/**
 * Created by silvia on 03/11/2014.
 */
public class User {

    private String name;
    private Grade grade;

    public User(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
