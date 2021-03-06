package ObserverPatternCustom;

public class ConcreteObserver1 implements Observer {       // Observer class (i.e. recipient of observation data), it shall implement to Observer interface
    private Subject fanSensor;
    public ConcreteObserver1(Subject fanSensor) {
        this.fanSensor = fanSensor;
        fanSensor.registerFanObserver(this);
    }

    @Override
    public void updateFanStaticsApp(int fanSpeed) {
        System.out.printf("Statistics App No. 1 reports: current fan speed is %s rpm.%n", fanSpeed);
    }
}
