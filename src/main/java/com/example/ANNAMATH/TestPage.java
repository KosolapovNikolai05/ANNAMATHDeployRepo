package com.example.ANNAMATH;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.Objects;


@Route("test")
@PageTitle("Онлайн тестирование по математике | ЕГЭ")
public class TestPage extends VerticalLayout {
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

    public TestPage (){
        this.getStyle().set("font-family" , "Comfortaa");
        this.getStyle().set("zoom" , "75%");
        //1
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        VerticalLayout taskUnit1 = new VerticalLayout();
        H1 title = new H1("Задание 1");
        HorizontalLayout task1 = new HorizontalLayout();
        H2 taskText = new H2("Около трапеции описана окружность. Периметр трапеции равен 38, средняя линия равна 11. Найдите боковую сторону трапеции");
        Button submit = new Button("ОТВЕТИТЬ✔️");
        submit.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task1.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task1.add(answer , submit);
        taskUnit1.add(title, taskText , task1);
        //2
        VerticalLayout taskUnit2 = new VerticalLayout();
        H1 title1 = new H1("Задание 2");
        HorizontalLayout task2 = new HorizontalLayout();
        H2 taskText1 = new H2("Боковые ребра треугольной пирамиды взаимно перпендикулярны, каждое из них равно 27. Найдите объем пирамиды");
        Button submit1 = new Button("ОТВЕТИТЬ✔️");
        submit1.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task1.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task2.add(answer1 , submit1);
        taskUnit2.add(title1, taskText1 , task2);
        //3
        VerticalLayout taskUnit3 = new VerticalLayout();
        H1 title2 = new H1("Задание 3");
        HorizontalLayout task3 = new HorizontalLayout();
        H2 taskText2 = new H2("На конференцию приехали 5 ученых из Швеции, 7 из Италии и 4 из Чехии. Каждый из них делает на конференции один доклад. Порядок докладов определяется жеребьёвкой. Найдите вероятность того, что двенадцатым окажется доклад ученого из Чехии");
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
        H2 taskText5 = new H2("Три одинаковые рубашки дешевле куртки на 10%. На сколько процентов четыре такие же рубашки дороже куртки?");
        Button submit5 = new Button("ОТВЕТИТЬ✔️");
        submit5.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task6.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task6.add(answer5 , submit5);
        taskUnit6.add(title5, taskText5 , task6);
        //7
        VerticalLayout taskUnit7 = new VerticalLayout();
        H1 title6 = new H1("Задание 7");
        HorizontalLayout task7 = new HorizontalLayout();
        H2 taskText6 = new H2("Из двух городов, расстояние между которыми равно 320 км, навстречу друг другу одновременно выехали два автомобиля. Через сколько часов автомобили встретятся, если их скорости равны 75 км/ч и 85 км/ч?");
        Button submit6 = new Button("ОТВЕТИТЬ✔️");
        submit6.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task7.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task7.add(answer6 , submit6);
        taskUnit7.add(title6, taskText6 , task7);
        //8
        VerticalLayout taskUnit8 = new VerticalLayout();
        H1 title8 = new H1("Задание 8");
        HorizontalLayout task8 = new HorizontalLayout();
        H2 taskText8 = new H2("Объем одного куба в 729 раз больше объема другого куба. Во сколько раз площадь поверхности первого куба больше площади поверхности второго куба?");
        Button submit8 = new Button("ОТВЕТИТЬ✔️");
        submit8.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task8.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task8.add(answer7 , submit8);
        taskUnit8.add(title8, taskText8 , task8);
        //9
        VerticalLayout taskUnit9 = new VerticalLayout();
        H1 title9 = new H1("Задание 9");
        HorizontalLayout task9 = new HorizontalLayout();
        H2 taskText9 = new H2("Двое рабочих, работая вместе, могут выполнить работу за 15 дней. За сколько дней, работая отдельно, выполнит эту работу первый рабочий, если он за два дня выполняет такую же часть работы, какую второй— за три дня?");
        Button submit9 = new Button("ОТВЕТИТЬ✔️");
        submit9.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task9.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task9.add(answer8 , submit9);
        taskUnit9.add(title9, taskText9 , task9);
        //10
        VerticalLayout taskUnit10 = new VerticalLayout();
        H1 title10 = new H1("Задание 10");
        HorizontalLayout task10 = new HorizontalLayout();
        H2 taskText10 = new H2("Найдите наименьшее значение функции y = 25 + 7x + x^3 на отрезке [-3;3]");
        Button submit10 = new Button("ОТВЕТИТЬ✔️");
        submit10.addThemeVariants(ButtonVariant.LUMO_SUCCESS  , ButtonVariant.LUMO_PRIMARY);
        task10.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        task10.add(answer9, submit10);
        taskUnit10.add(title10, taskText10 , task10);

        Button ok = new Button("ПРОВЕРИТЬ✅");
        ok.addClickListener(click -> check());
        ok.addThemeVariants(ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_LARGE );
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
        H1 titletitle = new H1("Онлайн-тестирование\uD83D\uDCDD. Подготовка к экзамену \uD83D\uDE0A. Вариант 1");
        Button test = new Button("СЛЕДУЮЩИЙ ВАРИАНТ \uD83D\uDCDD️");
        test.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_LARGE);
        test.addClickListener(click -> test.getUI().get().navigate("test2"));
        add(titletitle, test , taskUnit1 , taskUnit2 , taskUnit3 , taskUnit4 , taskUnit5 , taskUnit6 , taskUnit7 , taskUnit8 , taskUnit9 , taskUnit10 , ok);
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

        if (Objects.equals(answer1Value, "8")) {
            ++ correct;
        }
        if (Objects.equals(answer21Value, "3280,5")) {
            ++ correct;
        }
        if (Objects.equals(answer3Value, "0,25")) {
            ++ correct;
        }
        if (Objects.equals(answer4Value, "0,72")) {
            ++ correct;
        }
        if (Objects.equals(answer5Value, "10")) {
            ++ correct;
        }
        if (Objects.equals(answer6Value, "20")) {
            ++ correct;
        }
        if (Objects.equals(answer7Value, "2")) {
            ++ correct;
        }
        if (Objects.equals(answer8Value, "81")) {
            ++ correct;
        }
        if (Objects.equals(answer9Value, "20")) {
            ++ correct;
        }
        if (Objects.equals(answer10Value, "-23")) {
            ++ correct;
        }
        add(new H1("Правильных: " + correct + " \uD83D\uDD25"));
    }
}
