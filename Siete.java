import javax.swing.JOptionPane;

public class Siete {
    public static void main(String []david){
        double peso,alto,estatura,imc;
        peso=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso (kg):"));
        alto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su estatura(m):"));
        estatura=(double)(alto*alto);
        imc=(double)(peso/estatura);
        JOptionPane.showMessageDialog(null,"Su índice de masa corporal (IMC) es: "+imc);
    }
}
