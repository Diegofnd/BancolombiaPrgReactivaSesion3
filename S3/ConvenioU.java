public class ConvenioU extends Subject {

    private String factura;

    public void addFactura(String link){

        this.factura = link;

        System.out.println("New convenio added");

        this.notifiy();
    }

    public String getFactura() {
        return factura;
    }

    @Override
    public void notifiy() {
        observers.forEach(observer -> observer.update(this.factura));
    }

    public void removeByName(String name){
        this.removeObserver(observers.stream()
                .filter(observer -> observer instanceof  Convenio && ((Convenio) observer).getConvenio().equals(name))
                .findFirst()
                .get());
    }
}
