import com.students.Student;
import com.teachers.Teacher;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student(7,"GC61");
        Student student2 = new Student(5);


        System.out.println("Id'siz öğrencilerin şehri = " + student.city);
        System.out.println("7 numaralı öğrencinin kimlik numarası = " + student1.getStudentId());

        System.out.println("5 numaralı öğrencinin ismi = " + student2.name);

        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher(4,"TK34");

        System.out.println("4 numaralı öğretmenin kimlik numarası = " + teacher1.getTeacherId());

        teacher1.setTeacherId("TK61");
        System.out.println("4 numaralı öğretmenin yeni kimlik numarası = " + teacher1.getTeacherId());


        }
    }
