package Constructors_pack1;

public class staticmethod {

    //data members
    int Registerno;
    String name;
    static String college  ="ITS" ;

    //member functions
        void display()

    {
        System.out.println("Registerno ="+ Registerno);
        System.out.println("name = "+ name);
        System.out.println("college ="+ college);

    }

    public static void main(String[] args) {
        staticmethod student1 = new staticmethod();
        staticmethod student2 = new staticmethod();
        staticmethod student3 = new staticmethod();
        student1.Registerno = 01;
        student1.name ="prabu";

        student2.Registerno = 02;
        student2.name = "prabi";
        //student2.college = "asdf"; //even if you put other college for one student by adding college as static it will be common for all
        student3.Registerno = 03;
        student3.name = "prabooo";

        staticmethod.college ="PITC" ;

        student1.display();
        student2.display();
        student3.display();



        }

    }
/*Result
withou static
Registerno =1
        name = prabu
        college =ITS
        Registerno =2
        name = prabi
        college =asdf
        Registerno =3
        name = prabooo
        college =ITS

Result :
With static
Registerno =1
name = prabu
college =PITC
Registerno =2
name = prabi
college =PITC
Registerno =3
name = prabooo
college =PITC
 */



