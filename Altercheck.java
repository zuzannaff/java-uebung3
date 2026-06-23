import javax.swing.JOptionPane;
 
public class AlterCheck {
    public static void main(String[] args) {
    

String eingabe = JOptionPane.showInputDialog("Wie alt bist du?");

int alter = Integer.parseInt(eingabe);


if (alter >= 18) {
    JOptionPane.showMessageDialog(null, "volljaehrig");
} else {
    JOptionPane.showMessageDialog(null, "minderjaehrig");
}

    }
}