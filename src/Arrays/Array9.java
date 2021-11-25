package Arrays;

public class Array9 {
    public static void main(String[] args) {

        String[][] data =     //string Array
                {
                {"abc", "efg", "hij", "klm"},
                {"lkj","asd","wer","hur","abc"},
                {"lkj","asd","wer","hur","abc"},
                {"abc", "efg", "hij", "klm"}

        };
        System.out.println("row="+data.length);
        System.out.println("col="+data[0].length);

        for(int i=0;i< data.length;i++)
        {
            for(int j=0;j< data[0].length;j++)
            {
                System.out.print(data [i][j]+ " ");
            }
            System.out.println();
        }

    }
}


