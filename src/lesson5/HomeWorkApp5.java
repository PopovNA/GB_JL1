package lesson5;

public class HomeWorkApp5 {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "Director", "+7(777)777-77-77", 10000f, 35);

        System.out.println("FIO: " + employee1.getName() + " in position " + employee1.getPosition());

        Employee[] employees = new Employee[5];
        employees[0] = new Employee(employee1.getName(), employee1.getPosition(), employee1.getPhoneNumber(), employee1.getSalary(), employee1.getAge());
        employees[1] = new Employee("Ivanova Maria Ivanovna", "Account manager", "+7(777)555-55-55", 7000f, 33);
        employees[2] = new Employee("Svetova Svetlana Svyatoslavovna", "Sale manager", "+7(777)123-45-67" , 3000f, 21);
        employees[3] = new Employee("Vasilev Vasiliy Vasilyevich", "Driver", "+7(777)123-45-68" , 2000f, 45);
        employees[4] = new Employee("Borisov Boris Borisovich", "Courier aka top-top manager", "+7(777)123-45-68" , 1000f, 18);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println("FIO: " + employees[i].getName() + " in position " + employees[i].getPosition());
            }
            employees[i].incSalary4more35();
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println("ID: " + employees[i].getUid() + " Salary " + employees[i].getSalary());
        }

    }
}
