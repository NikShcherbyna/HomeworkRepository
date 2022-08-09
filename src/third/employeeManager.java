package third;

public class employeeManager {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Nikita", "barmen", "Cherbina@gmail.com", "+38050061642", 18);
        System.out.println(firstEmployee);
        Employee secondEmployee = new Employee("-", "-", "-", "-", 0);
        secondEmployee.setAge(12);
        secondEmployee.setFullName("Nikita Shcherbyna");
        secondEmployee.setPhoneNumber("+38050061642");
        secondEmployee.setPosition("waiter");
        secondEmployee.setEmail("Nik@gmail.com");
        System.out.println(secondEmployee);
    }
}