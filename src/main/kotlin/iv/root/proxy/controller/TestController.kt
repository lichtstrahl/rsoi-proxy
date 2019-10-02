package iv.root.proxy.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class TestController {
    @RequestMapping(value = ["/test"], method = [RequestMethod.GET])
    public fun home() : ResponseEntity<String> {
        return ResponseEntity.ok("Hello, World!")
    }
}