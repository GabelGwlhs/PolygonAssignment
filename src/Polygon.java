import java.text.DecimalFormat;

public class Polygon {

        //Instance variables (of appropriate type) for the number of sides, side length, shape type (String), and any others as needed
        //2 constructors
        //Default is Polygon()
        //Overloaded is Polygon(number of sides, side length, type of shape)
        //Accessors as needed
        //Must include getNumSides, getSideLength, and getShapeType
        //Validation checks
        //Is the number of sides valid? Side lengths?
        /*Mutators as needed
        Validation checks
        Perimeter calculation method called calculatePerimeter
        A toString method that will print the name, number of sides, and its perimeter formatted to 3 decimal places
        Extra credit: Write a method called calculateArea that will find the area of any n-sided polygon to 3 decimal places*/
        /**
         * @file polygon.java
         * @author Gracie Gabel
         * @date 2/2/2022
         * @description Creates a polygon with the give num of sides
         * the side length and the type of polygon, or uses a constructor to set those values.
         * Also calculates the permiter.
         */
        private sides;
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
         * @file polygon.java
         * @author Gracie Gabel
         * @date 2/2/2022
         * @description Creates a polygon with the give num of sides
         * the side length and the type of polygon, or uses a constructor to set those values.
         * Also calculates the permiter.
         */
        public Polygon(int ns, double sl,String st){
            if(sideLength>0){
                sideLength = sl;
            }else{
                sideLength=1.0;
            }
            if(sides=3);
            type = st;
            sides = ns;}
            else{
                System.out.println("Not a valid polygon");
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
            DecimalFormat df = new DecimalFormat(pattern:"#.###");
            String f ="Your shape is a "+type+" and it has "+sides+" sides. It has a side length of "+df.format(sideLength)+". It has a perimeter of"+df.format(per) units.";

        }
    }
