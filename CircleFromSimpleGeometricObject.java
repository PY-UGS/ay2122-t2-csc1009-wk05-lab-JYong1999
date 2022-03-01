public class CircleFromSimpleGeometricObject extends GeometricObject{
    private double radius;

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    public double getPerimeter(){
        double peri = 2 * Math.PI * this.radius;
        return peri;
    }

    public double getDiameter(){
        double dia = 2 * this.radius;
        return dia;
    }

}
