abstract class krish {
    String color;
    abstract int area();
    abstract int perimeter();
    public abstract String toString();
    public krish(String color){
        System.out.println("krish constructor called");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
//Concreate methods
class square extends krish{
    int side;
    public square(String color, int side){
        super(color);
        System.out.println("concreate constructor called");
        this.side = side;
    }

    @Override
    int area() {
        return side * side;
    }

    @Override
    int perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square color is "+ super.getColor()+" and area of the square is: "+area() +"\nThe perimeter of the square is: "+perimeter();
    }
}