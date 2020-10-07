import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Data {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate olimpadas = LocalDate.of(2030, Month.JUNE, 5);
        int anos =  olimpadas.getYear() -  LocalDate.now().getDayOfYear();

        Period periodo = Period.between(hoje, olimpadas);
        System.out.println("Periodo de dias " +   periodo.getDays());

    }

}
