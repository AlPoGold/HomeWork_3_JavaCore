import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String phoneNumber;
    private String position;
    private double salary;

    @Override
    public String toString() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        return "Employee{" +
                "firstName:" + firstName +
                ", lastName:" + lastName +
                ", birthDate: " + formater.format(convertToDat(birthDate)) +
                ", age: " + this.getAge() +
                ", phoneNumber: " + phoneNumber +
                ", position: " + position +
                ", salary: " + salary +
                '}';
    }

    public Employee(String firstName, String lastName, LocalDate birthDate, String phoneNumber, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        LocalDate current = LocalDate.now();
        return current.getYear() - this.birthDate.getYear();

    }

    public void printAge(){
        System.out.println(this.getAge());
    }

    public Date convertToDat(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }
}
