package mein.heim;

import java.util.Calendar;
import java.util.Scanner;
import mein.heim.Fenster;
import mein.heim.Heizung;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class MeineRegelMaschine {
  public static void main(final String[] args) {
    new MeineRegelMaschine().run();
  }
  
  public void run() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Haussimulator aktiviert. Folgende Befehle stehen zur Verfügung : ");
    System.out.println(" - Heizung an");
    System.out.println(" - Heizung aus");
    System.out.println(" - Fenster auf");
    System.out.println(" - Fenster zu");
    System.out.println("Warte auf Eingabe...");
    while(sc.hasNextLine()) {
        String command = sc.nextLine();
        String[] split = command.split(" ");
        if (split[0].equals("Heizung")) {
        if (split[1].equals("an")) {
            trigger(Heizung.an);
        } else 
        if (split[1].equals("aus")) {
            trigger(Heizung.aus);
        } else 
                {
                System.err.println("Der Zustand "+split[1]+" ist für das Gerät "+split[0]+" nicht definiert.");
            }
        }
        if (split[0].equals("Fenster")) {
        if (split[1].equals("auf")) {
            trigger(Fenster.auf);
        } else 
        if (split[1].equals("zu")) {
            trigger(Fenster.zu);
        } else 
                {
                System.err.println("Der Zustand "+split[1]+" ist für das Gerät "+split[0]+" nicht definiert.");
            }
        }
        System.out.println("Warte auf Eingabe...");
    }
  }
  
  protected void trigger(final Enum<?> event) {
    System.out.println("Signal '"+event.getClass().getSimpleName()+" "+event+"' eingegangen.");
    if (event == Heizung.an) {
        trigger(dann_0());
    }
    if (event == Fenster.auf) {
        trigger(dann_1());
    }
  }
  
  public Enum<?> dann_0() {
    Calendar _instance = Calendar.getInstance();
    final int month = _instance.get(Calendar.MONTH);
    if (((month > 3) && (month < 8))) {
      InputOutput.<String>println("Was? es ist Sommer!");
      return Heizung.aus;
    } else {
      return Fenster.zu;
    }
  }
  
  public Heizung dann_1() {
    return Heizung.aus;
  }
}
