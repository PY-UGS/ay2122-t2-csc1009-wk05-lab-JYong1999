import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){ return color; }
    public void setColor(String color){ this.color = color; }

    public boolean isFilled(){ return filled; }
    public void setFilled(boolean filled){ this.color = color; }

    public Date getDateCreated(){ return dateCreated; }

    public String toString(){ return "created on " + dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled; }
}
