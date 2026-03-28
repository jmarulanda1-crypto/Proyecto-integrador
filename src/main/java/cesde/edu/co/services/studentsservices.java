package cesde.edu.co.services;

import cesde.edu.co.models.Student;

import java.util.List;


public interface studentsservices {
}
    Student create(Student student);

    boolean update(Student studentUpdate):

     boolean delete(Long studentId);

     Student findById(Long studentId);

     List <Student>findAll();

