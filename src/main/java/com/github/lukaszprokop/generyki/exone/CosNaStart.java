package com.github.lukaszprokop.generyki.exone;

/**
 * Następne zadanie znajdziesz tu: {@link com.github.lukaszprokop.generyki.extwo.ListPrinter}
 */
class Main{
    public static void main(String[] args) {
        System.out.println(new CosNaStart(1));
        System.out.println(new CosNaStart("1"));
    }
}

class CosNaStart {
// TODO: Przerób tą klasę zamieniając Object na typ generyczny
    private final Object number;

    public CosNaStart(Object number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}

