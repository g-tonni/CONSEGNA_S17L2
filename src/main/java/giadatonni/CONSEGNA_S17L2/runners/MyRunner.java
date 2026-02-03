package giadatonni.CONSEGNA_S17L2.runners;

import giadatonni.CONSEGNA_S17L2.entities.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Autowired
    private double costoCoperto;

    private static final Logger log = LoggerFactory.getLogger(MyRunner.class);

    @Override
    public void run(String... args) throws Exception {
        menu.stampaMenu();

        Tavolo tavolo1 = new Tavolo(1, 10, StatoTavolo.OCCUPATO);
        List<ElementoMenu> listaOrdine1 = new ArrayList<>(Arrays.asList(
                menu.getListaBevande().get(1),
                menu.getListaBevande().get(0),
                menu.getListaPizze().get(0),
                menu.getListaPizze().get(1),
                menu.getListaPizze().get(2)));
        Ordine ordine1 = new Ordine(1234, tavolo1, listaOrdine1, 9, StatoOrdine.PRONTO, costoCoperto);

        log.info(ordine1.toString());
    }
}
