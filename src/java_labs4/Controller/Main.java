package java_labs4.Controller;

import java_labs4.View.CarView;

public class Main {
    public static void main(String[] args) {
        CarView view = new CarView();
        CarController cc = new CarController(view);
        cc.handleRequest();
    }
}
