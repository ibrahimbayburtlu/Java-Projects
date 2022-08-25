package SalaryCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int year = 2021;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public float tax(){
        if (this.salary > 1000){
            return 0.03F;
        }else{
            return 0;
        }
    }
    public int bonus(){
        if (this.workHours > 40){
            return (this.workHours - 40)*30;
        }
        return 0;
    }
    public float raiseSalary(){
        if (this.hireYear - year < 10){
            return 0.05F;
        }else if ((this.hireYear - year) > 9 && (this.hireYear) < 20){
            return 0.1F;
        }else{
            return 0.15F;
        }
    }
    public int calculateSalary(){
        return (int)((this.salary + bonus())-(this.salary * tax()));
    }
    public String toString(){
        System.out.println("====================");
        System.out.println("Name:"+this.name);
        System.out.println("Salary:"+this.salary);
        System.out.println("Work hours:"+this.workHours);
        System.out.println("Hire year:"+hireYear);
        System.out.println("Tax:"+(int)(this.salary *tax()));
        System.out.println("Bonus:"+bonus());
        System.out.println("Salary Raise:"+(this.salary *raiseSalary()));
        System.out.println("Tax plus Bonus Finish Salary:"+calculateSalary());
        System.out.println("Total Salary:"+(calculateSalary() + this.salary *raiseSalary()));
        return null;
    }
}
