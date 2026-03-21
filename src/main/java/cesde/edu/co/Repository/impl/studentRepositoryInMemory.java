package cesde.edu.co.Repository.impl;
import cesde.edu.co.Repository.StudentRepository;
import cesde.edu.co.Repository.impl.studentRepositoryInMemory
import cesde.edu.co.models.Student;

import java.util.ArrayList;

public class studentRepositoryInMemory implements StudentRepository{


    public class StudentRepositoryInMemory implements StudentRepository {

        private list<student> students;
        private long nextStudentId;

        public StudentRepositoryInMemory() {
            this.students = new ArrayList<>();
            this.nextStudentId = 1L;
        }

        @Override
        public student create(student student) {
            if (student==null){
                return null;
            }
            if (findByDocumentNumber(student.getDocumentNumber())){
                return null;
            }
            student.setstudentId(nextStudentId++);
            student.add(student);
            return student;
        }

        @Override
        public boolean delete(long studentId) {
            return false;
        }
        Student student =finById(studentId);


        @Override
        public boolean update(Student studentUpdate) {
            return false;
        }

        @Override
        public boolean finById(long studentId) {
            if (studentId == null || studentId < 0l){
                return false;
            }
            for (Student student : students){
                if (student.equals(student.getstudentId())){
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean finByDocumentNumber(String documentNumber) {
            return false;
        }

        @Override
        public list<Student> findAll() {
            return new ArrayList<>(students);
        }

        @Override
        public boolean existsById(long studentId) {
            if (studentId == null || studentId < 0l){
                return false;
            }
            for (Student student : students){
                if (student.equals(student.getStudentId())){
                    return true;
                }
            }


            @Override
            public boolean findByDocumentNumber;(String documentNumber) {
                if (documentNumber == null || documentNumber.isBlank()){
                    return false;
                }
                for (Student student : students){
                    if (student.getDocumentNumber().equals(documentNumber)){
                        return true;
                    }
                }
                return false;
            }
        }