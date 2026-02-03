package giadatonni.CONSEGNA_S17L2.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Ordine {

    private int numeroOrdine;
    private Tavolo tavolo;
    private List<ElementoMenu> listaProdotti;
    private int numeroCopertiEffettivi;
    private StatoOrdine statoOrdine;
    private LocalDateTime ora;
    private double costoCoperto;
    private double prezzoTotale;

    public Ordine (int numeroOrdine,
                   Tavolo tavolo,
                   List<ElementoMenu> listaProdotti,
                   int numeroCopertiEffettivi,
                   StatoOrdine statoOrdine,
                   double costoCoperto){

        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.listaProdotti = listaProdotti;
        this.numeroCopertiEffettivi = numeroCopertiEffettivi;
        this.statoOrdine = statoOrdine;
        this.ora = LocalDateTime.now();
        this.costoCoperto = costoCoperto;
        this.prezzoTotale = numeroCopertiEffettivi * costoCoperto;;
        for (int i = 0; i < listaProdotti.size(); i++) {
            this.prezzoTotale = this.prezzoTotale + listaProdotti.get(i).getPrezzo();
        }
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public List<ElementoMenu> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<ElementoMenu> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public int getNumeroCopertiEffettivi() {
        return numeroCopertiEffettivi;
    }

    public void setNumeroCopertiEffettivi(int numeroCopertiEffettivi) {
        this.numeroCopertiEffettivi = numeroCopertiEffettivi;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public LocalDateTime getOra() {
        return ora;
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }

    public double getPrezzoTotale() {
        return prezzoTotale;
    }

    @Override
    public String toString() {
        return "Ordine numero " + numeroOrdine + " | N. Tavolo: " + tavolo.getNumeroTavolo() +
                " | Prodotti ordinati: " + listaProdotti +
                " | N. Coperti: " + numeroCopertiEffettivi +
                " | Stato dell'Ordine: " + statoOrdine +
                " | Orario: " + ora +
                " | Costo per ogni coperto: " + costoCoperto +
                " | Totale: " + prezzoTotale + "€";
    }
}
