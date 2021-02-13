public class Sort012{
    static void sort012(int[] a){
        int i = 0;
        int j = 0;
        int k = a.length-1;
        while(j <= k){
            if(a[j] == 0){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
                j++;
              }
             else if (a[j] == 1)
                j++;
             else {
                int temp = a[k];
                a[k] = a[j];
                a[j] = temp;
                k--;
               }
            }
         for(int p = 0;p<a.length;p++)
            System.out.print(a[p]+" ");
     }
    public static void main(String[] ag){
        int a[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        sort012(a);
       }
}