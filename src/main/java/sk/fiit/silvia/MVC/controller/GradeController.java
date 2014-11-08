package sk.fiit.silvia.MVC.controller;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import sk.fiit.silvia.MVC.model.ClassUser;
import sk.fiit.silvia.MVC.model.Grade;
import sk.fiit.silvia.MVC.model.User;
import sk.fiit.silvia.MVC.view.FinalPage;
import sk.fiit.silvia.MVC.view.HomePage;
import sk.fiit.silvia.MVC.view.SubmitPage;

/**
 * Created by silvia on 03/11/2014.
 */
public class GradeController  extends WebPage{

    public void actionAdd(){
        setResponsePage(SubmitPage.class);

    }

    public void saveData(String name, String grade, String classStud){
        Grade gradeO = new Grade(grade);
        gradeO.validate();
        User user = new User (name, gradeO);
        ClassUser classUser = new ClassUser(user, classStud);
        FinalPage finalPage = new FinalPage(user.getName(), gradeO.getGrade(), classUser.getClassName());
        setResponsePage(finalPage);
    }
}
