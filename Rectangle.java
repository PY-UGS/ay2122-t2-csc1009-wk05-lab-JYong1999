public class Rectangle extends Shape{

    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.print("Inside Area for Rectangle.\n");
        return this.dim1 * this.dim2;
    }
}
