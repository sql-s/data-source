package ru.tcreator.jdbcstart.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;
import ru.tcreator.jdbcstart.repository.Repository;

import javax.websocket.server.PathParam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
