package com.admin.SpringBootCrud.repository;

import com.admin.SpringBootCrud.bean.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, String> {




}
