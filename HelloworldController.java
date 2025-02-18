package com.example1st.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloworldController {
    @RequestMapping("/hola")

    public String helloworld() {
        return "Hello World, Olá Mundo, Hola Mundo, Bonjour le monde, Ciao Mondo";
    }
}
