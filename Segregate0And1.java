public class Segregate0And1{
    static void segregate(int[] a){
       int i = 0;
       int j = a.length-1;
       while(i<j){
           while(a[i] == 0 && i<j)
               i++;
           while(a[j] == 1 && i<j)
               j--;
           if(i<j){
               a[j] = 1;
               a[i] = 0;
               i++;
               j--;
            }
         }
        for(int k = 0;k<a.length;k++)
            System.out.print(a[k]+" ");
    }    
    public static void main(String[] ag){
        int a[] = { 0, 1, 0, 1, 1, 1 };
        segregate(a);
     }
}