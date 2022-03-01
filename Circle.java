public class Circle extends Shape{
    public Circle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.print("Inside Area for Circle.\n");
        return Math.PI * this.dim1 * this.dim2;
    }
}
