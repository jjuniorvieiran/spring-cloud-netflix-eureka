package org.springframework.cloud.springcloudstarternetflixeurekastarter;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();
}

