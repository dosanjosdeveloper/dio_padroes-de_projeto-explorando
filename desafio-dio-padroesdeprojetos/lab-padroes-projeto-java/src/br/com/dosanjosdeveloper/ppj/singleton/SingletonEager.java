package br.com.dosanjosdeveloper.ppj.singleton;

/**
 * Sngleton "apressado".
 *
 * @author Rafael dos Anjos (dosanjosdeveloper)
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
