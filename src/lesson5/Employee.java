package lesson5;

public class Employee {

    private String name;
    private String position;
    private String phoneNumber;
    private float salary;
    private int age;
    private int uid;

    private static int id = 0;

    public Employee(String name, String position, String phoneNumber, float salary, int age){
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        this.uid = ++id;
    }

    public void incSalary4more35(){
        if (this.age > 35) {
            this.salary += 500;
        }
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getUid() {
        return uid;
    }
}
