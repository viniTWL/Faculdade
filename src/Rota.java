import javax.swing.*;

public class Rota {
    public void planejarDia() {
        try {
            int rotasQtt = Integer.parseInt(JOptionPane.showInputDialog("Quantas rotas serão feitas hoje?"));
            double demanda = 0;
            for (int i = 0; i < rotasQtt; i++){
                int rota = i + 1;
                double km = Double.parseDouble(JOptionPane.showInputDialog("Quantos KM percorrerá a rota " + rota + "?"));
                demanda = demanda + km;
            }

            double litros = demanda / 2.5;
            double valorOleo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do litro do óleo diesel?"));
            double valorTotal = litros * valorOleo;

            JOptionPane.showMessageDialog(null,"As rotas percorrerão um total de " + demanda + "" +
                    " km, gastando assim um total de " + litros + "litros de combustível, com isso será necessário desembolsar R$" + valorTotal + " para a demanda.");
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digito inválido para esse campo!");
        }

    }
}
