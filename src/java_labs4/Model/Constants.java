package java_labs4.Model;

import java.util.Arrays;
import java.util.List;

public class Constants {

    public enum Car {
        AUDI, MERCEDES, BMW;

        public static Car getCar(String carName) {
            try {
                return Car.valueOf(carName.toUpperCase());
            }catch (IllegalArgumentException e) {
                return null;
            }
        }

        public List<Color> getColor() {
            return switch (this) {
                case AUDI -> Arrays.asList(Color.WHITE, Color.YELLOW, Color.ORANGE);
                case MERCEDES -> Arrays.asList(Color.GREEN, Color.BLUE, Color.PURPLE);
                case BMW -> Arrays.asList(Color.PINK, Color.RED, Color.BROWN);
            };
        }

        public List<Day> getDaySell() {
            return switch (this) {
                case AUDI -> Arrays.asList(Day.FRIDAY, Day.SUNDAY, Day.MONDAY);
                case MERCEDES -> Arrays.asList(Day.TUESDAY, Day.SATURDAY, Day.WEDNESDAY);
                case BMW -> Arrays.asList(Day.MONDAY, Day.SUNDAY, Day.THURSDAY);
            };
        }

        public List<Integer> getCarPrice() {
            return switch (this) {
                case AUDI -> Arrays.asList(5500, 3000, 4500);
                case MERCEDES -> Arrays.asList(5000, 6000, 8500);
                case BMW -> Arrays.asList(2500, 3000, 3500);
            };
        }
    }

    public enum Day {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

        public static Day getDay(String day) {
            try{
                return Day.valueOf(day.toUpperCase());
            }catch (IllegalArgumentException e) {
                return null;
            }
        }
    }

    public enum Color {
        WHITE, YELLOW, ORANGE, GREEN, BLUE, PURPLE, PINK, RED, BROWN, NO_COLOR;

        public static Color getColor (String colorName) {
            try {
                return Color.valueOf(colorName.toUpperCase());
            }catch (IllegalArgumentException e) {
                return null;
            }
        }
    }

}
