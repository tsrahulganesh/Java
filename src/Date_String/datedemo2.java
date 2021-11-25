/*String dateStr0= "23-June-2016"
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



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo2 {


    public static void main(String[] args) throws ParseException {
        String obj1 = "12/10/2016";
        System.out.println(obj1);
        SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyyy");
        Date obj11 = sd.parse(obj1);
        System.out.println(obj11);

//simpleDateFormat(dd-mmmm-yy-hh:mm)
        //String obj2 =  "12/10/2017";
        //System.out.println(obj2);
        SimpleDateFormat sd1 = new SimpleDateFormat("dd-mmmm-yy-hh:mm");
        Date obj22 = sd1.parse(obj1);
        System.out.println(obj22);

       //Date obj3 = new Date();
        //System.out.println(date);
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date obj33 = sd2.parse(obj1);
        System.out.println(obj22);

        //Date obj4 = new Date();
        //System.out.println(date);
        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date obj44 = sd3.parse(obj1);
        System.out.println(obj22);

        //Date obj5 = new Date();
       // System.out.println(date);
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        Date obj55 = sd4.parse(obj1);
        System.out.println(obj22);

        //Date obj6 = new Date();
        //System.out.println(date);
        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:dd");
        Date obj66 = sd5.parse(obj1);
        System.out.println(obj22);
    }
}




