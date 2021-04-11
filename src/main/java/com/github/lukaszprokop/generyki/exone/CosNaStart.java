package com.github.lukaszprokop.generyki.exone;

class Main{
    public static void main(String[] args) {
        System.out.println(new CosNaStart(1));
        System.out.println(new CosNaStart("1"));
    }
}

class CosNaStart {
// TODO: Przerób tą klasę tak aby można było uruchomić Main.main()
    private final String number;

    public CosNaStart(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }
}

