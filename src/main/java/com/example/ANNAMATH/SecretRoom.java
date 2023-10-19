package com.example.ANNAMATH;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("secret")
@PageTitle("Войдите")
public class SecretRoom extends VerticalLayout {
    private final String key = "8xJFWgfwg982xxvWDAF";
    private final String keyStudent = "**GFAief92i3f2fasvks";

    public SecretRoom () {
        this.getStyle().set("font-family" , "Comfortaa");
        TextField password = new TextField("Введите пароль");
        Button saveChanges = new Button("Войти ✅");
        saveChanges.getStyle().set("font-family" , "Comfortaa");
        saveChanges.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_LARGE);
        saveChanges.addClickListener(click -> toEditInfo(password.getValue()));
        this.add(password , saveChanges);
    }
    public void toEditInfo (String password) {
        if (key.equals(password)) {
            this.getUI().get().navigate("edit");
        }
        if (keyStudent.equals(password)) {
            this.getUI().get().navigate("homeworksPage");
        }
    }
}
