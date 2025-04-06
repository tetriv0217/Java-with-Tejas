package Arrays_4;

class Student {
    int rollno;
    String name;
    int marks;
}

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Alice";
        s1.marks = 85;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Bob";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Charlie";
        s3.marks = 78;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(Student s:students){
            System.out.println(s.name+" roll number is: "+s.rollno+" and marks are "+s.marks+" ");
        }
    }
}
