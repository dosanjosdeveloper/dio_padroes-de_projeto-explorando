package br.com.dosanjosdeveloper.ppj.strategy;

public class ComportamentoDefensivamente implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Andando Defensivamente...");
    }
}
