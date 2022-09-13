/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author 21cse125
 */
interface RegularPolygon
{
 abstract int getNumSides();
 abstract int getSideLength();
 default void getPerimeter()
 {
     
 }
 }

class EquilateralTriangle implements RegularPolygon
{
    public int fun() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    int sides;
    int sid = 3;
   EquilateralTriangle(int sides)
   {
          this.sides = sides;      
   }
    public int getNumSides()
    {
     return sid;  
    }
    public int getSideLength()
    {
        return sides;
    }
}
class Square implements RegularPolygon
{
 int sides;
 int sid = 4;
 Square (int sides)
 {
  this.sides= sides;  
 }
 public int getNumSides()
 {
  return sid;  
 }
 public int getSideLength()
 {
  return sides;  
 }
}
public class Ex4_2 {
 
  public static void main(String args[])
  {
     
     
  }
}