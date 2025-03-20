import javax.swing.JOptionPane;

public class Trece {
    public static void main(String []david){
        String x;
        x=JOptionPane.showInputDialog("Ingresa la contraseña:");
        if(x.equals("tesji123")){
            JOptionPane.showMessageDialog(null,"CONTRASEÑA CORRECTA");
        }else{
            JOptionPane.showMessageDialog(null,"CONTRASEÑA INCORRECTA");
        }
    }
}
