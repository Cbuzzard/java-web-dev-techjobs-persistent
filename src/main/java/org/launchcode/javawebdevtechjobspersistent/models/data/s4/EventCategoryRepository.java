package org.launchcode.javawebdevtechjobspersistent.models.data.s4;

import org.launchcode.javawebdevtechjobspersistent.models.s4.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chris Bay
 */
@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {

}
