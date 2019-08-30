package app;

import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/app")
public class Controller {

    @GetMapping
    public String showStatus() {
        return new SimpleDateFormat("dd MMM yyyy HH:mm:ss").format(new Date());
    }

    @GetMapping("/go")
    public BaseResponse pay(@RequestParam(value = "key") String key) {

        final BaseResponse response;

        String message = "MESSAGE: id = " + key;
        response = new BaseResponse("SUCCESS_STATUS", 100, message);

        return response;
    }
}
