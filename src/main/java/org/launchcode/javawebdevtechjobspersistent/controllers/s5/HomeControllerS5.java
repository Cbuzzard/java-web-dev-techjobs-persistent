package org.launchcode.javawebdevtechjobspersistent.controllers.s5;

import org.launchcode.javawebdevtechjobspersistent.models.data.s5.JobRepositoryS5;
import org.launchcode.javawebdevtechjobspersistent.models.s5.JobS5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

/**
 * Created by LaunchCode
 */
@RequestMapping("s5")
@Controller
public class HomeControllerS5 {

    @Autowired
    private JobRepositoryS5 jobRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("jobs", jobRepository.findAll());
        return "s5/index";
    }

    @GetMapping("add")
    public String displayAddJobForm(Model model) {
        model.addAttribute("job", new JobS5());
        return "s5/add";
    }

    @PostMapping("add")
    public String processAddJobForm(@ModelAttribute @Valid JobS5 newJob,
                                       Errors errors) {

        if (errors.hasErrors()) {
            return "s5/add";
        }

        jobRepository.save(newJob);
        return "redirect:";
    }

    @GetMapping("view/{jobId}")
    public String displayViewJob(Model model, @PathVariable int jobId) {

        Optional optJob = jobRepository.findById(jobId);
        if (optJob.isPresent()) {
            JobS5 job = (JobS5) optJob.get();
            model.addAttribute("job", job);
            return "s5/view";
        } else {
            return "redirect:/";
        }
    }


}
