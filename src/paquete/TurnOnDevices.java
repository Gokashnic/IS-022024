public class TurnOnDevices {

    public static void main(String[] args) {
   
    turnOnDevice(new Lamp());
    turnOnDevice(new Computer());
    
    CMAdapter adapter = new CMAdapter(new CoffeMaker());
    turnOnDevice(adapter);
    }
   
    private static void turnOnDevice(Connectable device) {
    device.turnOn();
    System.out.println(device.isOn());
    }
   }