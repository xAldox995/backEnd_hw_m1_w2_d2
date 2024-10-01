package esercizio3;

import java.util.Objects;

public class Contatto {
    private String fullName;
    private String number;

    public Contatto(String fullName, String number) {
        this.fullName = fullName;
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contatto contatto = (Contatto) o;
        return Objects.equals(fullName, contatto.fullName) && Objects.equals(number, contatto.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, number);
    }

    @Override
    public String toString() {
        return "Nome: " + fullName + " - Telefono: " + number;
    }
}
