
//Generic student is used
public class Student implements Comparable<Student> {
    int roll;
    String name;
    int age;
    Student(int roll, String name, int age){
        this.roll=roll;
        this.name=name;
        this.age=age;
    }

      public int compareTo(Student st){
        if(age==st.age)//age is comparable
            return 0;
        else if (age>st.age)
            return 1;
        else
            return -1;
    }


}
