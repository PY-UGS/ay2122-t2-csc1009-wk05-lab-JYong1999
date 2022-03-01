public class Triangle extends Shape{
    public Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }
    @Override
    double area() {
        System.out.print("Inside Area for Triangle.\n");
        return 0.5 * this.dim1 * this.dim2;
    }
}
