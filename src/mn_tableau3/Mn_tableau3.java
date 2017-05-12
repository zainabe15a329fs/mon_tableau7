/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn_tableau3;
import java.util.Scanner;
/**
 *
 * @author MOUSTAPHA
 */
public class Mn_tableau3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int monTableau[]=new int[10];
        int[]tab={12,15,13,10,8,41,13,14};
        int n,indice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez_le_nombre_a_inserer:_");
        n=sc.nextInt();
        System.out.println("Entrez_l'indice:_");
        indice=sc.nextInt();
        if((indice>=0)&&(indice<tab.length)){
            System.out.println("tableau_avant_insertion_:_");
            for(int i=0;i<tab.length;i++){
                sc.nextInt(tab[i]);
              System.out.println("_ _");
            }
             sc.nextLine();
            tab[indice]=n;
            System.out.println("tableau_apres_insertion_:_");
            for(int i=0;i<tab.length;i++){
                sc.nextInt(tab[i]);
                System.out.println("_ _");
                sc.nextLine();
            }
            
            
        }else{
                   System.out.println("indice_non_valide");
        }
        
    }
    
}
