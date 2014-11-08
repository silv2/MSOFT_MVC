package sk.fiit.silvia.MVC.view;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by silvia on 05/11/2014.
 */
public class FinalPage extends WebPage {

    public FinalPage (String name, String grade, String classStud){

        add(new Label("name", "Student name : "+name));
        add(new Label("grade", "Student's grade : "+grade));
        add(new Label("class", "Student's class : "+classStud));
    }
}
