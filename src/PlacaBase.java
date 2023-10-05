public class PlacaBase {
    public String marca, modelo, conexiones, conectividad, chipset, tipoSocket;
    public Double precio;

    public String getFullName() {
        return marca + " " + modelo + " " + conexiones + " " + conectividad + " " + chipset + " " + tipoSocket + " " + precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getConexiones() {
        return conexiones;
    }

    public String getConectividad() {
        return conectividad;
    }
    public String getChipset() {

        return chipset;
    }
    public String getTipoSocket() {
        return tipoSocket;
    }
    public Double getPrecio(){
        return precio;
    }

}
