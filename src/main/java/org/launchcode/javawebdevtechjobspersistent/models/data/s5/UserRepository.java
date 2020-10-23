package org.launchcode.javawebdevtechjobspersistent.models.data.s5;

import org.launchcode.javawebdevtechjobspersistent.models.s5.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
