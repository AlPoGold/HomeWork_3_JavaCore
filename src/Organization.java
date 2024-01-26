import java.util.ArrayList;
import java.util.List;

public class Organization {

    private String nameOrg;
    private String address;
    private int countEmp;
    private Boss chiefBoss;

    List<Branch> branchList;


    public Organization(String nameOrg) {
        this.nameOrg = nameOrg;
        branchList = new ArrayList<>();
    }

    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCountEmp() {
        return countEmp;
    }

    public void setCountEmp(int countEmp) {
        this.countEmp = countEmp;
    }

    public Boss getBoss() {
        return chiefBoss;
    }

    public void setBoss(Boss boss) {
        this.chiefBoss = boss;
    }

    public List<Branch> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<Branch> branchList) {
        this.branchList = branchList;
    }
    public void addBranch(Branch br) {branchList.add(br);}

    public void updateCountEmp(){
        int count = 0;
        for (Branch br: branchList
             ) {
            count+=br.getEmployeeList().size();
        }
        setCountEmp(count);
    }

    public void averageAge(){

        double avgAge = 0;
        for (Branch br: branchList
        ) {

            for (Employee emp: br.getEmployeeList()
            ) {
                avgAge+=emp.getAge();
            }
        }

        System.out.printf("The average age of employees is %.02f\n", avgAge/countEmp);
    }
    public void averageSalary(){

        double avgSalary = 0;
        for (Branch br: branchList
        ) {

            for (Employee emp: br.getEmployeeList()
            ) {
                avgSalary+=emp.getSalary();
            }
        }

        System.out.printf("The average salary of employees is %.02f\n", avgSalary/countEmp);
    }
}
