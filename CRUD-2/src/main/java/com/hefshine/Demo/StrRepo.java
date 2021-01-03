package com.hefshine.Demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrRepo extends JpaRepository<Student, Integer> {

}
