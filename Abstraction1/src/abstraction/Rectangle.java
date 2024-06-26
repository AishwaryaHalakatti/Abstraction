
package abstraction;

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method for calculating area
  
    public double calculateArea() {
        return length * width;
    }
}