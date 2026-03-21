package cesde.edu.co.Repository;

import cesde.edu.co.models.Teacher
import java.util.List

public interface TeacherRepository {

    Teacher create (Teacher teacher);

    boolean delete (long TeacherId);

    boolean update (Teacher teacherUpdate);

    Teacher findById (long id);

    List<Teacher> findAll();

    boolean existsByDocumentNumber(String documentNumber);

    Teacher findByDocumentNumber(String documentNumber);
}
