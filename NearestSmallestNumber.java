import java.util.Stack; 
    
class NearestSmallestNumber { 
  
    static void printPrevSmaller(int arr[], int n) { 
        Stack<Integer> S = new Stack<>(); 
  
        for (int i = 0; i < n; i++) { 
            while (!S.empty() && S.peek() >= arr[i]) { 
                S.pop(); 
            }   
            if (S.empty()) { 
                System.out.print("_, "); 
            } else 
            { 
                System.out.print(S.peek() + ", "); 
            } 
            S.push(arr[i]); 
        } 
    } 
  
    public static void main(String[] args) { 
        int arr[] = {1, 3, 0, 2, 5}; 
        int n = arr.length; 
        printPrevSmaller(arr, n); 
    } 
} 