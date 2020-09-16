import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class arraylis {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> arrlist=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<=n;i++)
        {
            ArrayList<Integer> row=new ArrayList<Integer>();
            int d=sc.nextInt();
            for(int j=1;j<=d;j++)
            {
                row.add(sc.nextInt());
            }
            arrlist.add(row);
        }

        //ArrayList<Integer> arr=new ArrayList<Integer>();
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            try
            {

                System.out.println(arrlist.get(x-1).get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("error");
            }
        }


    }
}
