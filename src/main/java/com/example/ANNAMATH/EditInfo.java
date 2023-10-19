package com.example.ANNAMATH;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.html.HTMLImageElement;


@Route("edit")
@PageTitle("Редактируйте информацию")
public class EditInfo extends VerticalLayout {
    private final EditInfoCenter infoCenter;

    @Autowired
    public EditInfo (EditInfoCenter infoCenter) {
        this.getStyle().set("font-family" , "Comfortaa");
        this.getStyle().set("zoom" , "75%");
        this.infoCenter = infoCenter;
        TextField cost1 = new TextField("Мне только спросить");
        TextField cost2 = new TextField("Да я учил честно");
        TextField cost3 = new TextField("Шеф, все пропало!");
        infoCenter.setCost1(cost3.getValue());
        infoCenter.setCost1(cost2.getValue());
        infoCenter.setCost1(cost1.getValue());
        Button saveChanges = new Button("Сохранить изменения ✅");
        saveChanges.getStyle().set("font-family" , "Comfortaa");
        saveChanges.addClickListener(buttonClickEvent -> saveChanges(cost1.getValue()
        , cost2.getValue() , cost3.getValue()));
        saveChanges.addThemeVariants(ButtonVariant.LUMO_LARGE , ButtonVariant.LUMO_PRIMARY);
        this.add(cost1 , cost2 , cost3 , saveChanges , renderLayoutCreateHomework());
    }

    public void saveChanges (String cost1 , String cost2 , String cost3) {
        infoCenter.setCost1(cost1);
        infoCenter.setCost2(cost3);
        infoCenter.setCost3(cost2);
    }

    public void createHomework (Homework newHomework) {
        infoCenter.addHomework(newHomework);
    }

    public VerticalLayout renderLayoutCreateHomework() {
        VerticalLayout resultLayout = new VerticalLayout();
        H2 title = new H2("Добавить домашнюю работу \uD83D\uDCD6");
        TextArea cost1 = new TextArea("Задание");
        Button saveChanges = new Button("Добавить ДЗ ➕");
        Checkbox isLink = new Checkbox("ССЫЛКА");
        saveChanges.getStyle().set("font-family" , "Comfortaa");
        saveChanges.addThemeVariants(ButtonVariant.LUMO_LARGE , ButtonVariant.LUMO_PRIMARY);
        saveChanges.addClickListener(buttonClickEvent -> createHomework(new Homework(cost1.getValue() , isLink.getValue())));
        resultLayout.add(title , cost1 , saveChanges , isLink);
        return resultLayout;
    }
}
