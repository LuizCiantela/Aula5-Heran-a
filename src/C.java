class C extends B {
    public C() {
        super();
        System.out.println("Construtor default de C");
    }

    public C(String msg) {
        super(msg);
        System.out.println("Construtor de C com um argumento: " + msg);
    }



    @Override
    public void a10() {
        System.out.println("Método a10 em C");
    }

    @Override
    public void b20() {
        System.out.println("Método b20 em C");
    }

    public void c10() {
        System.out.println("Método c10 em C");
    }
}
