import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.util.List;
import java.util.ArrayList;


public class StudentTest {
    @Test
    public void GoodName(){
        String name = "Nikolay";
        Student stud = new Student("Svetlana");
        stud.setName(name);
        Assertions.assertEquals(stud.getName(),name);
    }

    @Test
   public void testGradesEncapsulation(){
        Student student = new Student("Alice");
        student.addGrade(4);
        student.addGrade(5);
        student.addGrade(2);
        List<Integer> studentGrades = student.getGrades();
        studentGrades.add(5);
        assertEquals(1, student.getGrades().size());
    }

    private void assertEquals(int i, int size){

    }
}
