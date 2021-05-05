package lesson5;

public class Employee {

    private String name;
    private String position;
    private String phoneNumber;
    private float salary;
    private int age;
    private int id = 0;

    public Employee(String valueName, String valuePosition, String valuePhoneNumber, float valueSalary, int valueAge){
        name = valueName;
        position = valuePosition;
        phoneNumber = valuePhoneNumber;
        salary = valueSalary;
        age = valueAge;
        id = IdGenerator.newId();
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

    public int getId() {
        return id;
    }
}
