import jdk.nashorn.internal.codegen.types.Type;

/**
 * Created by Victor on 29/5/16.
 */

/*
    Clase factory ponemos a private el constructor para obligar a usar el método estático para la creación de las clases concretas.
    el método getComputer recibirá los parámetros con los que quiera que se realice el ordenador (ram y hdd) y además el tipo de ordenador que será.
    para ellos hemos creado un enum con los diferentes tipos posibles.
 */
public class Factory {
    public enum Type {
        PC, SERVER
    }

    private Factory() {

    }

    /*
        Comprobamos el tipo de ordenador que se quiere lo creamos y lo devolvemos. Hay que notar que se usa la interfaz para devolverlo
        aprovechándonos del polimorfismo.
     */
    public static Computer getComputer(Type type, String ram, String hdd) {
        if (Type.PC == type ) {
            return new PC(ram, hdd);
        }

        if (Type.SERVER == type) {
            return  new Server(ram, hdd);
        }

        return null;
    }
}
