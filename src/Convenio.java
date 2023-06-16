import java.util.Objects;
public class Convenio implements Observer {

    private String convenio;

    public Convenio(String convenio) {
        this.convenio = convenio;
    }

    public String getConvenio() {
        return convenio;
    }

    @Override
    public void update(String param) {
        System.out.println(convenio + ": la nueva factura ha sido publicada: " + param);
    }
}
