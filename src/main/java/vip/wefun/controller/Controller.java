package vip.wefun.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        String id = UUID.randomUUID().toString();
        System.out.println(id);
        return id;
    }

}