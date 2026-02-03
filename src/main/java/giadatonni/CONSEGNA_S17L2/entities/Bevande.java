package giadatonni.CONSEGNA_S17L2.entities;

import lombok.Getter;

@Getter
public class Bevande extends ElementoMenu {
    private double percentualeAlcol;
    private double quantita;
    public Bevande(String name, int calorie, double prezzo, double percentualeAlcol, double quantita){
        super(name, calorie, prezzo);
        this.percentualeAlcol = percentualeAlcol;
        this.quantita = quantita;
    }

    public Bevande(String name, int calorie, double prezzo, double quantita){
        super(name, calorie, prezzo);
        this.percentualeAlcol = 0;
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return this.getName() + "(" + quantita + "l, " + percentualeAlcol + "%) | " + this.getCalorie() + "cal | " + this.getPrezzo() + "€";
    }
}
