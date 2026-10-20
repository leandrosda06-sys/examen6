public class CanalTelemetria {

    // Constante
    private static final double SIN_MEDICION = -1.0;

    // Atributos de instancia
    private final int identificador;
    private String nombre;
    private double ultimoValor;

    // Atributo de clase
    private static int canalesCreados = 0;

    // Constructor
    public CanalTelemetria(int identificador, String nombre) {

        if (identificador > 0 && nombre != null && !nombre.isEmpty()) {

            this.identificador = identificador;
            this.nombre = nombre;
            this.ultimoValor = SIN_MEDICION;

            canalesCreados++;

        } else {

            this.identificador = 1;
            this.nombre = "Canal";
            this.ultimoValor = SIN_MEDICION;
        }
    }

    // Getters
    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    // Método utilitario
    public boolean registrarMedicion(double valor) {

        if (Double.isFinite(valor) && valor >= 0 && valor <= 100) {
            ultimoValor = valor;
            return true;
        }

        return false;
    }

    // Método utilitario
    public String obtenerEstadoMedicion() {

        if (ultimoValor == SIN_MEDICION) {
            return "Sin mediciones";
        }

        return "Última medición: " + ultimoValor;
    }

    // Método de clase
    public static int getCanalesCreados() {
        return canalesCreados;
    }
}