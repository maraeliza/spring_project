package web.springbootmvc.model;

public class ClasseQualquer {
    private int valor1;
    private String valor2;
    private boolean valor3;

    public ClasseQualquer() {
    }

    public ClasseQualquer(int valor1, String valor2, boolean valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public boolean isValor3() {
        return valor3;
    }

    public void setValor3(boolean valor3) {
        this.valor3 = valor3;
    }

    @Override
    public String toString() {
        return "valor1: " + valor1 + "\nvalor2: " + valor2 + "\nvalor3: " + valor3;
    }
}
