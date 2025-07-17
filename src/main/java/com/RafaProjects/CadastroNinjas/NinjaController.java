package com.RafaProjects.CadastroNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping ("/Hello")
    public String hello (){

        return "Hello new" + World();

    }

    public String World () {
        return "World";
    }

}
