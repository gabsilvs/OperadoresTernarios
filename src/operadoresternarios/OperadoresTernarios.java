/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresternarios;

/**
 *
 * @author rodri
 */
public class OperadoresTernarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r, n;
        n1=4;
        n2=8;
        r = (n1>n2)?0:1;  // Tambem aceita formulas dentro
        System.out.println(r);
        
        n = (n1>n2)?n1+n2:n1-n2;// Exemplo de formulas dentro
        System.out.println(n);
        
    }
    
}
