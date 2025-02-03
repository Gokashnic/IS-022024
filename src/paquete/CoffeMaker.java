public class CoffeMaker {
private boolean estado;
    public void on(){
    this.estado = true;
}
public void off(){
    this.estado = false;
}
public boolean isOff(){
    return !this.estado;
}
}
