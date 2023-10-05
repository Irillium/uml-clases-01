public class Procesador {
    // Estados, atributos, propiedades
    public String marca;
    public String modelo;
    public Double precio;

    // Comportamiento o método (funciones)
    // public (+) método accesible desde cualquier clase
    // String: tipo devuelto por el método
    public String getFullName(){
        //Concatenar cadenas con +
        //AMD 7600 3232.2
        return marca + " " + modelo + " " + precio;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Double getPrecio(){
        return precio;
    }
    public String getPrecioConSimbolo(){
        return precio + "$";
    }
}
