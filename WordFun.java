//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordFun
{
 private String word;

 public WordFun()
 {
   word = " ";

 }

 public WordFun(String w)
 {
   setWord(w);

 }

 public void setWord(String w)
 {
   word = w;

 }

 public void makeUpper()
 {
   word = word.toUpperCase();

 }

 public void addHyphen()
 {
  int loc;
    loc = word.indexOf(" ");
  word = word.substring(0,loc)+ "-" + word.substring(loc+1);
 
 }

 public String toString()
 {
  return word;
 }
}