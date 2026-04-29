import java.util.Scanner;

public class MonitoramentoLaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cargaProjeto = 15.0;
        double LimiteSeguranca = cargaProjeto * 0.8;

        System.out.println("--- Sistema SafeBuild: Monitoramento de Carga ----");
        System.out.println("Digite a leitura atual do sensor (kN/m)");
        double cargaAtual = sc.nextDouble();

        if (cargaAtual < LimiteSeguranca){
            System.out.println("Status: Sinal verde");
            System.out.println("Decisão: Operação normal. Carga dentro dos paramentros de segurança.");

        }else if (cargaAtual >= LimiteSeguranca && cargaAtual <= cargaProjeto){
            System.out.println("Status: Sinal Amarelo");
            System.out.println("Decisão: Reduzir a velocidade de concretagem e evacuar o pessoal nao essencial.");

        }  else {
            System.out.println("Status: Vermelho (critico)");
            System.out.println("Decisão: INTERROMPER IMEDIATAMENTE! Risco de colapso das escorias.");
            
        }

        if ( cargaAtual > (cargaProjeto * 1.2)){
            System.out.println("ALERTA ADCIONAL: Possivel falha catastrofica iminente. Evacuar area total.");

        }
        sc.close();
    
    }
}
