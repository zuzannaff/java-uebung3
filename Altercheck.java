import javax.swing.JOptionPane;
 
public class AlterCheck {
    public static void main(String[] args) {
    

String eingabe = JOptionPane.showInputDialog("Wie alt bist du?");

int alter = Integer.parseInt(eingabe);


if (alter < 13) {
    JOptionPane.showMessageDialog(null, "Kind");

}
if (alter >= 13 && alter < 17) {
    JOptionPane.showMessageDialog(null, "Jugendlicher");
}
if (alter >= 18) {
    JOptionPane.showMessageDialog(null, "Erwachsener");
}
}

    }


