import java.time.LocalDate;

public class Boss extends Employee{
    public Boss(String firstName, String lastName, LocalDate birthDate,
                String phoneNumber, String position, double salary) {
        super(firstName, lastName, birthDate, phoneNumber, position, salary);
    }
}
