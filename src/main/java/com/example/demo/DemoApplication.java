package com.example.demo;

import com.example.temp.Button;
import com.example.toggle.Switchable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private static Switchable button;

	public static void main(String[] args) {
		new PrintWelcome();

		System.out.println("Test, 2");
		System.out.println("Un autre message");
		System.out.println("Commit avant checkout vers dev, puis Un commit depuis dev");

		var chiffre = 1;
		if(chiffre == (int)chiffre && chiffre % 2 == 0) {
			System.out.println("Pair");
		}
		else {
			System.out.println("Impair ou non chiffre");
		}

		button = new Button(10, 100);
		button.toggleOn();
		System.out.println(button.getValue());

		System.out.println("Du contenu temporaire");

		System.out.println("Before origin master update");

		//SpringApplication.run(DemoApplication.class, args);

		//Un commentaire pour une mise à jour
	}

}
