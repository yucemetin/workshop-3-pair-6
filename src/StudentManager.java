import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentService {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
        students.add(new Student("student1", "xxx", 1, "12313", 123));
        students.add(new Student("student2", "xxx", 2, "12313", 123));
        students.add(new Student("student3", "xxx", 3, "12313", 123));
        students.add(new Student("student4", "xxx", 4, "12313", 123));
    }

    @Override
    public void add(Student student) {
        for (Student student1 : students) {
            if (student1.getStudentNo() == student.getStudentNo()) {
                System.out.println("Öğrenci zaten kayıtlı!!");
                return;
            }
        }

        students.add(student);
    }

    @Override
    public void delete(int id) {
        for (Student student : students) {
            if (student.getStudentNo() == id) {
                students.remove(student);
                return;
            }
        }
    }

    @Override
    public void update(int id, Student newStudent) {
        for (Student student : students) {
            if (student.getStudentNo() == id) {
                student.setFirstName(newStudent.getFirstName());
                student.setLatName(newStudent.getLatName());
                student.setStudentNo(newStudent.getStudentNo());
                student.setNationalityId(newStudent.getNationalityId());
                student.setGroup(newStudent.getGroup());
                return;
            }
        }
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
