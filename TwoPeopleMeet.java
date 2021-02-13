public class TwoPeopleMeet{
   public static boolean isMeetUsingRelativeSpeed(int d1,int d2,int v1,int v2){
    if(d1>=d2 && v1>=v2)
      return false;
    else if(d2>=d1 && v2>=v1)
      return false;

     int D = d1-d2;
     int V = v2-v1;

     if(D % V == 0)
      return true;

     return false;
    }
  public static void main(String[] ag){
    int d1 = 10;
    int d2 = 5;

    int v1 = 2;
    int v2 = 3;
    
    if(isMeetUsingRelativeSpeed(d1,d2,v1,v2))
      System.out.println("Yes");
    else
      System.out.println("No");
    
   }
  }
