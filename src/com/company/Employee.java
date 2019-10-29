package com.company;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName(){
        return getFirstName()+" "+getLastName();
    }

    public int getAnnualSalary(){
        return getSalary()*12;
    }

    public int raiseSalary(int precent){
        return getSalary()*precent/100;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name: " + getName()+
                ", salary=" + salary +
                "]";
    }

    public static void main(String[] args) {
        System.out.println("getName() выводит имя в формате firstName+lastName, " +"\n"+
                "annualSalary = salary * 12,  raiseSalary повышается на заданный процент.\n");
        Employee employee=new Employee(1,"Ivan","Ivanov", 40000);
        System.out.println(employee.toString());
    }
}
