package Arrays;

public class wraper1 {
    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "12";
        System.out.println(s1+s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println(i1+i2);

        String s3 = "324.4";
        String s4 = "23.43";
        System.out.println(s3+s4);

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);
        System.out.println(f1+f2);

        String str = "false";
        boolean b = Boolean.parseBoolean(str);

        if(b)
            System.out.println("this is true");
        else
            System.out.println("this is false");

        String s6 = "d";
        char c = s6.charAt(0);

        String ss = ""+c;

        System.out.println("ss="+ss);




    }
}
