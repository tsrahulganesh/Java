package Date_String;

public class string6 {
    public static void main(String[] args) {
        String data = "Hey baby you are so lovely";
        String[] stringArray = data.split(" ");

        for(int i=0;i<stringArray.length;i++)
        {
            //in test case 2 we need to split only y words

            String  temp = stringArray[i];
            int data1 = temp.length();

            if(stringArray[i].charAt(data1-1)=='y');//check whether the word ends with y

            System.out.println(stringArray[i]);


        }

    }
}
