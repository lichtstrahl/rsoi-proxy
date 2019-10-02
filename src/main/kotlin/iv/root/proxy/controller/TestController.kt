package iv.root.proxy.controller

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

@Slf4j
@Controller
class TestController {

    private val logger = LoggerFactory.getLogger(this.javaClass.name)

    @RequestMapping(value = ["/test"], method = [RequestMethod.GET])
    public fun home() : ResponseEntity<String> {
        val scheduler: ScheduledExecutorService = Executors.newScheduledThreadPool(1)


        scheduler.schedule({
            logger.info("TASK!")
        }, 10, TimeUnit.SECONDS);
        return ResponseEntity.ok("Hello, World!")
    }
}