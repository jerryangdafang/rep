package day27.day05;

public class Test {
    public static void main(String[] args) {
           HourlyEmployee  hourlyEmployee=new HourlyEmployee();
           hourlyEmployee.h=179;
           hourlyEmployee.m=14;
           hourlyEmployee.brh=5;
           hourlyEmployee.name="admin";
        double salary = hourlyEmployee.getSalary(6);
        System.out.println(hourlyEmployee.name+"5月的工资高为："+salary);

    }
}
