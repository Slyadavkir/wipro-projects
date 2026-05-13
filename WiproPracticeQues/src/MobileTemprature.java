public class MobileTemprature {

    public static void main(String[] args) {

        Observer mobile = new MobileApp("Mobile App");
        Observer web = new Website("Website");
        Observer led = new LEDDisplay("LED Display");

        Observer observers[] = { mobile, web, led };

        TemperatureStation station = new TemperatureStation(observers);

        station.setTemperature("Temperature: 40°C");
        station.setTemperature("Temperature: 35°C");
    }
}

// Observer Interface
interface Observer {
    void update(String temperature);
}


class MobileApp implements Observer {
    String name;

    MobileApp(String name) {
        this.name = name;
    }

    public void update(String temperature) {
        System.out.println(name + " updated: " + temperature);
    }
}

class Website implements Observer {
    String name;

    Website(String name) {
        this.name = name;
    }

    public void update(String temperature) {
        System.out.println(name + " updated: " + temperature);
    }
}


class LEDDisplay implements Observer {
    String name;

    LEDDisplay(String name) {
        this.name = name;
    }

    public void update(String temperature) {
        System.out.println(name + " updated: " + temperature);
    }
}

class TemperatureStation {

    Observer observers[];

    TemperatureStation(Observer observers[]) {
        this.observers = observers;
    }

    public void setTemperature(String temperature) {
        notifyObservers(temperature);
    }

    public void notifyObservers(String temperature) {
        for (Observer obs : observers) {
            obs.update(temperature);
        }
    }
}
