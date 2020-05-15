package com.example.sup;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from the hello controller!\n";
    }

    @RequestMapping("/sup")
    public String index2() {
        return "This is the only way to really sup!\n";
    }

    @RequestMapping("/{id}")
    public String index3(@PathVariable String id) {

        return "Hey " + id + "! How are you?\n";
    }


}
