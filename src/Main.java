public class Main {
    public static void main(String[] args) {
            Procesador procesador = new Procesador();
            procesador.marca = "AMD";
            procesador.modelo = "AM456";
            procesador.precio = 3.4;

            System.out.println("Procesador: " + procesador.getFullName());

            PlacaBase placaBase = new PlacaBase();
            placaBase.marca = "Asrock";
            placaBase.modelo = "A520M-HDV";
            placaBase.precio = 61.99;
            placaBase.conexiones = "RJ-45";
            placaBase.conectividad = "wifi";
            placaBase.chipset = "AMD B550";
            placaBase.tipoSocket ="Socket AM4";

            System.out.println("PlacaBase: " + placaBase.getFullName());

            MemoriaRAM memoriaRAM = new MemoriaRAM();
            memoriaRAM.marca = "Acer";
            memoriaRAM.familias = "portatiles";
            memoriaRAM.precio = 371.8;

            System.out.println("Memoria RAM: " + memoriaRAM.getFullName());

            Torre torre = new Torre();
            torre.almacenamiento = "4 TB";
            torre.almacenamientoSSD = "";
            torre.conectividad = "";
            torre.conexiones = "";
            torre.color = "";
            torre.claseEficienciaEnergetica = "";
            torre.procesador = "";
            torre.numeroProcesador = "";
            torre. = "";
            torre. = "";
            torre. = "";
            torre. = "";
            torre. = "";
            torre.precio = 928.78;
            System.out.println("Torre: " + torre.getFullName());
    }

}