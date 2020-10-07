import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

class ManipulaArquivo {

    InputStream file = new FileInputStream("teste.txt");

    ManipulaArquivo () throws FileNotFoundException {

    }

}



//Exception checked é a Exception
class CustomSaldoInsuficienteException extends Exception {

    CustomSaldoInsuficienteException(String msg) {
        super(msg);
    }


}

public class Conta {

    double saldo = 100;

    void saca(double quantidade) throws CustomSaldoInsuficienteException {
        if (this.saldo < quantidade) {
            throw new CustomSaldoInsuficienteException("Saldo é insuficiente");
        }
        saldo -= quantidade;
    }

    public Conta() {
    }
}

class TestaQuantidade {
    public static void metodo1() {
        try {
            new Conta().saca(500);

        } catch (CustomSaldoInsuficienteException ex) {
            System.out.println("tratei o erro de IO");
        }
    }

    public static void main(String[] args) {
        metodo1();
    }

}
