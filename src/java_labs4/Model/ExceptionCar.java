package java_labs4.Model;



public class ExceptionCar extends Exception {

    public ExceptionCar(String mess) {
        super(mess);
    }

//    public enum Car {
//        AUDI, MERCEDES, BMW;
//
//        public static Car getCar(String carName) {
//            try {
//                return Car.valueOf(carName.toUpperCase());
//            }catch (IllegalArgumentException e) {
//                return null;
//            }
//        }
//
//        public List<String> getColor() {
//            switch (this) {
//                case AUDI -> {
//                    return Arrays.asList("WHITE", "YELLOW", "ORANGE");
//                }
//                case MERCEDES -> {
//                    return Arrays.asList("GREEN","BLUE","PURPLE");
//                }
//                case BMW -> {
//                    return Arrays.asList("PINK","RED","BROWN");
//                }
//                default -> {
//                    return Collections.emptyList();
//                }
//            }
//        }
//
//        public List<String> getDaySell () {
//            switch (this)  {
//                case AUDI -> {
//                    return Arrays.asList("FRIDAY","SUNDAY","MONDAY");
//                }
//                case MERCEDES -> {
//                    return Arrays.asList("TUESDAY","SATURDAY","WEDNESDAY");
//                }
//                case BMW -> {
//                    return Arrays.asList("MONDAY","SUNDAY","THURSDAY");
//                }
//                default -> {
//                    return Collections.emptyList();
//                }
//            }
//        }
//
//        public List<Integer> getCarPrice () {
//            switch (this) {
//                case AUDI -> {
//                    return Arrays.asList(5500,3000,4500);
//                }
//                case MERCEDES -> {
//                    return Arrays.asList(5000,6000,8500);
//                }
//                case BMW -> {
//                    return Arrays.asList(2500,3000,3500);
//                }
//                default -> {
//                    return Collections.emptyList();
//                }
//            }
//        }
//    }
//
//    public enum Day {
//        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
//
//        public static Day getDay(String day) {
//            try{
//                return Day.valueOf(day.toUpperCase());
//            }catch (IllegalArgumentException e) {
//                return null;
//            }
//        }
//    }
//
//    public enum Color {
//        WHITE, YELLOW, ORANGE, GREEN, BLUE, PURPLE, PINK, RED, BROWN, NO_COLOR;
//
//        public static Color getColor (String colorName) {
//            try {
//                return Color.valueOf(colorName.toUpperCase());
//            }catch (IllegalArgumentException e) {
//                return null;
//            }
//        }
//    }

}
