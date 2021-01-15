package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class InformationService {

    private LoginService loginService;
    private List<String> moods;
    private Random random;

    @Autowired
    public InformationService(LoginService loginService) {
        this.loginService = loginService;
        moods = new ArrayList<>();
        moods.add("https://media1.tenor.com/images/b6557d3fe799191d212d66a8c1bd5fd6/tenor.gif?itemid=9625083");
        moods.add("https://media1.tenor.com/images/66286c21e00a4ef6707abb4bfe19dcb3/tenor.gif?itemid=5043292");
        moods.add("https://media1.tenor.com/images/42374f2080bc066053160403c229d829/tenor.gif?itemid=4425081");
        moods.add("https://media1.tenor.com/images/cd2b426d532932db138059206de0a7ee/tenor.gif?itemid=4967969");
        moods.add("https://media1.tenor.com/images/c7504b9fb03c95b3b5687d744687e11c/tenor.gif?itemid=7212866");
        moods.add("https://media1.tenor.com/images/d774468a528b9aab5b9773e74a7be2b4/tenor.gif?itemid=10121476");

        moods.add("https://media1.tenor.com/images/b1c40f516d8666204ea054b3d72bc5ab/tenor.gif?itemid=15679110");
        moods.add("https://media1.tenor.com/images/76508711fa29a3fcf3df255a9cf8d36b/tenor.gif?itemid=16457588");
        moods.add("https://media.tenor.com/images/6384571b6864f75651566cf8d1454979/tenor.gif");
        random = new Random();
    }

    public String randomMood(){
        return moods.get(random.nextInt(moods.size()));
    }


    public String foxName() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getName();
    }

    public String foxFood() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getFood();
    }

    public String foxDrink() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getDrink();
    }

    public Integer foxTricks() {
        if (loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList().size() == 0) {
            return 0;
        }
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList().size();
    }

    public List<String> actualFoxTricks() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getTrickList();
    }

    public Long foxId() {
        return loginService.getFoxList().get(loginService.getFoxList().size() - 1).getId();
    }

}
