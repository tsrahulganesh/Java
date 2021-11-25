


/*String to date

String dateStr0= "23-June-2016"
        → dd-MMMM-yyyy

        String dateStr1= "23 | June 16  8:34"
        → dd | MMMM yy hh:mm

        Homework :
        String dateStr2= "2016-06-23 | 8:34:23"
        → yyyy-MM-dd | hh:mm:ss


        String dateStr3= "Thursday 2016/06/23"
        → EEEE yyyy/MM/dd

        String dateStr4= "23-06-2016 | thu | 8:34"
        → dd-MM-yyyy | E | hh:mm

        String dateStr5= "8:34:22"
        → hh:mm:dd*/

package Date_String;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {

    public static void main(String[] args) {

        Date obj1 = new Date();
        System.out.println(obj1);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String obj11 = sd.format(obj1);
        System.out.println(obj11);


        //datedemo obj2 = new datedemo();
        //System.out.println(obj2);
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        String obj22 = sd1.format(obj1);
        System.out.println(obj22);

        //datedemo obj3 = new datedemo();
        //System.out.println(obj3);
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        String obj33 = sd2.format(obj1);
        System.out.println(obj33);

        //datedemo obj4 = new datedemo();
        //System.out.println(obj4);
        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String obj44 = sd3.format(obj1);
        System.out.println(obj44);

        //datedemo obj5 = new datedemo();
        //System.out.println(obj5);
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        String obj55 = sd4.format(obj1);
        System.out.println(obj55);

        //datedemo obj6 = new datedemo();
        //System.out.println(obj6);
        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:dd");
        String obj66 = sd5.format(obj1);
        System.out.println(obj66);
    }
}
/*Result
        Tue Nov 09 15:48:06 IST 2021
        09/11/2021
        09 | November 21 03:48
        2021-11-09 | 03:48:06
        Tuesday 2021/11/09
        09-11-2021 | Tue | 03:48
        03:48:09*/





