package sortingusingcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {

        Employee employee=new Employee(1,32,"Rahim",new Address("Gazipur",1621));
        Employee employee1=new Employee(2,12,"Karim",new Address("Chadpur",4565));
        Employee employee2=new Employee(3,87,"Jeba",new Address("Rangpur",2321));
        Employee employee3=new Employee(4,23,"Naba",new Address("Dhaka",6523));
        Employee employee4=new Employee(5,10,"Shafa",new Address("Rajshahi",9867));

        List<Employee> employees=new ArrayList<>( );
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        System.out.println("Unsorted Employee List: "+employees);
        System.out.println("====================================================================================");

        Collections.sort(employees,new AgeComparator());
        System.out.println("Sorted Employee List Using Age: "+employees);
        System.out.println("====================================================================================");

        Collections.sort(employees,new NameComparator());
        System.out.println("Sorted Employee List Using Name: "+employees);
        System.out.println("====================================================================================");

        Collections.sort(employees,new AddressComparator());
        System.out.println("Sorted Employee List Using Address: "+employees);
        System.out.println("====================================================================================");



    }
}
