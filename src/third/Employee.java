package third;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public void setAge(int age) {
        if (age < 18) {
            String employeeAge = Integer.toString(age);
            String ageChecked = String.join(" ", "Employee", fullName, "must be over 18", "he/she is only", employeeAge);
            System.out.println(ageChecked);
        }
        this.age = age;
    }

    public void setFullName(String fullName) {
        int count = 1;
        fullName = fullName.trim();
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ' && fullName.charAt(i + 1) != ' ') {
                count++;
            }
        }
        if (count < 3) {
            System.out.println("Enter your full name");
        } else if (count > 3) {
            System.out.println("Too many words");
        }
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        char[] numberCheck = phoneNumber.toCharArray();
        if (numberCheck.length < 13) {
            System.out.println("Enter your phone number using country code");
        } else if (numberCheck.length > 13) {
            System.out.println("Too much numbers");
        }
        this.phoneNumber = phoneNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public boolean isAllowedToWork() {
        if (age < 18) {
            String employeeAge = Integer.toString(age);
            String ageChecked = String.join(" ", "Employee", fullName, "must be over 18", "he/she is only", employeeAge);
            System.out.println(ageChecked);
        }
        return true;
    }

    public boolean isFullName() {
        int count = 1;
        fullName = fullName.trim();
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ' && fullName.charAt(i + 1) != ' ') {
                count++;
            }
        }
        if (count < 3) {
            System.out.println("Enter your full name");
        } else if (count > 3) {
            System.out.println("Too much words");
        }
        return true;
    }

    public boolean isPhoneNumberCorrect() {
        char[] numberCheck = phoneNumber.toCharArray();
        if (numberCheck.length < 13) {
            System.out.println("Enter your phone number using country code");
        } else if (numberCheck.length > 13) {
            System.out.println("Too much numbers");
        }
        return true;
    }*/

    public Employee(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}