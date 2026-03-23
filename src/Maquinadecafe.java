public class Maquinadecafe {

    private Cafetera cafetera;
    public Vaso vasosPequeno;
    public Vaso vasosMediano;
    public Vaso vasosGrande;
    private Azucarero azucarero;

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public Vaso getTipoDeVaso(String tipo) {
        if (tipo.equalsIgnoreCase("pequeno")) {
            return vasosPequeno;
        }

        if (tipo.equalsIgnoreCase("mediano")) {
            return vasosMediano;
        }

        if (tipo.equalsIgnoreCase("grande")) {
            return vasosGrande;
        }

        return null;
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadVasos, int cantidadAzucar) {
        if (!vaso.hasVasos(cantidadVasos)) {
            return "No hay Vasos";
        }

        if (!cafetera.hasCafe(vaso.getContenido())) {
            return "No hay Cafe";
        }

        if (!azucarero.hasAzucar(cantidadAzucar)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadVasos);
        cafetera.giveCafe(vaso.getContenido());
        azucarero.giveAzucar(cantidadAzucar);

        return "Felicitaciones";
    }
}