import java.text.DecimalFormat;
/**
 * @file Polygon.java
 * @author Gracie Gabel
 * @date 2/2/2022
 * @description Creates a polygon with the give num of sides
 * the side length and the type of polygon, or uses a constructor to set those values.
 * Also calculates the permiter.
 */
public class Polygon {

        //Instance variables
      
        private int sides;
        private double sideLength;
        private String type;
        private double per;
        boolean isPolygon = true;

    /**@description takes in a polygon with no parameters and sets the defult values to the instance variables
     *
     */
    public Polygon(){
            type = "Triangle";
            sideLength = 1.0;
            per = 3.0;
        }

    /**
     *
     * @param ns number of sides
     * @param sl side length of the instance
     * @param st is the type of the shape
     * @description checks to make sure the paraameters make a valid polygon if not it sets the intsance variables
     * to the default values
     */
        public Polygon(int ns, double sl,String st){

            if(ns>=3&&sl>0.0) {
            type = st;
            sides = ns;
            sideLength = sl;
            }
            else{
                isPolygon =false;
                sides = 3;
                sideLength = 1.0;
                type = "triangle";
            }


        }

    /**
     *
     * gets the number of sides
     */

    public int getNumSides(){
            return sides;
        }

    /**
     *
     * gets the side length of the polygon
     */
    public double getSideLength(){
            return sideLength;
        }

    /**
     *
     * gets the shape type
     */
    public String getShapeType(){
            return type;
        }

    /**
     *
     * calcilates the perimeter and returns it in 3 decimal places
     */
    public double calculatePerimeter(){
        per = sides*sideLength;
        per = Math.round(per*Math.pow(10.0,3.0))/1000.0;//rounding
        return per;

        }

    /**
     *
     * To String making sure it is a valid polygon and prints out the type sides and side length stored in string f
     * then returns f
     */
    public String toString(){
           String f ="";
            if (isPolygon==true){
             f ="Your shape is a "+type+" and it has "+sides+" sides. It has a side length of "+sideLength+". It has a perimeter of "+calculatePerimeter()+" units.";
            return f;
        }
            else{
                f = "Not a valid polygon.Your polygon was given a default of "+ sides+" sides , was named "+type +", and each side has a length of "+sideLength +" units.";
                return f;
            }
    }
}
