package model;

import interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
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
