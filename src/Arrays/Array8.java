package Arrays;

public class Array8 {
    public static void main(String[] args) {

        int[][] data = {
                {323, 434, 34, 67},
                {34, 545, 3434,445, 987},
                {454, 89, 78, 87},
                {3434, 787, 0, 00}

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


