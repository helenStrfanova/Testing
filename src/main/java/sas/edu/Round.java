package sas.edu;
/*
 * @author Alona Sviridova
 * @version Ver_1.1
 * 08.08.2020
 * Testing
 */

public class Round {

    private double radius;
    private double angle;

    /***********************************
     1. Constructor with 2 parameters
     ***********************************/

    public Round(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    /***********************************
     2.1 Getters for all class fields
     ***********************************/

    public double getRadius() {
        return radius;
    }

    public double getAngle() {
        return angle;
    }

    /************************************
     2.2 Setters for all class fields
     ************************************/

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**********************************************
     3.1 Method for getting perimeter of a round
     **********************************************/

    public double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    /*****************************************
     3.2 Method for getting area of a round
     *****************************************/

    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    /************************************************
     3.3 Method for getting sector area of a round
     ************************************************/

    public double getSectorArea() {
        return (this.getAngle() * Math.pow(this.getRadius(), 2)) / 2;
    }

    /**************************************************
     3.4 Method for getting segment area of a round
     **************************************************/

    public double getSegmentArea() {
        return ((this.getAngle() - Math.sin(this.getAngle()))
                * Math.pow(this.getRadius(), 2)) / 2;
    }

    /*******************************************************
     3.5 Method for getting sector arc length of a round
     *******************************************************/

    public double getArcLength() {
        return this.getAngle() * this.getRadius();
    }
}