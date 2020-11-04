package ru.proweb4all.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.proweb4all.springbootdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
