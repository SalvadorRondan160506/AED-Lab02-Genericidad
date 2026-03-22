package actividades;

public class Principal {
    public static void main(String[] args) {
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(3);

        Chocolatina c = new Chocolatina("Milka");
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");

        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }
        
        Bolsa<Golosina> bolsaGol = new Bolsa<Golosina>(3);
        
        Golosina g1 = new Golosina("Caramelo", 0.5);
        Golosina g2 = new Golosina("Gomita", 0.2);
        Golosina g3 = new Golosina("Chupetin", 0.8);

        bolsaGol.add(g1);
        bolsaGol.add(g2);
        bolsaGol.add(g3);

        for (Golosina golosina : bolsaGol) {
            System.out.println(golosina.getNombre() + " - " + golosina.getPeso());
        }
        
    }
}