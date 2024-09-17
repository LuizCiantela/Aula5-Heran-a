class B extends A {
    public B() {
        super();
        System.out.println("Construtor default de B");
    }

    public B(String msg) {
        super(msg);
        System.out.println("Construtor de B com um argumento: " + msg);
    }


    @Override
    public void a10() {
        System.out.println("Método a10 em B");
    }

    public void b20() {
        System.out.println("Método b20 em B");
    }
}
