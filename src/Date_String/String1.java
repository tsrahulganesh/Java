package Date_String;

public class String1 {
    public static void main(String[] args) {
        String data1 = "amol";
        String data2 = "amol";
        String data3 = "Amol";
        String data4 = "xyx";
        String data5 = new String("amol");

        //data1==data2;
        System.out.println(data1.equals(data2)); //true
        System.out.println(data1.equalsIgnoreCase(data3));//True
        System.out.println(data1.equals(data3));//false:
        System.out.println(data1.equals(data4));//false
        System.out.println(data1.equals(data5));//true

        System.out.println(data1==data2);
        System.out.println(data1==data3);
        System.out.println(data1==data5);

        System.out.println(data1);


    }


}

