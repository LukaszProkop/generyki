package com.github.lukaszprokop.generyki.exthree;

class Main {
    public static void main(String[] args) {
        new Printer(10d).print();
        new Printer(10f).print();
        new Printer(10).print();

        //TODO: Poniższe dwa wywołania nie powinny się kompilować
        new Printer("Ten").print();
        new Printer('X').print();
    }
}

class Printer {
    //TODO: Przerób klasę Printer tak aby działały tylko 3 pierwsze wywołania metody print() w Main.main()
    private final Object object;

    public Printer(Object object) {
        this.object = object;
    }

    void print() {
        System.out.println(object);
    }
}
