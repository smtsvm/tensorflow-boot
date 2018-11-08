package smt.svm.tensorflowboot.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI(path = "")
@Theme("tensorflow")
@Widgetset("smt.svm.tensorflowboot.ui.TensorflowThemeWidgetSet")
public class VaadinUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Label label = new Label("Works");
        label.addStyleName(ValoTheme.LABEL_SUCCESS);
        setContent(label);
    }
}
