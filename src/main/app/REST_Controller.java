package time.track.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REST_Controller {
    @RequestMapping(value = {"/next"}, method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String getNext() {
        double random = Math.random();
        String answer = "#### " + random;
        System.out.println(answer);
        return answer;
    }
}
