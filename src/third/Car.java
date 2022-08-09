package third;

public class Car {
    public void start(){
     startElectricity();
     startCommand();
     startFuelSystem();
    }

    private void startElectricity() {
    String electricity = "Electricity is working";
    System.out.println(electricity);
    }

    private void startCommand(){
       String command = "Command is started";
        System.out.println(command);
    }

    private void startFuelSystem(){
        String fuel = "Fuel system is started";
        System.out.println(fuel);
    }
}