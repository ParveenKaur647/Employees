
import java.util.Scanner;
import java.util.*;

class Employee {
    String name;
    double salary;
    float hours;
    float rate;
    public Employee() {
        name = "Parveen Kaur";
        hours = 10;
        rate = 100;
        salary = rate * hours;
    }
    public void getInfo()
    {
        System.out.printf("Final Salary is $%,.2f\n",salary);
    }
}
public class Main
{
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.getInfo();
    }
}