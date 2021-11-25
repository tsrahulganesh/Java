package Arrays;

public class Array {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 12;
        a[1] = 22;
        a[2] = 15;
        a[3] = 32;
        a[4] = 18;

        int l = a.length;
        System.out.println(a[2]);

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}