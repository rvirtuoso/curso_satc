/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testegit;

public class TesteGit {


    public static void main(String[] args) {
        Integer media;
        Integer nota1;
        Integer nota2;
        Integer nota3;
        
        nota1 = 10;
        nota2 = 8;
        nota3 = 7;
        
        media = (nota1 + nota2 + nota3) /3;
        if( media >= 7){
            System.out.print("O aluno foi aprovado com média: ");
            System.out.print(media);
            System.out.print(" :-)");
        }
        else System.out.print(" O aluno foi reprovado :-( ");
            
        
            
        }
            
        
        
    }

