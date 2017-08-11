package org.oliot.heroku.tsd.controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentationController {
    @GetMapping("/documentation")
    public String documentation() {
        String redirectUrl = "https://oliot-tsd.github.io/documentation/schema/v1.1";
        return "redirect:" + redirectUrl;
    }
}
