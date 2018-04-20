import task1.Calculator;
import task2.Graph;
import task3.Atmosphere;
import task3.Person;
import task3.Rocket;
import task3.Screen;
import task4.calculator.Function;
import task4.calculator.Logging;
import task4.calculator.logarithmic.FunLog;
import task4.calculator.logarithmic.Log;
import task4.calculator.logarithmic.Log2;
import task4.calculator.trigonometric.*;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        /*
        Atmosphere atm = new Atmosphere();
        atm.addItem(new Rocket());
        atm.addItem(new Rocket());

        HashMap<String, Screen> screens = new HashMap<>();
        screens.put("front", new Screen());
        screens.put("back", new Screen(atm));
        screens.put("upper", new Screen());
        screens.put("left", new Screen());

        Person ford = new Person();
        Person zaford = new Person();

        ford.setName("Ford");
        zaford.setName("Zaford");

        //ford.setFocus(screens.get("back"));
        //zaford.setFocus(null);

        // start:
        while (!ford.tryShow(screens.get("back"))) {
            ford.getShoulder().put();
        }
        */

        FunTrg funTrg = new FunTrg(new Tan(new Sin(), new Cos(new Sin())), new Sec(new Cos(new Sin())), new Csc(new Sin()));
        FunLog funLog = new FunLog(new Log(), new Log2(new Log()));

        Function fun = new Function(funLog, funTrg);


        Logging.writeLogFile(fun, -10, 10, 0.1, 1);







    }
}
