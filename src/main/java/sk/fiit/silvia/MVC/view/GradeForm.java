package sk.fiit.silvia.MVC.view;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import sk.fiit.silvia.MVC.controller.GradeController;

/**
 * Created by silvia on 05/11/2014.
 */
public class GradeForm extends Form {
    private TextField usernameField;
    private TextField userGradeField;
    private TextField userClassField;
    private Label status;

    public GradeForm(String id) {
        super(id);

        usernameField = new TextField("username", Model.of(""));
        userGradeField = new TextField("grade", Model.of(""));
        userClassField = new TextField("class", Model.of(""));
        status = new Label("status", Model.of(""));

        add(usernameField);
        add(userGradeField);
        add(userClassField);
        add(status);
    }

    public final void onSubmit() {

            String username = (String)usernameField.getDefaultModelObject();
            String grade = (String)userGradeField.getDefaultModelObject();
            String classstud = (String)userClassField.getDefaultModelObject();

            /*if(grade.equals("1"))
                status.setDefaultModelObject("Congratulations!");
            else
                status.setDefaultModelObject("Wrong!");*/
            status.setDefaultModelObject("Congratulations you added grade!");

        GradeController gradeController = new GradeController();
        gradeController.saveData(username, grade, classstud);
        }
}