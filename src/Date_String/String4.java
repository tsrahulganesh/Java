package Date_String;

public class String4
{
    public static void main(String[] args) {

        String data = "KISHOR";

        System.out.println(data.substring(0)+data.substring(0,0));
        System.out.println(data.substring(1)+data.substring(0,1));
        System.out.println(data.substring(2)+data.substring(0,2));
        System.out.println(data.substring(3)+data.substring(0,3));

        for(int i=0;i<data.length();i++)
           System.out.println(data.substring(i)+data.substring(0,i));

    }
}
