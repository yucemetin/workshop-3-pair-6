public class Student {
    private String firstName;
    private String latName;
    private int studentNo;
    private String nationalityId;
    private int group;

    public Student(String firstName, String latName, int studentNo, String nationalityId, int group) {
        this.firstName = firstName;
        this.latName = latName;
        this.studentNo = studentNo;
        this.nationalityId = nationalityId;
        this.group = group;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
