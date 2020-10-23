package org.launchcode.javawebdevtechjobspersistent.models.data.s5;

import org.launchcode.javawebdevtechjobspersistent.models.s5.JobS5;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface JobRepositoryS5 extends CrudRepository<JobS5, Integer> {
}

