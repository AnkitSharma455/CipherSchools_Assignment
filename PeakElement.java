public class PeakElement{
    public static int peak(int a[],int l,int h){
        int mid  = l + (h-l)/2;
        if((mid == 0 || a[mid-1] <= a[mid] ) && (mid == a.length-1 || a[mid]>=a[mid+1]))
            return mid;
        else if (mid > 0 && a[mid-1] > a[mid] )
            return peak(a,l,mid-1);
        else
            return peak(a,mid+1,a.length-1);
       }
    public static void main(String[] ag){
        int a[] = {1,2,3,1,10,12,14,16,16};
        int element = peak(a,0,a.length-1);
        System.out.println(a[element]);
    }
}
        