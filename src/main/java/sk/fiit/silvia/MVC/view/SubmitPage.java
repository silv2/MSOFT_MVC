package sk.fiit.silvia.MVC.view;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import sk.fiit.silvia.MVC.controller.GradeController;

/**
 * Created by silvia on 03/11/2014.
 */
public class SubmitPage extends WebPage {


    public SubmitPage() {

        add(new GradeForm("gradeForm"));

    }
}
