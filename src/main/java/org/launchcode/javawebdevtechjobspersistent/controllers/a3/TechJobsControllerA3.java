package org.launchcode.javawebdevtechjobspersistent.controllers.a3;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsControllerA3 {

    static HashMap<String, String> columnChoices = new HashMap<>();
    public static HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsControllerA3() {
        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");

        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
    }

    @ModelAttribute("actions")
    public static HashMap<String, String> getActionChoices() {
        return actionChoices;
    }

}
