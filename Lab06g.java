//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab06g
{
 public static void main( String args[] )
 {
    WordFun test = new WordFun("Hello World");
    out.println(test);
    test.makeUpper();
    out.println(test);
    test.addHyphen();
    out.println(test);
  
     test = new WordFun("Jim Bob");
    out.println(test);
    test.makeUpper();
    out.println(test);
    test.addHyphen();
    out.println(test);
      
     test =  new WordFun("Computer Science");
    out.println(test);
    test.makeUpper();
    out.println(test);
    test.addHyphen();
    out.println(test);
     
     test = new WordFun("UIL TCEA");
    out.println(test);
    test.makeUpper();
    out.println(test);
    test.addHyphen();
    out.println(test);
    
     test = new WordFun("State Champions");
    out.println(test);
    test.makeUpper();
    out.println(test);
    test.addHyphen();
    out.println(test);
    //add more test cases
    
    
    
    
    
 }
}