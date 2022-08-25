package StudentInformationSystemProgram;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    Student(String name,String classes,String stuNo,Course c1,Course c2,Course c3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
    }
    public void addBulExamNote(int c1,int c2,int c3){
        if (c1 >= 0 && c1 <= 100){
            this.c1.note = c1;
        }
        if (c2 >= 0 && c2 <= 100){
            this.c2.note = c2;
        }
        if (c3 >= 0 && c3 <= 100){
            this.c3.note = c3;
        }
    }
    public void addBulExamSozNote(int c1,int c2,int c3){
        if (c1 >= 0 && c1 <= 100){
            this.c1.sozNote = c1;
        }
        if (c2 >= 0 && c2 <= 100){
            this.c2.sozNote = c2;
        }
        if (c3 >= 0 && c3 <= 100){
            this.c3.sozNote = c3;
        }
    }
    void isPass(){
        System.out.println("==================");
        this.average = calcAverage();
        if (this.average >= 55){
            System.out.println("Sinifi basarili gectiniz.");
            this.isPass = true;
        }else {
            System.out.println("Sinifta kaldiniz!");
        }
        printNote();
    }
    public int calcAverage(){
        return (int)((this.c1.note * 0.8 + this.c1.sozNote *0.2) +(this.c2.note * 0.8 + this.c2.sozNote *0.2)+(this.c3.note * 0.8 + this.c3.sozNote *0.2)) / 3;
    }
    void printNote() {
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println(this.c1.name + " SozNotu\t:" + this.c1.sozNote);
        System.out.println(this.c2.name + " SozNotu\t:" + this.c2.sozNote);
        System.out.println(this.c3.name + " SozNotu\t:" + this.c3.sozNote);
        System.out.println("Ortalama:" + this.average);

    }
}
