package ejercicios;

public class TestGen {

    public static <T> boolean exist(T[] arreglo, T elemento) {
        for (T e : arreglo) {
            if (e.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public static <T> void mostrarBolsa(Bolsa<T> bolsa) {
        for (T elemento : bolsa) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {

        System.out.println("====== PRUEBA DEL MÉTODO exist() ======");
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(exist(v, "Sanchez")); // true
        System.out.println(exist(w, 34));        // true
        // System.out.println(exist(w, "Salas")); // Error intencional

        Golosina[] arregloGolosinas = {
            new Golosina("Caramelo", 0.5),
            new Golosina("Gomita", 0.2),
            new Golosina("Chupetin", 0.8)
        };

        Chocolatina[] arregloChocolatinas = {
            new Chocolatina("Milka"),
            new Chocolatina("Ferrero"),
            new Chocolatina("Sublime")
        };

        System.out.println(exist(arregloGolosinas, new Golosina("Gomita", 0.2))); // true
        System.out.println(exist(arregloChocolatinas, new Chocolatina("Ferrero"))); // true

        System.out.println("\n====== PRUEBA DEL MÉTODO mostrarBolsa() ======");
        Bolsa<Golosina> bolsaGol = new Bolsa<Golosina>(3);
        bolsaGol.add(new Golosina("Caramelo", 0.5));
        bolsaGol.add(new Golosina("Gomita", 0.2));
        bolsaGol.add(new Golosina("Chupetin", 0.8));

        mostrarBolsa(bolsaGol);

        System.out.println("\n====== CAJONERÍA DE GOLOSINAS ======");
        Cajoneria<Golosina> cajoneriaGol = new Cajoneria<Golosina>(10);

        cajoneriaGol.addCaja(new Caja<Golosina>("Rojo", new Golosina("Caramelo", 0.5)));
        cajoneriaGol.addCaja(new Caja<Golosina>("Amarillo", new Golosina("Gomita", 0.2)));
        cajoneriaGol.addCaja(new Caja<Golosina>("Verde", new Golosina("Chupetin", 0.8)));
        cajoneriaGol.addCaja(new Caja<Golosina>("Azul", new Golosina("Chocolate", 1.0)));
        cajoneriaGol.addCaja(new Caja<Golosina>("Morado", new Golosina("Galleta", 0.3)));
        cajoneriaGol.addCaja(new Caja<Golosina>("Naranja", new Golosina("Gomita", 0.2)));

        System.out.println(cajoneriaGol);

        Golosina buscada = new Golosina("Gomita", 0.2);
        System.out.println("Búsqueda: " + cajoneriaGol.search(buscada));

        Golosina eliminada = cajoneriaGol.delete(new Golosina("Chocolate", 1.0));
        System.out.println("Eliminado: " + eliminada);

        System.out.println("\nCajonería después de eliminar:");
        System.out.println(cajoneriaGol);

        System.out.println("Ocurrencias de Gomita 0.2: " + cajoneriaGol.contar(new Golosina("Gomita", 0.2)));

        System.out.println("\n====== CAJONERÍA DE CHOCOLATINAS ======");
        Cajoneria<Chocolatina> cajoneriaCho = new Cajoneria<Chocolatina>(10);

        cajoneriaCho.addCaja(new Caja<Chocolatina>("Rojo", new Chocolatina("Milka")));
        cajoneriaCho.addCaja(new Caja<Chocolatina>("Amarillo", new Chocolatina("Ferrero")));
        cajoneriaCho.addCaja(new Caja<Chocolatina>("Verde", new Chocolatina("Sublime")));
        cajoneriaCho.addCaja(new Caja<Chocolatina>("Azul", new Chocolatina("Milka")));
        cajoneriaCho.addCaja(new Caja<Chocolatina>("Negro", new Chocolatina("Princesa")));

        System.out.println(cajoneriaCho);

        System.out.println("Búsqueda: " + cajoneriaCho.search(new Chocolatina("Milka")));
        System.out.println("Ocurrencias de Milka: " + cajoneriaCho.contar(new Chocolatina("Milka")));

        Chocolatina elimCho = cajoneriaCho.delete(new Chocolatina("Ferrero"));
        System.out.println("Eliminado: " + elimCho);

        System.out.println("\nCajonería de chocolatinas después de eliminar:");
        System.out.println(cajoneriaCho);
    }
}