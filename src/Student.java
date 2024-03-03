public class Student {
    public String name;
    private int rno;
    double percent;
    static int numberofstudent;
    public Student(){
        System.out.println("hello bacho");
    }
    public Student(String name,int rno,double percent) {
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numberofstudent++;
    }
    public void display(){

        System.out.println("tejash");
        System.out.println(70);
        System.out.println(85);
    }
    public int getRno(){
        return rno;
    }
    public void setRno(int rno){
        this.rno = rno;
        return;
    }

}
