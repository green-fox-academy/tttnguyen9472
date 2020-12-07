public class Station {
    int gasAmount = 1000;

    //refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount

    public void refill(Car car){
        this.gasAmount = gasAmount - car.capacity;
        car.gasAmount = car.gasAmount + car.capacity;
    }
}
