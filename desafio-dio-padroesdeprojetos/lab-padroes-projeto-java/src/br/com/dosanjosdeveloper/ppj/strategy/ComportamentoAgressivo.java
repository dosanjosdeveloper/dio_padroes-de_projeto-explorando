package br.com.dosanjosdeveloper.ppj.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Andando Agressivamente...");
    }
}
