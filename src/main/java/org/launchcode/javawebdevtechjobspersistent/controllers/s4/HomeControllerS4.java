package org.launchcode.javawebdevtechjobspersistent.controllers.s4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("s4")
public class HomeControllerS4 {

    @GetMapping
    public String index() {
        return "s4/index";
    }

}
