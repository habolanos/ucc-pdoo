package co.edu.ucc.haroldadrian.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Inicio de sesión");
        Logger logger2 = Logger.getInstance();
        logger2.log("Transacción realizada");
    }
}