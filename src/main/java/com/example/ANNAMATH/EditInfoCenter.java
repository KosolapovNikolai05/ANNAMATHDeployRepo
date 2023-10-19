package com.example.ANNAMATH;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class EditInfoCenter {
    private String cost1 = "(6.000 руб. 60 мин. 4 урока в месяц)" ;
    private String cost2 = "(18.000 руб. 60 мин. 12 уроков в месяц)";
    private String cost3 = "(12.000 руб. 60 мин. 8 уроков в месяц)" ;
    private List<Homework> homeworks = new ArrayList<>();

    public void addHomework(Homework newHomework) {
        homeworks.add(newHomework);
    }
}
