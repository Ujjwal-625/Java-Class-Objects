public class Student {
    String name;
    int RollNumber,marks;

    Student(String name,int RollNumber,int marks){
        this.name=name;
        this.RollNumber=RollNumber;
        this.marks=marks;
    }

    void getGrade(){
        if(this.marks>=90){
            System.out.println("A");
        }else if(this.marks>=80){
            System.out.println("B");
        }else if(this.marks>=70){
            System.out.println("C");
        }else if(this.marks>=60){
            System.out.println("D");
        }else if(this.marks>=50){
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }
    }

    void details(){
        System.out.println("Name "+name);
        System.out.println("RollNumber "+RollNumber);
        System.out.println("Marks "+marks);
    }
    public static void main(String[] args) {
        Student s=new Student("ABC",67,89);
        s.details();
        s.getGrade();
    }
}
