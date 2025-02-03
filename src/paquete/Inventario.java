import javax.swing.*; 
import java.awt.Dimension;
import java.awt.Color;
public class Inventario extends JFrame {
    private JPanel Panel;
    private JTextField cajaTexto;
    private JButton boton;
    private JLabel label;

 String cedula[] = new String[100];
 int[] cantidad = new int[100];
 float[] Cunitario = new float[100];

 public Inventario(){
   // Ventana
   setSize(500,500); // (ancho, largo)
   setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cierre la ventana el programa finalizara
   setTitle("Registro y Control de Equipos en Centros de Investigación"); // titulo de la ventana
   setLocation(100,200); // localizacion de la ventana
   
   setLocationRelativeTo(null); // centra la localizacion de la pantalla 
   ShowRegister();
 }

 private void ShowRegister(){
    
    JPanel NewPanel = new JPanel();
    NewPanel.setLayout(null);
    this.getContentPane().add(NewPanel);
    JLabel etiqueta = new JLabel("Soy Bella en la ventana");
    etiqueta.setBounds(20, 33, 200, 100);
    etiqueta.setForeground(Color.MAGENTA);
    etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta.setOpaque(true);
    etiqueta.setBackground(Color.CYAN);
    NewPanel.add(etiqueta);
    


 }


 
 public static void main(String[] args) {
    Inventario v1 = new Inventario();
    v1.setVisible(true);
}
  }