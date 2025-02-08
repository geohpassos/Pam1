
package projetobanco;

import javax.swing.JOptionPane;

public class ProjetoBanco {
 
    public static void main(String[] args) {
        Conta conta = new Conta();
        
        conta.nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        conta.saldo = Double.parseDouble( JOptionPane.showInputDialog("Digite seu Saldo R$: "));
        
        
        conta.exibirSaldo();
        
        conta.depositar(50);
        
        conta.sacar(200);
        
        conta.exibirSaldo();
    }
    
}
