package br.com.alura.conversor.domain;

public enum Currency {
    USD("Dólar Americano"),
    BRL("Real Brasileiro"),
    ARS("Peso Argentino"),
    COP("Peso Colombiano");

    private final String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
