package nunez.emman.footballdataservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Emman Nunez
 * @date 1/28/2021
 */

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
