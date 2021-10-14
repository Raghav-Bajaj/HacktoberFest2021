import java.util.*;

class Result{
  static int balancedString(String s){
	  Stack<Character> str = new Stack<Character>();
    int i;
    for( i=0;i<s.length();i++)
    {
       if ( s.charAt(i)!='(' && s.charAt(i) != '{' && s.charAt(i) != '[' && s.charAt(i) != ')' && s.charAt(i) != '}' && s.charAt(i) != ']')
        {
            continue;
        }
      else  if ( s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' )
           {
               str.push(s.charAt(i));
           }
      else if(!str.isEmpty())
      {
        char x=str.pop();
        if(s.charAt(i)=='(' && x!=')')
        {
          return i;
        }
        if(s.charAt(i)=='}' && x!='{')
        {
          return i;
        }
        if(s.charAt(i)=='[' && x!=']')
        {
          return i;
        }
      }
      else
      {
        return i;
      }
    }
    if (!str.isEmpty())
           return i;
       return -1;
  }
}

class Main
{
  public static void main(String[] args){
    String s1;
    Scanner s=new Scanner(System.in);
    s1=s.nextLine();
    Result result = new Result();
    System.out.println(result.balancedString(s1));
  }
}
