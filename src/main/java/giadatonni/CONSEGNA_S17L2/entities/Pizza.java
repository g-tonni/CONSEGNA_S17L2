package giadatonni.CONSEGNA_S17L2.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Pizza extends ElementoMenu{
    private List<Topping> listaTopping;

    public Pizza(String name, List<Topping> listaTopping){
        super(name);
        this.listaTopping = listaTopping;
        this.setCalorie(1000);
        this.setPrezzo(4);
        for (int i = 0; i<listaTopping.size(); i++){
            this.setCalorie(this.getCalorie() + listaTopping.get(i).getCalorie());
            this.setPrezzo(this.getPrezzo() + listaTopping.get(i).getPrezzo());
        }

    }

    public void addTopping(Topping topping) {
         this.listaTopping.add(topping);
         this.setCalorie(this.getCalorie() + topping.getCalorie());
         this.setPrezzo(this.getPrezzo() + topping.getPrezzo());
    }

    @Override
    public String toString() {
        String topping = listaTopping.stream()
                .map(Topping::getName)
                .reduce((a, b) -> a + ", " + b)
                .orElse("nessuno");
        return this.getName() + "(" +  topping + ") | " + this.getCalorie() + "cal | " + this.getPrezzo() + "€";
    }
}
