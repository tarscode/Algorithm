package nowcoder;

public class test{
static{
   int x=1;
}
static int x,y;
public static void main(String args[]){
   x--;
   myMethod( );
   System.out.println(x+y+ ++x);
}
public static void myMethod( ){
  y=x++ + ++x;
 }
}