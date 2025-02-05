package ru.soloboev.MyAppLR7.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.soloboev.MyAppLR7.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
