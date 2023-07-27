import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String idadeString = JOptionPane.showInputDialog("Digite sua idade:");
        int inteiroIdade = Integer.parseInt(idadeString);

        if (inteiroIdade >= 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
}