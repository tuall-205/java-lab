package java_labs4.Controller;

import java_labs4.Model.Constants.*;
import java_labs4.Model.ExceptionCar;
import java_labs4.View.CarView;

import java.util.List;

public class CarController {

    private final CarView view;

    public CarController(CarView view) {
        this.view = view;
    }

    public void handleRequest() {
        String carName = view.getString("Enter car's name: ");
        Car car = Car.getCar(carName);

        String colorInput = view.getString("Enter car's color: ");
        Color color = Color.getColor(colorInput);

        String dayInput = view.getString("Enter car's day: ");
        Day day = Day.getDay(dayInput);

         int price = view.getValueInt("Enter car's price: ");

         try{
             validDateCar(car,color,day,price);
             view.displayMess("The car " + car + " matches the customer's needs.");
         }catch (ExceptionCar e) {
             view.displayMess("Error: " + e.getMessage());
         }
    }

    public void validDateCar(Car car, Color color, Day day, int price) throws ExceptionCar {
        if (car == null) {
            throw new ExceptionCar("invalid car");
        }
        List<Color> colors = car.getColor();
        List<Day> days = car.getDaySell();
        List<Integer> prices = car.getCarPrice();

        if (!colors.contains(color) && !colors.equals("NO_COLOR")) {
            throw new ExceptionCar("Invalid color for selected");
        }
        if (day == null && !days.contains(day.name())) {
            throw new ExceptionCar("Invalid day");
        }
        if (!prices.contains(price)) {
            throw new ExceptionCar("Invalid price");
        }
    }
}
