package StudentInformationSystemProgram;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "MAT", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Kulyutmaz", "KMY", "1111");

        Course mat= new Course("Mat", "101", "MAT", t1);
        mat.addTeacher(t1);

        Course fizik= new Course("Fizik", "102", "FZK", t2);
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya", "101", "KMY", t3);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Saban", "123", "4", mat, fizik, kimya);
        s1.addBulExamNote(100,10,100);
        s1.addBulExamSozNote(60,70,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4", mat, fizik, kimya);
        s2.addBulExamNote(50,30,70);
        s2.addBulExamSozNote(40,50,60);
        s2.isPass();
    }
}
