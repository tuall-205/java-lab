package java_labs4.Controller;

import java_labs4.Model.ExceptionCar;
import java_labs4.View.CarView;

import java.util.List;

public class CarController {

    public final CarView view = new CarView();

    public void handleRequest() {
        String carName = view.getValue("Enter car's name: ");
        ExceptionCar.Car car = ExceptionCar.Car.getCar(carName);

        String colorInput = view.getValue("Enter car's color: ");
        ExceptionCar.Color color = ExceptionCar.Color.getColor(colorInput);

        String dayInput = view.getValue("Enter car's day: ");
        ExceptionCar.Day day = ExceptionCar.Day.getDay(dayInput);

         int price = view.getValueInt("Enter car's price: ");

         try{
             validDateCar(car,color,day,price);
             view.displayMess("The car " + car + " matches the customer's needs.");
         }catch (ExceptionCar e) {
             view.displayMess("Error: " + e.getMessage());
         }

    }

    public void validDateCar(ExceptionCar.Car car, ExceptionCar.Color color, ExceptionCar.Day day, int price) throws ExceptionCar {
        if (car == null) {
            throw new ExceptionCar("invalid car");
        }
        List<String> colors = car.getColor();
        List<String> days = car.getDaySell();
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

    public static void main(String[] args) {
        CarController cc = new CarController();
        cc.handleRequest();
    }
}
