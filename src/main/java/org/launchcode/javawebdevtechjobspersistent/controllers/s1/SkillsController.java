package org.launchcode.javawebdevtechjobspersistent.controllers.s1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("s1")
    @ResponseBody
    public static String frontPage() {
        return "<h1>Skills Tracker</h1>"+
                "<h2>languages</h2>"+
                "<ol><li>Java</li><li>Javascript</li><li>Python</li></ol>" +
                "<a href='/s1/form'><button>form</button></a>";
    }

    @GetMapping("s1/form")
    @ResponseBody
    public String form() {
        String html = "<html>" +
                "<div>" +
                "  <form method=\"get\" action=\"/s1/favorites\" class=\"language-picker__form\">" +
                "    <label for=\"coder\">Name:</label>" +
                "    <input name=\"coder\"><br>" +
                "    <label for=\"languageone\">My favorite language:</label>" +
                "    <select name=\"languageone\">" +
                "      <option value=\"java\">Java</option>" +
                "      <option value=\"javascript\">Javascript</option>" +
                "      <option value=\"python\">Python</option>" +
                "    </select><br>" +
                "    <label for=\"languagetwo\">My second favorite language:</label>" +
                "    <select name=\"languagetwo\">" +
                "      <option value=\"java\">Java</option>" +
                "      <option value=\"javascript\">Javascript</option>" +
                "      <option value=\"python\">Python</option>" +
                "    </select><br>" +
                "    <label for=\"languagethree\">My third favorite language:</label>" +
                "    <select name=\"languagethree\">" +
                "      <option value=\"java\">Java</option>" +
                "      <option value=\"javascript\">Javascript</option>" +
                "      <option value=\"python\">Python</option>" +
                "    </select><br>" +
                "   <button type=\"submit\">Submit</button>" +
                "  </form>" +
                "</div>" +
                "</html>";
        return html;
    }

    @RequestMapping(value="s1/favorites",method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String favorites(@RequestParam String coder, @RequestParam String languageone, @RequestParam String languagetwo, @RequestParam String languagethree){
        String html = "<html>" +
                "<h2>"+coder+"</h2>"+
                "<ol><li>"+languageone+"</li><li>"+languagetwo+"</li><li>"+languagethree+"</li></ol>" +
                "</html>";
        return html;
    }

}
