package J3Constructor;

public class Student {
    String name;
    int roll;

    Student(){
        name = "ABC";
        roll = 123;
    }

    Student(String str,int n){
        name = str;
        roll = n;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("DEF",456);

        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}
