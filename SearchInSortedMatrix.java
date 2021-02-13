public class SearchInSortedMatrix{
    public static boolean search(int[][] a,int x){
        int i = 0;
        int j = a[0].length-1;
        while(i < a.length -1 && j >=0){
            if(a[i][j] == x)
                return true;
            else if(a[i][j] > x)
                j--;
            else 
                i++;
           }
        return false;
     }
    public static void main(String[] ag){
        int a[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        System.out.println(search(a,29));
       }
}