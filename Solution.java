import java.io.*;
import java.util.*;
public class Solution {
 static BufferedReader bf;
    public static void main(String[]args)throws IOException{

        bf = new BufferedReader(new InputStreamReader(System.in));
        int t = nextInt();
        while(t-->0){
           

        }
      

   } 
  









   // code for input
   public static String[] nextStringArray()throws IOException{
       return  bf.readLine().split(" ");
   }
   
   public static int nextInt()throws IOException{
       return Integer.parseInt(bf.readLine());
   }
   public static long nextLong()throws IOException{
       return Long.parseLong(bf.readLine());
   }
   public static String nextString()throws IOException{
       return bf.readLine();
   }
   public static int[] nextIntArray(int n)throws IOException{
       String[]str = bf.readLine().split(" ");
       int[]arr = new int[n];
       for(int i =0;i<n;i++){
           arr[i] = Integer.parseInt(str[i]);
       }
       return arr;
   }
   public static long[] nextLongArray(int n)throws IOException{
       String[]str = bf.readLine().split(" ");
       long[]arr = new long[n];
       for(int i =0;i<n;i++){
           arr[i] = Long.parseLong(str[i]);
       }
       return arr;
   }
   public static int[][] newIntMatrix(int r,int c)throws IOException{
       int[][]arr = new int[r][c];
       for(int i =0;i<r;i++){
           String[]str = bf.readLine().split(" ");
           for(int j =0;j<c;j++){
               arr[i][j] = Integer.parseInt(str[j]);
           }
         }
         return arr;
   }
 
   public static long[][] newLongMatrix(int r,int c)throws IOException{
       long[][]arr = new long[r][c];
       for(int i =0;i<r;i++){
           String[]str = bf.readLine().split(" ");
           for(int j =0;j<c;j++){
               arr[i][j] = Long.parseLong(str[j]);
           }
         }
         return arr;
   }
 
}
