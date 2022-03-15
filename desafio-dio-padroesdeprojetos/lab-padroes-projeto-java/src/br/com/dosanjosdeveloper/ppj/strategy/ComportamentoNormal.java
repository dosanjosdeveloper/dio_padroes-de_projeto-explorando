package br.com.dosanjosdeveloper.ppj.strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Andando...");
    }
}
