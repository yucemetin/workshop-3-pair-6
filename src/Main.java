public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        System.out.println(studentManager.getAll().get(3).getFirstName());
        studentManager.add(new Student("metin", "yüce", 123, "123", 12));
        System.out.println(studentManager.getAll().get(4).getFirstName());
        studentManager.add(new Student("metin", "yüce", 123, "123", 12));
        System.out.println(studentManager.getAll().get(4).getFirstName());
        studentManager.update(123, new Student("deneme", "asd", 123, "123", 12));
        System.out.println(studentManager.getAll().get(4).getFirstName());
        studentManager.delete(123);
        System.out.println(studentManager.getAll().get(3).getFirstName());

        for (Student student : studentManager.getAll()) {
            System.out.println("---------");
            System.out.println(student.getStudentNo());
            System.out.println(student.getFirstName());
            System.out.println(student.getLatName());
            System.out.println(student.getNationalityId());
            System.out.println(student.getGroup());
        }

    }
}