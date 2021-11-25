package Inheritance;

public class Emp {
    int salary = 100000;


    void methodEmp()
    {
        System.out.println("methodEmp");
        System.out.println(salary);

    }

}
    class programmer extends Emp
    {
        int bonus = 5000;
        void methodprogrammer()
        {
            System.out.println("methodprogrammer");

        }
    public static void main (String[] args){

        Emp p = new Emp();
        p.methodEmp();


        programmer prog = new programmer();

        prog.methodprogrammer();
        prog.methodEmp();
        System.out.println(prog.bonus);
        System.out.println(prog.salary);

        }


    }

