package br.com.dosanjosdeveloper.ppj.singleton;

/**
 * SingletonLazy "preguiçoso".
 * @author Rafael dos Anjos (dosanjosdeveloper)
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
