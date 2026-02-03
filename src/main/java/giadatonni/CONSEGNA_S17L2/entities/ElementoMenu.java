package giadatonni.CONSEGNA_S17L2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class ElementoMenu {
    private String name;
    private int calorie;
    private double prezzo;

    public ElementoMenu(String name, int calorie, double prezzo){
        this.name = name;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public ElementoMenu(String name){
        this.name = name;
    }
}