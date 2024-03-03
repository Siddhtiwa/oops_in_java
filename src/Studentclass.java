public class Studentclass {

    public static void change(Student s) {
          s.name = "rohan";
    }

    public static void main(String[] args) {
        Student s1 = new Student("ranjeet",45,89);
        System.out.println(s1.numberofstudent);




        Student s2 = new Student("sumit",40,50);
        System.out.println(s2.numberofstudent);

        Student s3 = new Student("mohan",30,80);
        System.out.println(s3.numberofstudent);
    }
}
