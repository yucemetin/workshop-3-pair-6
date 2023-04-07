import java.util.List;

public interface StudentService {
    void add(Student student);

    void delete(int id);

    void update(int id, Student student);

    List<Student> getAll();
}
