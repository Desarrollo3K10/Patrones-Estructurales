package Bridge;

public class Recordatorio extends Notificacion{

    public Recordatorio(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void enviar(String texto) {
        canalEnvio.Enviar("RECORDATORIO: " + texto);
    }
}
