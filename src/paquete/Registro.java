import java.io.File;
import java.util.*;
import java.io.*;

public class Registro {
private  String desc;
private int ct;
private float mu;
private int dd;
private int mm;
private int aaaa;
private String factura;
private String cedula;
public void setDesc(String _desc){
    desc = _desc;
}
public void setCT(int _ct){
    ct = _ct;
}
public void setMU(float _mu){
    mu = _mu;
}
public void setDay(int day){
    dd = day;
}public void setMonth(int month){
    mm = month;
}public void setYear(int year){
    aaaa = year;
}public void setBill(String bill){
    factura = bill;
}
public void setCI(String ci){
    cedula = ci;
}
public String getDesc(){
    return desc;
}

public String getCI(){
    return cedula;
}
public String getBill(){
    return factura;
}
public int getCT(){
    return ct;
}public float getMu(){
    return mu;
}
public int getDay(){
    return dd;
}
public int getMonth(){
    return mm;
}
public int getYear(){
    return aaaa;
}

public static void Inventario(){
    String name = "inventario.txt";
    
    File inventario = new File(name);
    try {
        PrintWriter salida = new PrintWriter(inventario);
        salida.close();
        System.err.println("Se creó el archivo");
    } catch (FileNotFoundException ex) {
        ex.printStackTrace(System.out);
    }
   
    
    
}
}

