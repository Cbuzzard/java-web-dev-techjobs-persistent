package org.launchcode.javawebdevtechjobspersistent.models.s4;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 * Created by Chris Bay
 */
@Entity
public class EventCategory extends AbstractEntity{

    private String name;

    public EventCategory(@Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

    public EventCategory() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

}
