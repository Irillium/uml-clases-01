public class MemoriaRAM {
    public Double precio;
    public String familias, marca;
    public String getFullName() {
        return familias + " " + marca + " " + precio;
    }
    public String getFamilias() {
        return familias;
    }
    public String getMarca() {
        return marca;
    }
    public Double getPrecio() {
        return precio;
    }
}
