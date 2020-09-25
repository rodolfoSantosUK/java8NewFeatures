import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestantoLambda {


    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        palavras.add("alura online");
        palavras.add("editora casa do codigo ");
        palavras.add("caelumn");

        palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.forEach( s -> System.out.println(" Valor de s : " +  s));
    }

}
