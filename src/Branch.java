import java.util.ArrayList;
import java.util.List;

public class Branch extends Organization{
    private String nameBranch;

    private Organization organization;

    private List<Employee> employeeList;
    private List<Department> departments;

    public String getNameBranch() {
        return nameBranch;
    }

    public Organization getOrganization() {
        return organization;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Branch(String name, Organization organization) {
        super(name);
        nameBranch = name;
        this.organization = organization;
        organization.addBranch(this);
        departments = new ArrayList<>();
        employeeList = new ArrayList<>();


    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder( "Branch{" +
                "nameBranch='" + nameBranch +
                ", organization=" + organization.getNameOrg() +
                "}" + "\n");

        for (Employee emp: employeeList
             ) {
            sb.append(emp.toString());
            sb.append("\n");
        }
        return sb.toString();

    }

    public void addDepartament(Department departament){
        departments.add(departament);
        employeeList.addAll(departament.getEmployees());

    }

    public void addEmp(Employee emp){
        employeeList.add(emp);
    }

    public void sortByName(){
        employeeList.sort(new ComparatorEmpLastName());
    }
    public void sortByAge(){
        employeeList.sort(new ComparatorEmpAge());
    }
}
