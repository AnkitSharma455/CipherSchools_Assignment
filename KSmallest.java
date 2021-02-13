public class KSmallest{
    static void kSmallest(int[] a,int k){
        // take window of 3 elements assuming they are minimum

        for(int i = k;i<a.length;i++){
             int max = a[k-1];
             int max_pos = k-1;
             for(int j = k-2;j>=0;j--){
                 if(a[j]>max){
                     max = a[j];
                     max_pos = j;
                   }
                }
              if(a[i] < max){
                 int m = max_pos;
                 while(m < k-1){
                     a[m] = a[m+1];
                     m++;
                   }
                 a[k-1] = a[i];
               }
           }
         for(int i = 0;i<k;i++)
             System.out.print(a[i]+" ");
     }
    public static void main(String[] ag){
        int a[] =  {4, 2, 6, 1, 5};
        kSmallest(a,3);
    }
}