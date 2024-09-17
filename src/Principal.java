public class Principal {
    public static void main(String[] args) {
        System.out.println("Teste com o construtor default de C:");
        C obj1 = new C();
        obj1.a10();
        obj1.b20();
        obj1.c10();

        System.out.println("\n\nTeste com o construtor com argumento de C:");
        C obj2 = new C("Argumento para C");
        obj2.a10();
        obj2.b20();
        obj2.c10();
    }
}
