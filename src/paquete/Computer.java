public class Computer implements Connectable {
    boolean estado;
    @Override
    public void  turnOn(){
this.estado = true; 
    }
    @Override
    public void turnOff(){
        this.estado = false;
    }
    @Override
    public boolean isOn(){
        return this.estado;
    }
}
