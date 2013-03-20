package com.onapp.hellospringmaven.controller;

import com.onapp.hellospringmaven.model.User;
import com.onapp.hellospringmaven.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {
    
    private HelloService helloService;
        
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(ModelMap model) {

        model.addAttribute("message", "http://path/to/HelloSpringMaven/welcome/{name} , or");

        model.addAttribute("form", new User());
        
        return "index";

    }

    @RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
    public String welcome(@PathVariable String name, ModelMap model) {

        model.addAttribute("message", this.setHelloMessage(name));

        return "show";

    }

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(ModelMap model) {

        model.addAttribute("form", new User());
        
        return "hello";

    }
    
    @RequestMapping(value="/show", method = RequestMethod.GET)
    public String show(@RequestParam(value="name", required=true) String name, ModelMap model) {

        model.addAttribute("message", this.setHelloMessage(name));
        
        return "show";

    }
    
    private String setHelloMessage(String name) {
        this.helloService = new HelloService();
        
        return helloService.sayHello(name);
    }
}
