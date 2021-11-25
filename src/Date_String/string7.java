package Date_String;

public class string7 {


        public static void main(String[] args) {

            String data = "Hey baby you are so lovely";

            String[] stringArray = data.split(" ");

            for(int i=0;i<stringArray.length;i++)
            {

                if(stringArray[i].endsWith("y")) ;// check wherether the word(stAr[i]) ends with y
                    System.out.println(stringArray[i]);
            }


        }
    }


