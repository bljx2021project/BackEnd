package controller;

import generate.RepairRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class UserController {
    @RequestMapping("/")
    public String index() {
        return "/index.html";
    }
    @RequestMapping("/repair")
    @ResponseBody
    public String repair(
            String username,
            String phone,
            String id,
            String clazz,
            String brand,
            String modelnumber,
            String description
            ) {



        return "";
    }
}
