package giadatonni.CONSEGNA_S17L2;

import giadatonni.CONSEGNA_S17L2.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ConsegnaS17L2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsegnaS17L2Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConsegnaS17L2Application.class);
		System.out.println("Eccoci nel ma");
	}

}
