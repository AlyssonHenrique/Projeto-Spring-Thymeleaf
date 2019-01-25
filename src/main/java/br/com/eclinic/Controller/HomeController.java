package br.com.eclinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {

        return "util/login";
    }

    @RequestMapping(value = "/acessonegado", method = RequestMethod.GET)
    public String acessoNegado() {

        return "acessoNegado";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {

        return "util/home";
    }
}
