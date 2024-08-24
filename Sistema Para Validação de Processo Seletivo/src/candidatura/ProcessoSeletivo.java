package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        // Seleção de Candidatos
        List<String> candidatosSelecionados = selecaoDeCandidatos();

        // Impressão dos Candidatos Selecionados
        imprimirSelecionados(candidatosSelecionados);

        // Tentativa de Contato com os Candidatos Selecionados
        for (String candidato : candidatosSelecionados) {
            entrarEmContato(candidato);
        }

    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(List<String> selecionados) {
        System.out.println("\n=== CANDIDATOS SELECIONADOS ===");
        for (int i = 0; i < selecionados.size(); i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é " + selecionados.get(i));
        }
    }

    static List<String> selecaoDeCandidatos() {
        System.out.println("=== INICIANDO PROCESSO DE SELEÇÃO ===");
        String[] candidatos = { "FELIPE", "JULIA", "PAULO", "MONICA", "MIRELA", "DANIELA", "AUGUSTO" };
        List<String> nomeCandidatosSelecionados = new ArrayList<>();

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato: " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                nomeCandidatosSelecionados.add(candidato);
                candidatosSelecionados++;
                analisarCandidato(salarioPretendido);
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
                analisarCandidato(salarioPretendido);
            }
            
            candidatoAtual++;
        }
        
        return nomeCandidatosSelecionados;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
