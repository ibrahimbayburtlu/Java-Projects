package StudentInformationSystemProgram;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    int sozNote;

    Course(String name, String code, String prefix,Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
        this.sozNote = 0;
    }
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.mpno)){
            this.teacher = t;
            System.out.println("Islem Basarili");
        }else{
            System.out.println(t.name + "Akademisyeni bu dersi veremez");
        }
    }
    public void printTeacher(){
        if (teacher != null){
            System.out.println(this.name + "dersinin Akademisyeni: "+ teacher.name);
        }else{
            System.out.println(this.name + "dersinin Akademisyen atanmamıştır.");
        }
    }
}
