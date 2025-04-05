import java.util.*;

class Employee implements Comparable {
    private String name;
    private int empId;
    private String designation;
    private double salary;
    private long ph;

    public String getName() {
    Employee() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getDesignation() {
        return designation;
    }

    public long getPh() {
        return ph;
    }

    public double getSalary() {
        return salary;
    }

    Employee(String name, int empId, String designation, double salary, long ph) {
        this.designation = designation;
        this.empId = empId;
        this.name = name;
        this.ph = ph;
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;

        return (int) (this.ph - e.ph);
    }
    // public int compareTo(Object o) {
    //     Employee e = (Employee) o;

    //     return (int) (this.salary - e.salary);
    // }
    // public int compareTo(Object o) {
    //     Employee e = (Employee) o;

    //     return this.empId - e.empId;
    // }
    
    @Override
    public String toString() {
        return "name: "+name+",EmpId: "+empId+",designation: "+designation+",salary: "+salary+",phone Number: "+ph;
    }
}

public class Emp {
    public static void main(String[] args) {
        Employee[] e = {new Employee("nani",1001,"SDE",92439.5,9834571881l),
                        new Employee("sani",1000,"TESTER",92737.5,9436871881l),
                        new Employee("qani",1005,"MGR",94739.5,9837898881l),
                        new Employee("rani",1007,"TRAINER",93739.5,98376871881l),
                        new Employee("tani",1002,"AE",92239.5,9837874381l),
                        new Employee("fani",1003,"BD",92759.5,9837865881l)
                        };
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
        Arrays.sort(e);
        System.out.println("-----------------------------------");
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}