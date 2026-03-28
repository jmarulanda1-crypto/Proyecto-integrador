package cesde.edu.co.Repository.impl;

import cesde.edu.co.models.Student;

import java.util.List;

public class   StudentServices implements StudentServices {

 private final studentRepositoryInMemory studentRepositoryInMemory;

public studentRepositoryInMemory(studentRepositoryInMemory studentRepositoryInMemory)
    this.studentRepositoryInMemory = studentRepositoryInMemory;

@Override
public Student create(Student student) {
    if (isInvalidStudent(student) || studentRepositoryInMemory.existByDocumentNumber(student.getDocumentNumber())){
        return null;
    }
    return studentRepositoryInMemory.create(student);
}
@Override
public boolean update(Student studentUpdate) {
    return studentRepositoryInMemory.update(studentUpdate);
}
@Override
public Student  findById(Long studentId) {
    return studentRepositoryInMemory.findById(studentId);
}
@Override
public List<Student> findAll() {
    return studentRepositoryInMemory.findAll();
}
private boolean isInvalidStudent(Student student) {
    return student == null
            ||!isNotBlanck(Student.getCode())
            ||!isNotBlanck(Student.getDocumentNumber())
            ||!isNotBlanck(Student.getFirstName())
            ||!isNotBlanck(Student.getLastName())
            ||student.getStatus() == null;
            ||!isNotBlanck(Student.getBirthDate());
}
}


private boolean isNotBlanck(String Value) {
    return Value != null && !Value.trim().isBlank();

}