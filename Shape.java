public class Shape {
    private String color="green";
    private boolean filled= true;

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public Shape() {
    }


    public Shape(String color ,boolean filled) {
        this.filled = filled;
        this.color = color;
    }
 public String getColor(){
        return color;
 }
 public void setColor(String color){
        this.color = color;
 }
 public boolean getfilled(){
        return filled;
 }
 public void setFilled(boolean filled){
        this.filled = filled;
 }
}
