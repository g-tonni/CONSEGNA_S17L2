package giadatonni.CONSEGNA_S17L2.entities;

import lombok.Getter;

@Getter
public class Topping extends ElementoMenu{
    public Topping(String name, int calorie, double prezzo){
        super(name, calorie, prezzo);
    }

    @Override
    public String toString() {
        return this.getName() + " | " + this.getCalorie() + "cal | " + this.getPrezzo() + "€";
    }
}
