package com.example.ANNAMATH;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("rates")
@PageTitle("Тарифы | Подготовка к ОГЭ и ЕГЭ")
public class RatesPage extends HorizontalLayout {

    private final EditInfoCenter infoCenter;

    @Autowired
    public RatesPage(EditInfoCenter infoCenter) {
        this.getStyle().set("zoom" , "45%");
        this.getStyle().set("font-family" , "Comfortaa");
        this.infoCenter = infoCenter;
        this.getStyle().setBackground("#ebebeb");
        VerticalLayout self = new VerticalLayout();
        self.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        VerticalLayout honest = new VerticalLayout();
        honest.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        VerticalLayout chef = new VerticalLayout();
        chef.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        self.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        honest.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        chef.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        Image honestImage = new Image("honest.png", "honest");
        honestImage.setHeight("250px");
        Image chefImage = new Image("BUBUBA.png", "chef");
        chefImage.setHeight("250px");
        Image selfImage = new Image("BUBUBA.png", "honest");
        selfImage.setHeight("250px");
        H1 titleHonest = new H1("Тариф: 'Да я учил! Честно!'");
        H3 descHonest = new H3("Индивидуальные занятия 2 раза в неделю по 60 мин");
        H3 descHonest2 = new H3("Проверка домашнего задания ДО занятия");
        H3 descHonest3 = new H3("Бонусные материалы для подготовки к экзаменам.");
        H3 descHonest4 = new H3(String.valueOf(infoCenter.getCost3()));
        Button buyHonest = new Button("КУПИТЬ \uD83D\uDCB3");
        buyHonest.getStyle().set("font-family" , "Comfortaa");
        buyHonest.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_LARGE);
        buyHonest.addClickListener(click -> buyHonest.getUI().get().getPage().open("https://t.me/annamathkzn"));

        H1 titleChef = new H1("Тариф: 'Шеф, все пропало!'");
        H3 descChef = new H3("Индивидуальные занятия 3 раза в неделю по 60 мин");
        H3 descChef2 = new H3("Проверка домашнего задания ДО занятия");
        H3 descChef3 = new H3("Бонусные материалы для подготовки к экзаменам.");
        H3 descChef4 = new H3(String.valueOf(infoCenter.getCost2()));
        Button buyChef = new Button("КУПИТЬ \uD83D\uDCB3");
        buyChef.getStyle().set("font-family" , "Comfortaa");
        buyChef.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_LARGE);
        buyChef.addClickListener(click -> buyChef.getUI().get().getPage().open("https://t.me/annamathkzn"));
        H1 titleSelf = new H1("Тариф: 'Мне только спросить!");
        H3 descSelf1 = new H3("Индивидуальные занятия 1 раз в неделю (60 мин)");
        H3 descSelf2 = new H3("Проверка домашнего задания ДО занятия");
        H3 descSelf3 = new H3("Бонусные материалы для подготовки к экзаменам.");
        H3 descSelf4 = new H3(String.valueOf(infoCenter.getCost1()));
        Button buySelf = new Button("КУПИТЬ \uD83D\uDCB3");
        buySelf.getStyle().set("font-family" , "Comfortaa");
        buySelf.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_LARGE);
        buySelf.addClickListener(click -> buySelf.getUI().get().getPage().open("https://t.me/annamathkzn"));
        this.setVerticalComponentAlignment(Alignment.CENTER);


        self.add(selfImage , titleSelf ,new H1("") , new H1(" "), new H1("  ") , descSelf1 , descSelf2 ,descSelf3 , descSelf4 , buySelf);
        honest.add(honestImage , titleHonest , descHonest , descHonest2 , descHonest3 , descHonest4 , new H1(" ") , new H1(" ")  ,  new H1(" ") ,buyHonest);
        chef.add(chefImage , titleChef , descChef , descChef2, descChef3 , descChef4 , new H1(" ") , new H1(" ")  , new H1(" ") ,  buyChef);
        add(self , honest , chef);
    }
}
