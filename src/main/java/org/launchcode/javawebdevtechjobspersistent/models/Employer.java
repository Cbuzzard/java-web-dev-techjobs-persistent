package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 5, max = 255)
    private String location;

    @OneToMany(mappedBy = "employer")
    private List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank @Size(min = 5, max = 255) String location) {
        this.location = location;
    }

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }


}
