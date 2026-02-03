package giadatonni.CONSEGNA_S17L2.entities;

public class Tavolo {
    private int numeroTavolo;
    private int maxCoperti;
    private StatoTavolo statoTavolo;

    public Tavolo(int numeroTavolo, int maxCoperti, StatoTavolo statoTavolo){
        this.numeroTavolo = numeroTavolo;
        this.maxCoperti = maxCoperti;
        this.statoTavolo = statoTavolo;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public void setMaxCoperti(int maxCoperti) {
        this.maxCoperti = maxCoperti;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo:" +
                "numeroTavolo=" + numeroTavolo +
                ", maxCoperti=" + maxCoperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
