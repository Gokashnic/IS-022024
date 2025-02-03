public class CMAdapter implements Connectable{
    public static CoffeMaker coffemaker;
    CMAdapter(CoffeMaker cm){
     coffemaker = cm;
    }
    @Override
    public void  turnOn(){
         coffemaker.on();
    }
    @Override
    public void turnOff(){
        coffemaker.off();
    }
    @Override
    public boolean isOn(){
        return !coffemaker.isOff();
    }

}
