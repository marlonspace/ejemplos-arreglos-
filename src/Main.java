import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String []marcas = {"toyota","mazda","ferrari","bugatti"};

        for (String i:marcas) {

            JOptionPane.showMessageDialog(null,"marcas: \n"+i  );
        }
    }

}