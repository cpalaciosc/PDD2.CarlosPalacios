package es.upm.miw.pd.singleton.logger;

public class Clase2 {
    private Logger logger;

    public Clase2() {
        this.logger = Logger.getLogger();
    }

    public void method1() {
        // ...
        this.logger.addLog("Clase2:method1");
    }

    public void method2() {
        // ...
        Clase3 c3 = new Clase3();
        c3.method1();
        this.logger.addLog("Clase2:method2");
    }

}
