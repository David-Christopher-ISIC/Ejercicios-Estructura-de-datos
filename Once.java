import javax.swing.JOptionPane;

public class Once {
    public static void main(String []david){
        double c1,c2,c3,suma,p;
        c1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación 1:"));
        c2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación 2:"));
        c3=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación 3:"));
        suma=(double)(c1+c2+c3);
        p=(double)(suma/3);
        if(p>=7){
            JOptionPane.showMessageDialog(null,"El promedio es: "+p+"\nAprobado");
        }else{
            JOptionPane.showMessageDialog(null,"El promedio es: "+p+"\nReprobado");
        }
    }
}
