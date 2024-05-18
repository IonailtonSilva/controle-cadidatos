package candidatura;

import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {

    public static void main(String[] args){

        System.out.println("Processo Seletivo");
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){

            System.out.println("Digite a proposta Candidato: ");
            analisarCandidato(scanner.nextDouble());
        }
    }
    static void analisarCandidato(double salarioPretendido){

        double salarioBase = 2000.0; 
        
        if (salarioBase > salarioPretendido){
        System.out.println("ligar Para candidato!"); 
        }
        else if(salarioBase != salarioPretendido){
            System.out.println("Aguardar Demais Candidatos");
        }
        else {
            System.out.println("Fazer Contra Proposta");
        }


    }
}
