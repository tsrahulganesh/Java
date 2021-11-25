package Inheritance;

public class Employee {
    int salary = 10000;
    void salary()
    {

        System.out.println(salary);
    }

}

class prog1 extends Employee {
    int bonus = 5000;

    void bonus() {

        System.out.println(bonus);
        System.out.println(salary);
    }

    public static void main(String[] args) {
       Employee a = new Employee();
        a.salary();

        prog1 b = new prog1();
        b.salary();
        b.bonus();

    }
}
