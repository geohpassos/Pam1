      
package projetobanco;

public class Conta {
    String nome;
    double saldo;
    
    public void depositar(double valor){
        saldo += valor;
        System.out.println(" Operação de deposito no valor de R$ " + valor);
    }
    
    public void exibirSaldo(){
        System.out.println(nome + " Seu saldo é R$: " + saldo);
    }
    
    public void sacar(double valor){
        if(saldo>valor){
            saldo -= valor;
            System.out.println(" Operação de Saque no valor de R$ " + valor);
        }
        else{
            System.out.println("Operação não realizada, saldo insuficiente!");
            System.out.println("Seu saldo é R$ "+saldo);
        }
        
    }
   
    
    
}
