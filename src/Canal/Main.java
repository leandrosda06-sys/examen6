public class PruebaCanalTelemetria {

    public static void main(String[] args) {

        CanalTelemetria canal = new CanalTelemetria(1, "Temperatura");

        System.out.println(canal.obtenerEstadoMedicion());

        System.out.println(canal.registrarMedicion(45.0));

        System.out.println(canal.obtenerEstadoMedicion());

        System.out.println(canal.registrarMedicion(120.0));

        System.out.println(canal.obtenerEstadoMedicion());

        System.out.println(canal.registrarMedicion(0.0));
        