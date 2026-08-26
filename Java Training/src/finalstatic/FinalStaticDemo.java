package finalstatic;
class Student { static String college="ABC College"; final int id; Student(int id){this.id=id;} static void showCollege(){System.out.println(college);} }
public class FinalStaticDemo { public static void main(String[] args){Student.showCollege();Student s=new Student(101);System.out.println(s.id);} }
