import java.time.LocalDate;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Organization organization = new Organization("Organization");
        Branch branch1 = new Branch("Branch_Paveletskaya", organization);
        Branch branch2 = new Branch("Branch_Kantemirovskaya", organization);
        Department programmers1 = new Department("Programmers", branch1);
        Department programmers2 = new Department("Programmers", branch2);

        Department designers = new Department("Designers", branch1);
        Department others = new Department("Other", branch2);

        Employee empl1 = new Employee("Sergey", "Ivanov",
                LocalDate.of(1965, Calendar.MAY, 1), "+7888888", "programmer" , 12345.00);


        Employee empl2 = new Employee("Olga", "Smirnova",
                LocalDate.of(1999, Calendar.APRIL, 3), "+788888778", "designer" , 166345.00);
        Employee empl3 = new Employee("Nikolay", "Kuznetsov",
                LocalDate.of(1988, Calendar.JUNE, 10), "+78888566588", "lawyer" , 2212345.00);
        Employee empl4 = new Employee("Anna", "Popova",
                LocalDate.of(1991, Calendar.DECEMBER, 1), "+78823338888", "manager" , 17723.00);
        Employee empl5 = new Employee("Alexander", "Vasiliev",
                LocalDate.of(1950, Calendar.AUGUST, 1), "+7888866688", "accountant" , 12345.00);

        Boss empl6 = new Boss("Adam", "Levov",  LocalDate.of(1966, Calendar.AUGUST, 30),
                "+3122332323", "office manager", 78976);

        Boss empl7 = new Boss("Gregory", "Vainstein",  LocalDate.of(1990, Calendar.JULY, 18),
                "+3122332323", "chief programmer", 178976);

        // FIRST BRANCH WITH PROGRAMMERS, BOSS
        programmers1.addEmp(empl1);
        programmers1.addEmp(empl6);
        designers.addEmp(empl2);
        System.out.println(programmers1);
        programmers1.increaseSalary();
        System.out.println(programmers1);
        System.out.println(branch1);

        //SECOND BRANCH WITH OTHERS, BOSS

        programmers2.addEmp(empl7);
        others.addEmp(empl3);
        others.addEmp(empl4);
        others.addEmp(empl5);

        System.out.println(branch2);


        organization.updateCountEmp();
        System.out.println(organization.getCountEmp());


        Employee empl8 = new Employee("Alexander", "Petrov",
                LocalDate.of(2000, Calendar.AUGUST, 10), "+7888866688", "programmer" , 212345.00);
        programmers2.addEmp(empl8);
        organization.updateCountEmp();
        System.out.println(organization.getCountEmp());

        organization.averageAge();
        organization.averageSalary();
        programmers1.sortByAge();
        System.out.println(programmers1);


        System.out.println(branch2);
        branch2.sortByAge();
        System.out.println(branch2);
    }
}