package ru.tcreator.jdbcstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tcreator.jdbcstart.repository.Repository;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }



    @GetMapping("products/fetch-product")
    public List getStr(@RequestParam String name) {
        return repository.getSomething(Map.of("name", name));
    }

}
