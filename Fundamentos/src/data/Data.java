package data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;


public class Data {
    public static void main(String[] args) {
        String decoracao = "---------------------------------------";
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        System.out.println(decoracao);
        
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        
        System.out.println(decoracao);
        
        LocalDate diaNatalAnoAnterior = LocalDate.of(2022, 12, 25);
        System.out.println(diaNatalAnoAnterior);
        
        System.out.println(decoracao);
        
        LocalDateTime horarioCeiaNatalAnoAnterior = LocalDateTime.of(2022, 12, 25, 22, 30);
        System.out.println(horarioCeiaNatalAnoAnterior);
        
        System.out.println(decoracao);
        
        String hojeString = String.valueOf(hoje);
        String vetor[] = hojeString.split("-");
        
        String ano = vetor[0];
        String mes = vetor[1];
        String dia = vetor[2];
        
        String mensagem = String.format("Hoje e dia %s do mes %s do ano %S", dia, mes, ano);
        System.out.println(mensagem);
        
        System.out.println(decoracao);
        
        int ano1 = hoje.getYear();
        int mes1 = hoje.getMonthValue();
        int dia1 = hoje.getDayOfMonth();
        
        String mensagem1 = String.format("Hoje e dia %d do mes %d do ano %d", dia1, mes1, ano1);
        System.out.println(mensagem1);
        
        System.out.println(decoracao);
        
        LocalDate dataFutura = hoje.plusDays(10);
        LocalDate dataPassada = hoje.minusDays(50);
        
        int comparaDatas = hoje.compareTo(dataFutura);
        System.out.println(comparaDatas);
        
        System.out.println("Se o resultado de comparar datas for = -1, significa que a data comparada à hoje é maior, ou seja, uma data futura"
                + "\nSe o resultado de comparar datas for = 0, significa que a data comparada à hoje é igual, ou seja, presente"
                + "\nSe o resultado de comparar datas for = 1, significa que a data comparada à hoje é menor, ou seja, passado");
        
        System.out.println(decoracao);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatadaPadraoPtBr = hoje.format(formatter);
        
        System.out.println("Data Formatada: " + dataFormatadaPadraoPtBr);
        
        System.out.println(decoracao);
        
        String diaAnoNovo = "01/01/2024";
        LocalDate dataAltoNivel = LocalDate.parse(diaAnoNovo, formatter);
        System.out.println("Data alto nivel: " + dataAltoNivel);
        
        System.out.println(decoracao);
        
        int ano2 = hoje.getYear();
        int dia2 = hoje.getDayOfMonth();
        
        Locale localeBrasil = Locale.of("pt", "BR");
        
        String mesPorExtenso = hoje.getMonth().getDisplayName(TextStyle.FULL, localeBrasil);
        String dataPorExtenso = String.format("Hoje e dia %d do mes %s, ano %d", dia2, mesPorExtenso, ano2);
        System.out.println(dataPorExtenso);
        
    }
    
}
