package lv.tsi.hello.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public Greeting sayHi(@RequestParam (value = "name", required = false) String name) {
        Greeting greeting = new Greeting();
        greeting.content = "Hello, my name is " + (name != null ? name : "Spring") + "!";

        return greeting;
    }
}
