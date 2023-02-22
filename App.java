import model.EnumTipo;
import model.Gerente;
import model.Quarto;
import model.Recepcionista;

public class App{
    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();


        Recepcionista recepcionista1 = new Recepcionista("Valéria Nunes", "910001001", "22345678902");

        recepcionista1.atenderTelefone();
        recepcionista1.falarIngles();

        Gerente gerente = new Gerente("Antônio", "913910000", "12345678903");
        gerente.falarIngles();
        gerente.atenderTelefone();
        gerente.arrumarACama();
        gerente.limparQuarto();


        Quarto quarto1 = new Quarto();
        quarto1.setNumero("206A");
        quarto1.setValor(100.0);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("306A");
        quarto2.setValor(200.0);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);



    }
}