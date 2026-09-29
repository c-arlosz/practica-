class CuentaBancaria {
    String titular;
    double saldo;

    CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class TrazadoMemoria {
    public static void main(String[] args) {
        // --- Parte A: Primitivos ---
        int saldoPrimitivoA = 1000;
        int saldoPrimitivoB = saldoPrimitivoA;
        saldoPrimitivoB = 2500;

        System.out.println("--- Primitivos ---");
        System.out.println("Saldo A: " + saldoPrimitivoA); // ¿Cuánto vale A?
        System.out.println("Saldo B: " + saldoPrimitivoB);

        // --- Parte B: Referencias (Aliasing) ---
        CuentaBancaria cuenta1 = new CuentaBancaria("Ana", 5000.0);
        CuentaBancaria cuenta2 = cuenta1;
        cuenta2.saldo = 9999.0;

        System.out.println("\n--- Referencias (Aliasing) ---");
        System.out.println("Saldo Cuenta 1: " + cuenta1.saldo); // ¿Cuánto vale cuenta1?
        System.out.println("Saldo Cuenta 2: " + cuenta2.saldo);
    }
}
