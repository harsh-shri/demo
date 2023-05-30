package com.example.demo;

//import org.springframework.core.io.ClassPathResource;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.StreamUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;

//@Controller
//public class ReactController {

//    @GetMapping(value = "/message", produces = MediaType.TEXT_PLAIN_VALUE)
//    public @ResponseBody
//    String index() throws IOException {
//        ClassPathResource resource = new ClassPathResource("static/index.html");
//        return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
//  }
//}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReactController {

	@RequestMapping("/message")
    public String index() {
        return "index";
    }
}


