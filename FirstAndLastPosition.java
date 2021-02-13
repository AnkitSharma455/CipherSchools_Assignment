public class FirstAndLastPosition{
    static int first(int[] a,int l,int h,int x){
        int mid = l + (h-l)/2;
        if((mid == 0 || a[mid-1] < x) && a[mid] == x)
           return mid;
        else if (mid == 0 || a[mid-1] >= x)
           return first(a,l,mid-1,x);
        else 
           return first(a,mid+1,h,x);
       }
    static int last(int[] a,int l,int h,int x){
        int mid = l + (h-l)/2;
        if((mid == a.length-1 || a[mid+1] >x) && a[mid] == x)
           return mid;
        else if (mid == a.length-1 || a[mid+1] <= x)
           return first(a,mid+1,h,x);
        else 
           return first(a,l,mid-1,x);
       }
    public static void main(String[] ag){
        int a[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        System.out.println(first(a,0,a.length-1,2));
        System.out.println(last(a,0,a.length-1,2));
        
    }
}