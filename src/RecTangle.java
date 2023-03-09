
public class RecTangle {
    double width, height;

    public RecTangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;

    }
    public double getPerimeter(){
        return  (this.height+this.width)*2;

    }
    public String display(){
        return "Rectangle {"+"width="+ width +", height = "+ height+ "}";
    }
}
