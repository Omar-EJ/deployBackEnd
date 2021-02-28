package com.SafeExam.SafeExam.repositories;

import com.SafeExam.SafeExam.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User, Long> {

    User findByMailAndPassword(String mail, String password);
}
