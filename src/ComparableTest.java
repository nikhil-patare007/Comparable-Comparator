import java.util.ArrayList;
import java.util.Collections;


public class ComparableTest {
    public static void main(String[] args) {
        ArrayList<Student> al =new ArrayList<Student>();
        al.add(new Student(10,"Niks",21));
        al.add(new Student(11,"Viks",23));//gaitonde
        al.add(new Student(12,"Mukku",77));//very old

        Collections.sort(al);//sorting arraylist elements
        for(Student st:al){
            System.out.println(st.roll+" "+st.name+" "+st.age+" ");
        }
    }

}
