package Bridge;

public class Alerta extends Notificacion{

    public Alerta(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void enviar(String texto) {
        canalEnvio.Enviar("ALERTA: " + texto);
    }
}
