package org.launchcode.javawebdevtechjobspersistent.controllers.a3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("a3")
public class HomeControllerA3 extends TechJobsControllerA3 {

    @RequestMapping(value = "")
    public String index(Model model) {

        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        model.addAttribute("actions", actionChoices);

        return "a3/index.html";
    }

}
