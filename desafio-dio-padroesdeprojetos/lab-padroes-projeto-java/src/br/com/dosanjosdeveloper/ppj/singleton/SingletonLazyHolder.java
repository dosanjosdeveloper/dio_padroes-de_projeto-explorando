package br.com.dosanjosdeveloper.ppj.singleton;

/**
 * SingletonLazy "LazyHolder".
 * @author Rafael dos Anjos (dosanjosdeveloper)
 * @see <a href="https://stackoverflow.com/a/24018148" Referência
 */

public class SingletonLazyHolder {
    private static SingletonLazyHolder instancia;

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia() {

        return instancia;
    }
}
