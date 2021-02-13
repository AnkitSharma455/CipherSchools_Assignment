import java.util.Arrays;
public class AlternateSorting{
    static void alternateSorting(int[] a){
        Arrays.sort(a);
        int i = 0;
        int j = a.length -1;
       while(i<j)
          System.out.print(a[j--] + " " + a[i++]+" ");
       if(a.length % 2 != 0)
          System.out.print(a[i]);
     }
    public static void main(String[] ag){
        int a[] = {1, 6, 9, 4, 3, 7, 8, 2};
        alternateSorting(a);
      }
}