package com.admin.SpringBootCrud.service;

import com.admin.SpringBootCrud.bean.Subject;
import com.admin.SpringBootCrud.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    public SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects(){
        List<Subject> subjectList = new ArrayList<>();
        subjectRepository.findAll().forEach(subjectList::add);
        return subjectList;
    }

    public void addSubject(Subject subject){
        subjectRepository.save(subject);
    }

    public void updateSubject(String id, Subject subject){
        subjectRepository.save(subject);
    }

    public void deleteSubject(String id){
        subjectRepository.deleteById(id);
    }



}
