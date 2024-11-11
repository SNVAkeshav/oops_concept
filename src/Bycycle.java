public class Bycycle {
    public int gear;
    public int speed;

    public Bycycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBreaks(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    public String toString(){
        return ("No of gears are "+ gear + "\n" +"Speed of the bicycle is: "+ speed);
    }
}
class mountainBike extends Bycycle{
    public int seatHeight;
    public mountainBike(int gear, int speed, int startHeight){
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nseat height is: "+ seatHeight);
    }
}
