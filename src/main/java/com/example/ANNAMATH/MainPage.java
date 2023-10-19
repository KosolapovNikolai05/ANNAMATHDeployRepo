package com.example.ANNAMATH;

import com.vaadin.flow.component.HtmlComponent;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route("")
@PageTitle("Репетитор по математике | Подготовка к ОГЭ и ЕГЭ")
public class MainPage extends VerticalLayout {
    public MainPage () {
        this.getStyle().set("zoom" , "75%");
        this.getStyle().set("font-family" , "Comfortaa");
        this.getStyle().setBackground("#ebebeb");
        Image annaPhoto = new Image("ddsv.png"  , "MainPhoto");
        annaPhoto.addClickListener(imageClickEvent -> annaPhoto.getUI().get().navigate("secret"));
        annaPhoto.setHeight("320px");
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        VerticalLayout information = new VerticalLayout();
        information.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        VerticalLayout person = new VerticalLayout();
        VerticalLayout hl = new VerticalLayout();
        HorizontalLayout links = new HorizontalLayout();
        Image profiLink = new Image("profilogo.png" , "profi");
        profiLink.setHeight("50px");
        profiLink.addClickListener(click -> profiLink.getUI().get().getPage().setLocation("https://profi.ru/profile/KazarovaAV2"));
        Button connect = new Button("СВЯЗАТЬСЯ \uD83D\uDCDE");
        connect.getStyle().set("font-family" , "Comfortaa");
        connect.addClickListener(buttonClickEvent -> displayTelephone());
        Button rates = new Button("ТАРИФЫ \uD83D\uDCB8");
        rates.getStyle().set("font-family" , "Comfortaa");
        rates.addClickListener(buttonClickEvent -> rates.getUI().get().navigate("rates"));
        connect.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_LARGE);
        rates.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_LARGE);
        links.add(profiLink , connect , rates);
        person.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        information.add(new H2("Опыт \uD83D\uDD53"), new H3("Репетиторская деятельность: 10 лет (с 2013)"), new H3("Педагогический стаж (учитель в школе): 3 года (2016-2019)"));
        information.setDefaultHorizontalComponentAlignment(Alignment.START);
        VerticalLayout information1 = new VerticalLayout();
        information.setDefaultHorizontalComponentAlignment(Alignment.START);
        H1 s = new H1("Образование \uD83C\uDF93");
        s.getStyle().set("font-weight" , "bold");
        H1 sq= new H1("Опыт \uD83C\uDF93");
        sq.getStyle().set("font-weight" , "bold");
        information.add(s, new H3("Казанский(Приволжский) федеральный университет, бакалавр педагогического образования с двумя профилями подготовки"), new H3("Казанский (Приволжский) федеральный университет, Институт психологии и образования, магистр педагогического образования, профиль – математика и компьютерное моделирование в образовании 2017–2019 гг."));
        information.add(sq, new H3("Выполнение заданий из авторской книги"), new H3("Персональный подход к каждоому ученику") , new H3("Ежедневные онлайн-тесты в Google Forms"));
        VerticalLayout infoV = new VerticalLayout();
        VerticalLayout statistics = new VerticalLayout();
        statistics.setDefaultHorizontalComponentAlignment(Alignment.START);
        information1.setDefaultHorizontalComponentAlignment(Alignment.START);
        infoV.add(information,  information1);
        infoV.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        VerticalLayout diplomas = new VerticalLayout();
        Image diplomaed = new Image("diplomaed.jpg" , "diploma1");
        diplomaed.setWidth("600px");
        diplomaed.setHeight("400px");
        Image diplomaed1 = new Image("diplomaed1.jpg" , "diplomaED1");
        diplomaed1.setWidth("600px");
        diplomas.add(diplomaed , diplomaed1);
        diplomas.setWidth(this.getWidth());
        Image egelogo = new Image("egeege.png" , "egebook");
        egelogo.setWidth("50px");
        HorizontalLayout bookInfo = new HorizontalLayout();
        Button downloadBook = new Button("СКАЧАТЬ АВТОРСКУЮ КНИГУ \uD83D\uDCE5");
        downloadBook.getStyle().set("font-family" , "Comfortaa");
        downloadBook.addClickListener(click -> displayNotification());
        downloadBook.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_LARGE);
        HorizontalLayout hl1 = new HorizontalLayout();
        VerticalLayout v1 = new VerticalLayout();
        Video mama = new Video("rojo.MP4");
        H2 name = new H2("Аухадиева Зарина (Ученица)\uD83D\uDC69\uD83C\uDFFB");
        name.getStyle().set("font-face" , "url(src/main/resources/static/font_Comfortaa/Comfortaa/Comfortaa-Regular.ttf)").set("font-weight" , "normal");
        H2 location = new H2("Казань \uD83C\uDF0F");
        H3 result = new H3("ЕГЭ: 74 балла ⚡");
        H3 time = new H3("1 год \uD83D\uDD53");
        H3 goal = new H3("Поступила в ВУЗ мечты \uD83D\uDD25");
        H3 answer = new H3("Понравилось \uD83D\uDC4D:");
        H3 answer1 = new H3("Умение найти общий язык с учеником");
        H3 answer2 = new H3("Работа с авторской книгой ЕГЭ");
        H3 answer3 = new H3("Подробный разбор непонятных заданий");
        location.getStyle().set("font-family" , "Comfortaa");
        result.getStyle().set("font-family" , "Comfortaa");
        goal.getStyle().set("font-family" , "Comfortaa");
        answer.getStyle().set("font-family" , "Comfortaa");
        answer1.getStyle().set("font-family" , "Comfortaa");
        answer2.getStyle().set("font-family" , "Comfortaa");
        answer3.getStyle().set("font-family" , "Comfortaa");
        time.getStyle().set("font-family" , "Comfortaa");
        VerticalLayout descr = new VerticalLayout();
        descr.add(name , location  , result , time , goal , answer , answer1 , answer2 , answer3);
        descr.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        H2 name1 = new H2("Иванова Мария (Мама)\uD83D\uDC69\uD83C\uDFFB");
        H2 location1 = new H2("Нижний Новгород \uD83C\uDF0F");
        H3 result1 = new H3("ОГЭ: 4 ⚡");
        H3 time1 = new H3("7 месяцев \uD83D\uDD53");
        H3 goal1 = new H3("Дочь поступила в техникум на бюджет \uD83D\uDD25");
        H3 answer111 = new H3("Понравилось \uD83D\uDC4D:");
        H3 answer11 = new H3("Помощь ребенку в качественном усвоении знаний школьной программы");
        H3 answer21 = new H3("Умение найти общий язык с учеником");
        H3 answer31 = new H3("Подробный разбор непонятных заданий");
        name1.getStyle().set("font-family" , "Comfortaa");
        location1.getStyle().set("font-family" , "Comfortaa");
        result1.getStyle().set("font-family" , "Comfortaa");
        time1.getStyle().set("font-family" , "Comfortaa");
        goal1.getStyle().set("font-family" , "Comfortaa");
        answer111.getStyle().set("font-family" , "Comfortaa");
        answer11.getStyle().set("font-family" , "Comfortaa");
        answer21.getStyle().set("font-family" , "Comfortaa");
        answer31.getStyle().set("font-family" , "Comfortaa");
        VerticalLayout descr1 = new VerticalLayout();
        descr1.add(name1 , location1  , result1 , time1 , goal1 , answer111 , answer11 , answer21 , answer31);
        mama.setWidth("320px");
        v1.add(new H1(" ") , new H1("  ") ,mama , descr1);
        VerticalLayout v2 = new VerticalLayout();
        v1.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        Video girl = new Video("llds.mp4");
        girl.setWidth("320px");
        v2.add(new H1(" ") , new H1("  ") , girl , descr);
        v2.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        VerticalLayout videoslayout = new VerticalLayout();
        VerticalLayout commentVids = new VerticalLayout();
        commentVids.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        commentVids.setDefaultHorizontalComponentAlignment(Alignment.START);
        Video v = new Video("IMG_8313.MOV");
        v.setWidth("320px");
        VerticalLayout c = new VerticalLayout();
        H1 factor1 = new H1("Почему нужно выбрать именно меня? \uD83E\uDD14");
        H2 factor2 = new H2("Профильное педагогическое образование \uD83D\uDC69\uD83C\uDFFB\u200D\uD83C\uDFEB");
        H2 factor3 = new H2("Эксперт ЕГЭ \uD83D\uDCAF");
        H2 factor4 = new H2("Автор книги по подготовке к ЕГЭ \uD83D\uDCD5");
        factor1.getStyle().set("font-family" , "Comfortaa");
        factor2.getStyle().set("font-family" , "Comfortaa");
        factor3.getStyle().set("font-family" , "Comfortaa");
        factor4.getStyle().set("font-family" , "Comfortaa");
        c.add(factor1 ,factor2 , factor3 , factor3 , factor4);
        commentVids.add(v , c);
        commentVids.setWidth("50%");
        commentVids.setWidth(this.getWidth());
        videoslayout.add(v2, v1);
        videoslayout.setDefaultHorizontalComponentAlignment(Alignment.START);
        hl1.setDefaultVerticalComponentAlignment(Alignment.END);;
        Button videos = new Button("ВИДЕОРАЗБОРЫ ЕГЭ \uD83D\uDCDD▶️");
        videos.getStyle().set("font-family" , "Comfortaa");
        videos.getStyle().set("font-family" , "Comfortaa");
        Button test = new Button("ПРОЙТИ ТЕСТИРОВАНИЕ \uD83D\uDCDD️");
        test.getStyle().set("font-family" , "Comfortaa");
        test.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_ERROR , ButtonVariant.LUMO_LARGE);
        test.addClickListener(click -> test.getUI().get().navigate("test"));
        HorizontalLayout testLayout = new HorizontalLayout();
        testLayout.add(new H2(" ") , test);
        hl1.add(new H1(" ") ,new H1("  ") , videos);
        videos.addThemeVariants(ButtonVariant.LUMO_PRIMARY , ButtonVariant.LUMO_SUCCESS , ButtonVariant.LUMO_LARGE);
        videos.addClickListener(click -> videos.getUI().get().getPage().setLocation("https://youtube.com/@annamathkzn?si=HAD1pERmgUdopK5C"));
        bookInfo.add(egelogo , downloadBook);
        person.add(annaPhoto , new H1("Анна Викторовна"), new H1("Кукушкина") , links , hl1, testLayout,new H3("Подготовленных учеников - 73") , new H3("Средний балл учеников - 70-80") , new H3("Автор книги по подготовке к ЕГЭ") , bookInfo);
        hl.add(person , infoV);
        person.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        diplomas.getStyle().setBorder("1.2px").set("border-radius", "30px")
                .setPadding("20px").setBackground("white");
        diplomaed.setWidth(diplomas.getWidth());
        diplomaed.setHeight(diplomaed1.getHeight());
        diplomaed1.setWidth(diplomas.getWidth());
        VerticalLayout unityLayout = new VerticalLayout();
        unityLayout.add(hl , new H1("Видеообращение \uD83D\uDC4B"), commentVids ,new H1("Видеоотзывы \uD83D\uDCAC ▶"),videoslayout , new H1("Дипломы и Сертификаты \uD83D\uDC69\uD83C\uDFFB\u200D\uD83C\uDF93 \uD83D\uDCDC") , diplomas);
        Page p = UI.getCurrent().getPage();
        p.addBrowserWindowResizeListener(event -> unityLayout.setWidth(String.valueOf(event.getWidth())));
        p.addBrowserWindowResizeListener(event -> unityLayout.setHeight(String.valueOf(event.getHeight())));
        add(unityLayout);
        this.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    }

    public void displayNotification () {
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
    public void displayTelephone(){
        Notification notification = new Notification();
        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
        notification.setPosition(Notification.Position.MIDDLE);

        Div text = new Div(
                new Text("Номер телефона: +7 950 327 80 28"),
                new HtmlComponent("br"),
                new Text("Telegram: @annamathkzn"),
                new HtmlComponent("br"),
                new Text("Discord: anna_math")
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
}
