package mein.heim;

import java.util.Scanner;

public class MeineRegelMaschine {

    public static void main(String[] args) {
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

    protected void trigger(Enum<?> event) {
    	System.out.println("Signal '"+event.getClass().getSimpleName()+" "+event+"' eingegangen.");
        if (event == Heizung.an) {
            trigger(Fenster.zu);
        } 
        if (event == Fenster.auf) {
            trigger(Heizung.aus);
        } 
    }
    
}
