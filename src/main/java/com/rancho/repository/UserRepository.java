package com.rancho.repository;

import com.rancho.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Long-> long is type of uniqe idwentifier
public interface UserRepository extends JpaRepository<User, Long> {
}
