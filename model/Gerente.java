package model;

import interfaces.ICamareira;
import interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Sei atender o telefone");        
        System.out.println();
    }

    @Override
    public void falarIngles() {
        System.out.println("Sei falar ingles"); 
        System.out.println();       
    }
    
    @Override
    public void arrumarACama() {
        System.out.println("Sei arrumar a cama");
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei limpar o quarto");
    }
}
