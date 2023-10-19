package com.example.ANNAMATH;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Route("homeworksPage")
@PageTitle("Твоя домашняя работа ")
public class HomeworksPage extends VerticalLayout{

    private final EditInfoCenter infoCenter;

    @Autowired
    public HomeworksPage(EditInfoCenter infoCenter) {
        this.getStyle().setBackground("#ebebeb");
        this.getStyle().set("font-family" , "Comfortaa");
        this.infoCenter = infoCenter;
        H2 title = new H2("Выполни задания \uD83D\uDC47");
        this.add(title , displayAllTasks());
    }
    public VerticalLayout displayAllTasks () {
        VerticalLayout tasks = new VerticalLayout();
        List<Homework> homeworks = infoCenter.getHomeworks();
        if (homeworks.size() != 0) {
            for (int hIndex = homeworks.size() - 1; hIndex >= 0; hIndex --) {
                H3 task = new H3(homeworks.get(hIndex).getContent());
                task.getStyle().setBorder("1.2px").set("border-radius", "30px")
                        .setPadding("20px").setBackground("white");
                if (homeworks.get(hIndex).isLink()) {
                    int finalHIndex = hIndex;
                    task.getStyle().setColor("blue");
                    task.addClickListener(h3ClickEvent -> task.getUI().get().getPage().setLocation(homeworks.get(finalHIndex).getContent()));
                }
                tasks.add(task);
            }
        }
        return tasks;
    }
}
