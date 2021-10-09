package ru.tcreator.jdbcstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tcreator.jdbcstart.repository.Repository;

@RestController
@RequestMapping("/")
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("greetings")
    public String getStr() {
        var list = repository.getSomething("select * from customers");
        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

}
