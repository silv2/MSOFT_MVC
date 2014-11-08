package sk.fiit.silvia.MVC.model;

/**
 * Created by silvia on 05/11/2014.
 */
public class ClassUser {
    private User user;
    private String className;

    public ClassUser(User user, String className) {
        this.user = user;
        this.className = className;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
