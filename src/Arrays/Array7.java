package Arrays;

public class Array7 {
    public static void main(String[] args) {

        float[][] data = {
                {323.9f, 434.4f, 34.4f, 67.9f},
                {34.3f, 545.34f, 3434.445f, 987.9f},
                {454.5f, 89.78f, 78.9f, 87.0f},
                {3434.78f, 787.98f, 0.0f, 00.00f}

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


