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

        
      
        private int sides;
        private double sideLength;
        private String type;
        private double per;
        boolean poly;

    /**
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
     * @param sl
     * @param st
     */
        public Polygon(int ns, double sl,String st){
            if(sl>0.0){
                sideLength = sl;
            }else{
                sideLength=1.0;
            }
            if(ns>=3) {
            type = st;
            sides = ns;
            }
            else{
                System.out.println("Not a valid polygon");
        }
        }

        public int getNumSides(){
            return sides;
        }
        public double getSideLength(){
            return sideLength;
        }
        public String getShapeType(){
            return type;
        }

        public double calculatePerimeter(){
        per = sides*sideLength;

        return per;

        }
        //to string
        public String toString(){
            DecimalFormat df = new DecimalFormat("#.###");
            String f ="Your shape is a "+type+" and it has "+sides+" sides. It has a side length of "+df.format(sideLength)+". It has a perimeter of "+df.format(calculatePerimeter())+" units.";
          return f;
        }
    }
