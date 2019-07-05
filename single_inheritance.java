class A
{
  int x, y;

  void getdata(int a, int b)
  {
    x = a;
    y = b;
  }

  int add ()
  {
    System.out.println ("Super class method");
    return (x + y);
  }
}				//class A is superclass

class B extends A
{
  int mult ()
  {
    System.out.println ("Base class method");
    return (x * y);
  }
}				//class B is subclass of A
class Main{
  public static void main (String arg[])
  {
    int add, mult;
    B obj = new B ();		//object of base class
      obj.getdata (100, 200);	//we can also use Scanner to input user defined values here.
      add = obj.add ();		//calling add method in class A and storing it into an integer type variable since the method return an integer.
      mult = obj.mult ();	//calling mult methof of class B and storing it into an integer type variable since the method return an integer.

      System.out.println (add + "\n" + mult); /* output: Super class method                                                                                                                             
                                                         Base class method                                                                                                                              
                                                         300                                                                                                                                            
                                                         20000  */
  }
}
 //SAVE THIS JAVA CODE AS MAIN.JAVA ONLY and then compile it or run .
