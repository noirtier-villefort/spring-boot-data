package org.noirtier.springbootdata.repositories;

import org.noirtier.springbootdata.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
