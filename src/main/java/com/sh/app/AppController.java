package com.sh.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return """
            <h1>🌞Welcome to Hello World Application🌞</h1>
            <h4>version %s</h4>
            """.formatted(appVersion);
    }
}
