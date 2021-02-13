class MajorityElement {
   static int Majority(int a[]){
       int majority_index = 0;
       int count = 1;
       for(int i = 1;i<a.length;i++){
           if(a[majority_index] == a[i])
               count++;
           else 
               count--;
           if(count==0){
               majority_index = i;
               count = 1;
              }
         }
         return a[majority_index];
     }              
   static public boolean isMajority(int [] a,int majorityElement){
       int count = 0;
       for(int i = 0;i<a.length;i++){
           if(a[i] == majorityElement)
               count++;
           }
       if(count > a.length/2)
           return true;
       return false;
     }
   public static void main(String[] ag){
       int a[] = {1,3,3,3,2,2,1,3};
       int majorityElement = Majority(a);
       if(isMajority(a,majorityElement))
         System.out.println(majorityElement);
       else 
         System.out.println("No Majority Element");
    }
}
 