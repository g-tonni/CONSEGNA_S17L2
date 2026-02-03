package giadatonni.CONSEGNA_S17L2.entities;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu {
    private List<Pizza> listaPizze;
    private List<Topping> listaTopping;
    private List<Bevande> listaBevande;

    public Menu (List<Pizza> listaPizze, List<Topping> listaTopping, List<Bevande> listaBevande){
        this.listaPizze = listaPizze;
        this.listaTopping = listaTopping;
        this.listaBevande = listaBevande;
    }

    public void stampaMenu(){
        System.out.println("");
        System.out.println("Pizze");
        this.listaPizze.forEach(elementoMenu -> System.out.println(elementoMenu));
        System.out.println("");
        System.out.println("Topping");
        this.listaTopping.forEach(elementoMenu -> System.out.println(elementoMenu));
        System.out.println("");
        System.out.println("Bevande");
        this.listaBevande.forEach(elementoMenu -> System.out.println(elementoMenu));
    }

    public List<Pizza> getListaPizze() {
        return listaPizze;
    }

    public void setListaPizze(List<Pizza> listaPizze) {
        this.listaPizze = listaPizze;
    }

    public List<Topping> getListaTopping() {
        return listaTopping;
    }

    public void setListaTopping(List<Topping> listaTopping) {
        this.listaTopping = listaTopping;
    }

    public List<Bevande> getListaBevande() {
        return listaBevande;
    }

    public void setListaBevande(List<Bevande> listaBevande) {
        this.listaBevande = listaBevande;
    }
}
