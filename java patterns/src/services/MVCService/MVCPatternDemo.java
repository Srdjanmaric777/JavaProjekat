package services.MVCService;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDataBase();

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("John");
        controller.setStudentRollNo("9");
        controller.updateView();
    }

    private static Student retrieveStudentFromDataBase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
