package com.example.carros.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String get()
    {
        return  "Get Spring Boot";
    }
    /*

    //@GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public  String get()
    {
        return "Get Spring Boot";
    }

    @PostMapping
    public  String post()
    {
        return "Post Spring Boot";
    }

    @PutMapping
    public String put()
    {
        return "Put Spring Boot";
    }

    @DeleteMapping
    public String delete()
    {
        return "Delete Spring Boot";
    }

    //http://localhost:8080/login?Login=diego&Senha=abc
    @GetMapping("/login")
    public String login(@RequestParam("login") String login,@RequestParam("senha") String senha)
    {
        return "Login " + login + ", Senha: " + senha;
    }

    //http://localhost:8080/login/diego/senha/123
    @GetMapping("/login/{login}/senha/{senha}")
    public String loginPathVariable(@PathVariable("login") String login, @PathVariable("senha") String senha)
    {
        return "Login " + login + ", Senha: " + senha;
    }

    //@GetMapping("/login2") get ou post funcionaria, mas vc sabe que não é recomendável
    @PostMapping("/login2")
    public String login2(@RequestParam("login") String login,@RequestParam("senha") String senha)
    {
        return "Login " + login + ", Senha: " + senha;
    }

    */
}
