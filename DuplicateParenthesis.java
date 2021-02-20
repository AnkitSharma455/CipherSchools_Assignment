import java.util.Stack; 
  
// Java program to find duplicate parenthesis in a  
// balanced expression  
public class DuplicateParenthesis { 
  
    static boolean findDuplicateparenthesis(String s) {  
        Stack<Character> Stack = new Stack<>(); 
        char[] str = s.toCharArray(); 
        for (char ch : str) { 
            if (ch == ')') {  
                char top = Stack.peek(); 
                Stack.pop(); 
  
                int elementsInside = 0; 
                while (top != '(') { 
                    elementsInside++; 
                    top = Stack.peek(); 
                    Stack.pop(); 
                } 
                if (elementsInside < 1) { 
                    return true; 
                } 
            } 
            else { 
                Stack.push(ch); 
            } 
        } 

        return false; 
    } 
   
public static void main(String[] args) { 
   
        String str = "(((a+(b))+(c+d)))"; 
  
        if (findDuplicateparenthesis(str)) { 
            System.out.println("Duplicate Found "); 
        } else { 
            System.out.println("No Duplicates Found "); 
        } 
  
    } 
} 