package server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    public Result get(@RequestParam Integer arg1, @RequestParam Integer arg2) {

        Result result = new Result();
        result.add = arg1 + arg2;
        result.subtract = arg1 - arg2;
        return result;
    }

    public static class Result {
        public Integer add;
        public Integer subtract;
    }
}
