abstract class Shepa {
    String color;

    abstract double area();

    public abstract String toString();

    public Shepa(String color) {
        System.out.println("Shape construtor called");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
    //Concreate method
    class circlee extends Shepa{
        double radius;
        public circlee(String color, double radius){
            //calling shape constructor
            super(color);
            System.out.println("circle constructor call");
            this.radius = radius;
        }
        @Override
        double area(){
            return Math.PI * Math.pow(radius,2);
        }

        @Override
        public String toString() {
            return "Circle color is " + super.getColor() + " and area is: "+area();
        }
    }
    class rectangle extends Shepa{
    double length;
    double width;
    public rectangle(String color, double length, double width){
        super(color);
        System.out.println("rectangle constructor called");
        this.length = length;
        this.width = width;
    }

        @Override
        double area() {
            return length * width;
        }

        @Override
        public String toString() {
            return "rectangle color is "+super.getColor()+" and area is "+ area();
        }
    }
