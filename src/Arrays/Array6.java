package Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[][] data = new int[4][3];

        data[0][0] = 12;
        data[0][1] = 45;
        data[0][2] = 78;

        data[1][0] = 12;
        data[1][1] = 45;
        data[1][2] = 78;

        data[2][0] = 12;
        data[2][1] = 45;
        data[2][2] = 78;

        data[3][0] = 12;
        data[3][1] = 45;
        data[3][2] = 78;

        System.out.println("row =" + data.length);
        System.out.println("col =" + data[0].length);


                             // first to create for loop for row 0,0 -
                            //inside row loop need to create col loop 0,0 - 0,3
                            //go back to row and start with 1,0
                            //wiseversa

        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[0].length; j++)
            {
                System.out.print(data[i][j]);
            }
            System.out.println();

        }
    }
}