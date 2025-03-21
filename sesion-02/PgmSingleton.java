package co.edu.ucc.harold.singleton;

public class Banco {
    private static Banco instance;
    private String nombreBanco;

    private Banco() {
        nombreBanco = "Banco Central";
    }

    public static Banco getInstance() {
        if (instance == null) {
            instance = new Banco();
        }
        return instance;
    }

    public void mostrarNombre() {
        System.out.println("Bienvenido al " + nombreBanco);
    }
}

// Uso
public class Main {
    private String getIdentidad() {
        return "Harold Adrian Bolaños Rodriguez";
    }
    public static void main(String[] args) {
        Banco banco = Banco.getInstance();
        banco.mostrarNombre();
    }
}
