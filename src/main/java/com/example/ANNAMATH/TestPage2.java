package com.example.ANNAMATH;

import com.vaadin.flow.component.HtmlComponent;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.Objects;

@Route("test2")
@PageTitle("Онлайн тестирование по математике | ЕГЭ")

public class TestPage2 extends VerticalLayout {
    TextField answer = new TextField();
    TextField answer1 = new TextField();
    TextField answer2 = new TextField();
    TextField answer3 = new TextField();
    TextField answer4 = new TextField();
    TextField answer5 = new TextField();
    TextField answer6 = new TextField();
    TextField answer7 = new TextField();
    TextField answer8 = new TextField();
    TextField answer9 = new TextField();
    public TestPage2() {
        this.getStyle().set("zoom" , "75%");
        this.getStyle().set("font-family" , "Comfortaa");
        //1
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        VerticalLayout taskUnit1 = new VerticalLayout();
        H1 title = new H1("Задание 1");
        HorizontalLayout task1 = new HorizontalLayout();
        H2 taskText = new H2("В сборнике билетов по географии всего 25 билетов, в 17 из них встречается вопрос по теме \"Страны Африки\". Найдите вероятность того, что в случайно выбранном на экзамене билете школьнику не достанется вопроса по теме \"Страны Африки\"");
        Button submit = new Button("ОТВЕТИТЬ✔️");
        submit.getStyle().set("font-family" , "Comfortaa");
        submit.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task1.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task1.add(answer , submit);
        taskUnit1.add(title, taskText , task1);
        //2
        VerticalLayout taskUnit2 = new VerticalLayout();
        H1 title1 = new H1("Задание 2");
        HorizontalLayout task2 = new HorizontalLayout();
        H2 taskText1 = new H2("Стрелок стреляет по одному разу в каждую из четырёх мишеней. Вероятность попадания в мишень при каждом отдельном выстреле равна 0,9. Найдите вероятность того, что стрелок попадёт в первую мишень и не попадёт в три последние");
        Button submit1 = new Button("ОТВЕТИТЬ✔️");
        submit1.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task1.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task2.add(answer1 , submit1);
        taskUnit2.add(title1, taskText1 , task2);
        //3
        VerticalLayout taskUnit3 = new VerticalLayout();
        H1 title2 = new H1("Задание 3");
        HorizontalLayout task3 = new HorizontalLayout();
        H2 taskText2 = new H2("Во сколько раз увеличится площадь поверхности куба, если его ребро увеличить в два раза?");
        Button submit2 = new Button("ОТВЕТИТЬ✔️");
        submit2.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task3.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task3.add(answer2 , submit2);
        taskUnit3.add(title2, taskText2 , task3);
        //4
        VerticalLayout taskUnit4 = new VerticalLayout();
        H1 title3 = new H1("Задание 4");
        HorizontalLayout task4 = new HorizontalLayout();
        H2 taskText3 = new H2("Биатлонист 8 раз стреляет по мишеням. Вероятность попадания в мишень при одном выстреле равна 0,9. Найдите вероятность того, что биатлонист первые 2 раза попал в мишени, а последние шесть промахнулся. Результат округлите до сотых");
        Button submit3 = new Button("ОТВЕТИТЬ✔️");
        submit3.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task4.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task4.add(answer3 , submit3);
        taskUnit4.add(title3, taskText3 , task4);
        //5
        VerticalLayout taskUnit5 = new VerticalLayout();
        H1 title4 = new H1("Задание 5");
        HorizontalLayout task5 = new HorizontalLayout();
        H2 taskText4 = new H2("Из пункта А в пункт В, расстояние между которыми 60 км, одновременно выехали автомобилист и велосипедист. Автомобилист в час проезжает на 90 км больше, чем велосипедист. Найдите скорость велосипедиста, если известно, что он прибыл в В на 5 часов 24 минуты позже автомобилиста. Ответ дайте в км/ч");
        Button submit4 = new Button("ОТВЕТИТЬ✔️");
        submit4.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task5.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task5.add(answer4 , submit4);
        taskUnit5.add(title4, taskText4 , task5);
        //6
        VerticalLayout taskUnit6 = new VerticalLayout();
        H1 title5 = new H1("Задание 6");
        HorizontalLayout task6 = new HorizontalLayout();
        H2 taskText5 = new H2("Найдите точку максимума функции y = x^3 - 192x + 14");
        Button submit5 = new Button("ОТВЕТИТЬ✔️");
        submit5.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task6.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task6.add(answer5 , submit5);
        taskUnit6.add(title5, taskText5 , task6);
        //7
        VerticalLayout taskUnit7 = new VerticalLayout();
        H1 title6 = new H1("Задание 7");
        HorizontalLayout task7 = new HorizontalLayout();
        H2 taskText6 = new H2("В магазине три продавца. Каждый из них занят с клиентом с вероятностью 0,6. Найдите вероятность того, что в случайный момент времени все три продавца заняты одновременно (считайте, что клиенты заходят независимо друг от друга).");
        Button submit6 = new Button("ОТВЕТИТЬ✔️");
        submit6.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task7.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task7.add(answer6 , submit6);
        taskUnit7.add(title6, taskText6 , task7);
        //8
        VerticalLayout taskUnit8 = new VerticalLayout();
        H1 title8 = new H1("Задание 8");
        HorizontalLayout task8 = new HorizontalLayout();
        H2 taskText8 = new H2("Васе надо решить 245 задач. Ежедневно он решает на одно и то же количество задач больше по сравнению с предыдущим днём. Известно, что за первый день Вася решил 11 задач. Определите, сколько задач решил Вася в последний день, если со всеми задачами он справился за 7 дней.");
        Button submit8 = new Button("ОТВЕТИТЬ✔️");
        submit8.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task8.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task8.add(answer7 , submit8);
        taskUnit8.add(title8, taskText8 , task8);
        //9
        VerticalLayout taskUnit9 = new VerticalLayout();
        H1 title9 = new H1("Задание 9");
        HorizontalLayout task9 = new HorizontalLayout();
        H2 taskText9 = new H2("Вычислите: 5tg154° * tg244°");
        Button submit9 = new Button("ОТВЕТИТЬ✔️");
        submit9.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task9.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task9.add(answer8 , submit9);
        taskUnit9.add(title9, taskText9 , task9);
        //10
        VerticalLayout taskUnit10 = new VerticalLayout();
        H1 title10 = new H1("Задание 10");
        HorizontalLayout task10 = new HorizontalLayout();
        H2 taskText10 = new H2("В сборнике билетов по биологии всего 50 билетов, в 5 из них встречается вопрос по теме \"Зоология\". Найдите вероятность того, что в случайно выбранном на экзамене билете школьнику не достанется вопроса по теме \"Зоология\".");
        Button submit10 = new Button("ОТВЕТИТЬ✔️");
        submit10.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task10.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task10.add(answer9, submit10);
        taskUnit10.add(title10, taskText10 , task10);

        Button ok = new Button("ПРОВЕРИТЬ✅");
        ok.addClickListener(click -> check());
        ok.addThemeVariants(ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_LARGE );
        Button test = new Button("СЛЕДУЮЩИЙ ВАРИАНТ \uD83D\uDCDD️");
        test.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_LARGE);
        test.addClickListener(click -> showError());
        H1 titletitle = new H1("Онлайн-тестирование\uD83D\uDCDD. Подготовка к экзамену \uD83D\uDE0A. Вариант 2");
        submit.getStyle().set("font-family" , "Comfortaa");
        submit1.getStyle().set("font-family" , "Comfortaa");
        submit2.getStyle().set("font-family" , "Comfortaa");
        submit3.getStyle().set("font-family" , "Comfortaa");
        submit4.getStyle().set("font-family" , "Comfortaa");
        submit5.getStyle().set("font-family" , "Comfortaa");
        submit6.getStyle().set("font-family" , "Comfortaa");
        submit.getStyle().set("font-family" , "Comfortaa");
        submit8.getStyle().set("font-family" , "Comfortaa");
        submit9.getStyle().set("font-family" , "Comfortaa");
        submit10.getStyle().set("font-family" , "Comfortaa");
        add(titletitle, test , taskUnit1 , taskUnit2 , taskUnit3 , taskUnit4 , taskUnit5 , taskUnit6 , taskUnit7 , taskUnit8 , taskUnit9 , taskUnit10 , ok);
    }

    public void showError() {
        Notification notification = new Notification();
        notification.addThemeVariants(NotificationVariant.LUMO_WARNING);
        notification.setPosition(Notification.Position.MIDDLE);

        Div text = new Div(
                new Text("Данный материал доступен только ученикам!"),
                new HtmlComponent("br")
        );

        Button closeButton = new Button(new Icon("lumo", "cross"));
        closeButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
        closeButton.getElement().setAttribute("aria-label", "Close");
        closeButton.addClickListener(event -> {
            notification.close();
        });

        HorizontalLayout layout = new HorizontalLayout(text, closeButton);
        layout.setAlignItems(Alignment.CENTER);

        notification.add(layout);
        notification.open();

    }
    public void check(){
        int correct = 0;
        String answer1Value = answer.getValue();
        String answer21Value = answer1.getValue();
        String answer3Value = answer2.getValue();
        String answer4Value = answer3.getValue();
        String answer5Value = answer4.getValue();
        String answer6Value = answer5.getValue();
        String answer7Value = answer6.getValue();
        String answer8Value = answer7.getValue();
        String answer9Value = answer8.getValue();
        String answer10Value = answer9.getValue();

        if (Objects.equals(answer1Value, "0,32")) {
            ++ correct;
        }
        if (Objects.equals(answer21Value, "0,0009")) {
            ++ correct;
        }
        if (Objects.equals(answer3Value, "4")) {
            ++ correct;
        }
        if (Objects.equals(answer4Value, "0,00")) {
            ++ correct;
        }
        if (Objects.equals(answer5Value, "10")) {
            ++ correct;
        }
        if (Objects.equals(answer6Value, "8")) {
            ++ correct;
        }
        if (Objects.equals(answer7Value, "0,216")) {
            ++ correct;
        }
        if (Objects.equals(answer8Value, "59")) {
            ++ correct;
        }
        if (Objects.equals(answer9Value, "-5,002")) {
            ++ correct;
        }
        if (Objects.equals(answer10Value, "20")) {
            ++ correct;
        }
        add(new H1("Правильных: " + correct + " \uD83D\uDD25"));
    }
}
