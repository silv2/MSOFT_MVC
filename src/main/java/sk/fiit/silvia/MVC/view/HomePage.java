package sk.fiit.silvia.MVC.view;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import sk.fiit.silvia.MVC.controller.GradeController;

public class HomePage extends WebPage {

	public HomePage(final PageParameters parameters) {

        add(new Link("link"){

            @Override
            public void onClick() {
                GradeController gradeController = new GradeController();
                gradeController.actionAdd();
            }
        });

    }
}
