import java.util.ArrayList;
import java.util.List;

public class Department extends Branch{

    private Branch branch;
    private List<Employee> employees;
    public Department(String name, Branch  branch) {
        super(name, branch.getOrganization());
        this.branch = branch;
        employees = new ArrayList<>();
    }

    public Branch getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(branch.getNameBranch());
        sb.append(": \n");
        for (Employee emp: getEmployees()
             ) {
            sb.append(emp.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void increaseSalary(){

        for (Employee emp: employees
             ) {
            if(!(emp instanceof Boss)) {
                if(emp.getAge()>45) emp.setSalary(emp.getSalary()+5000);
            }
            }


    }

    public void addEmp(Employee emp){
        employees.add(emp);
        branch.addEmp(emp);
    }

    public void sortByName(){
        employees.sort(new ComparatorEmpLastName());
    }
    public void sortByAge(){
        employees.sort(new ComparatorEmpAge());
    }




}
