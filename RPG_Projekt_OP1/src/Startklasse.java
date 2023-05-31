import java.util.Scanner;
import java.util.Vector;

public class Startklasse
{
    public static void main(String[] args)
    {
        String wiederholen = "j";
        Boolean sieg = false;
        Kampf kampf = new Kampf();
        Fähigkeiten faehigkeiten = new Fähigkeiten();
        Vector<Spieler> spielerListe = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        //ANMELDUNG/CHARACTERERSTELLUNG
        begruessung();
        String[] userName = Spieler.spielerAnmeldung();
        Spieler.characterAuswahl(userName);
        spielLaed();


        //SPIELSTART
        String userAuswahl= spielStart();
        switch (userAuswahl)
        {
            case "1":
                System.out.println("Lunaris ist das Dorf, in dem du aufgewachsen bist. Lunaris liegt am Rande des Silberwaldes," +
                        "einem großen und geheimnisvollen Wald,\nder viele Pflanzen und Tiere beherbergt. Lunaris ist ein kleines und gemütliches Dorf," +
                        "wo die Menschen von der Landwirtschaft und dem Handel leben.\nLunaris ist auch ein Ort der Tradition und des Glaubens," +
                        "wo die Menschen den Mond verehren und die Magie respektieren.\nLunaris ist dein Zuhause.\n\nJetzt musst du aber wirklich los dein Meister erwartet dich!\n");
            case "2":
                try {
                    for (int i = 1; i > 0; i--)
                    {
                        Thread.sleep(500);
                    }
                    System.out.println("\nDu packst also dein wichtigstes Hab und Gut und machst dich auf die Reise.\n");
                    for (int i = 1; i > 0; i--)
                    {
                        Thread.sleep(500);
                    }

                    for (int i = 3; i > 0; i--)
                    {
                        Thread.sleep(300);
                        System.out.println("  ..");
                        System.out.println("  ..");
                        Thread.sleep(300);
                        System.out.println("       ..");
                        System.out.println("       ..");
                        Thread.sleep(300);
                    }
                    System.out.println("\n");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

        userAuswahl = dieReiseBeginnt();
        switch (userAuswahl)
        {
            case "1":
                while(wiederholen.equals("j"))
                {
                    System.out.print("\nDer Kampf beginnt!\n------------------\nDu hebst dein ");
                    if (Spieler.spielerListe.elementAt(0).getsBezeichnung() == "Schwertkämpfer") {
                        System.out.print(faehigkeiten.sWaffeKrieger);
                    } else if (Spieler.spielerListe.elementAt(0).getsBezeichnung() == "Magier") {
                        System.out.print(faehigkeiten.sWaffeMagier);
                    } else if (Spieler.spielerListe.elementAt(0).getsBezeichnung() == "Bogenschütze") {
                        System.out.print(faehigkeiten.sWaffeBogen);
                    }
                    System.out.println(" des Mondlichts und greifst an!\n");
                    try {
                        for (int i = 1; i > 0; i--) {
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sieg = Kampf.starteKampf();
                    if(!sieg)
                    {
                        System.out.println("\nMöchtest du es nochmal versuchen? (j/n)");
                        wiederholen = scanner.nextLine();
                    }
                    else if(sieg) wiederholen="n";
                }
            }

/*
        String go;
        System.out.print("\nMöchtest du nun deinen ersten Kampf ausführen?\n(j/n) -> ");
        go = scanner.nextLine();
        switch (go)
        {
            case "j": break;
            case "n":
                System.out.println("Du Feigling! Spiel wird neugestartet...");
                System.out.println();
                System.out.println();
                main(args);

        }
        System.out.println("\nDu trittst deinem Gegner gegenüber, ein KAMPFPILZ!\nMöchtest du \n1) angreifen \n2) Flüchten");
        go = scanner.nextLine();

        switch (go)
        {

            case "1":
                Kampf kampf = new Kampf();
                String nochmal="1";
                do
                {
                    Kampf.starteKampf(); //spieler.spielerListe
                    System.out.println("Möchtest du deinem nächsten Gegener gegenübertreten? Wähle (1/2)");
                    nochmal = scanner.nextLine();
                }while(nochmal.equals("1"));
                break;
            case "2":
                Spieler.characterAuswahl(vorNachName);          //wird nicht funktionieren kein pointer
            default:
        }

        /*
        boolean weiter = ersterKampf();
        if(weiter==true)
        {
            weiter = kaempfe();
        }

*/
    }

    public static void begruessung()
    {
        System.out.println("\n#######################################################");
        System.out.println("#      Willkommen bei den Chroniken von Zyria!        #");
        System.out.println("#######################################################");
        System.out.println("#                                                     #");
        System.out.println("#        #                 ##################         #");
        System.out.println("#         ##               ##              ##         #");
        System.out.println("#          ###             ##              ##         #");
        System.out.println("#           ###            ##              ##         #");
        System.out.println("#            ###           ##              ##         #");
        System.out.println("#             ###   ##     ##              ##         #");
        System.out.println("#              ### ##       ##            ##          #");
        System.out.println("#          ##  #####          ##         ##           #");
        System.out.println("#                 ##            ##     ##             #");
        System.out.println("#                  ##              ###                #");
        System.out.println("#                                                     #");
        System.out.println("#######################################################");
        System.out.println("#                   made by USIT60                    #");
        System.out.println("#######################################################");
    }

    public static void spielLaed()
    {
        try {
            for (int i = 1; i > 0; i--) {
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Das Spiel beginnt! ");
        try {
            System.out.print("Die Welt wird geladen.");
            for (int i = 5; i > 0; i--) {
                System.out.print(".");
                Thread.sleep(1000);
            }
            System.out.println("\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String spielStart()
    {
        Scanner scanner = new Scanner(System.in);
        Fähigkeiten faehigkeiten = new Fähigkeiten();
        System.out.println("Du betrittst die Welt Zyria, eine Welt voller Magie und Geheimnisse, wo verschiedene Völker um die\n" +
                "Kontrolle über die uralten Relikte kämpfen.");
        System.out.println();
        System.out.print("Du beginnst in deinem Heimatdorf Lunaris, einem friedlichen Ort am Rande des Silberwaldes.\n" +
                "Du bist ein junger "+Spieler.spielerListe.elementAt(0).getsBezeichnung()+", der davon träumt, die Welt zu erkunden und die Geheimnisse\n");
        if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Schwertkämpfer") { System.out.print(faehigkeiten.sDeinerKraft); }
        else if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Magier") { System.out.print(faehigkeiten.sDerMagie); }
        else if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Bogenschütze") { System.out.print(faehigkeiten.sDeinerZielgenau); }
        System.out.print(" zu erforschen.\n\nDu hast von deinem Meister gelernt, ");
        if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Schwertkämpfer") { System.out.println(faehigkeiten.sVomMeisterKrieger); }
        else if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Magier") { System.out.println(faehigkeiten.sVomMeisterMagier); }
        else if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Bogenschütze") { System.out.println(faehigkeiten.sVomMeisterBogen); }
        System.out.println("Dein Meister hat dir auch von den Relikten erzählt, mächtigen Artefakten, die von den alten Zivilisationen\n" +
                "geschaffen wurden und die das Schicksal von Zyria beeinflussen können.\n" +
                "\n" +
                "Eines Tages erhältst du einen Brief von deinem Meister, in dem er dich bittet, ihn in der Stadt Solara zu treffen.\n" +
                "Er schreibt, dass er etwas Wichtiges mit dir zu besprechen hat und dass du dich beeilen sollst.\n" +
                "Du packst deine Sachen und machst dich auf den Weg. Du weißt nicht, was dich erwartet, aber du spürst,\n" +
                "dass dies der Beginn eines großen Abenteuers ist.\n\nMöchtest du mehr über Zyria erfahren oder so schnell wie möglich " +
                "die Reise zu deinem Meister antreten?\n1) Mehr über Lundaris erfahren\n2) Lass uns endlich los machen!");
        String userAuswahl = scanner.nextLine();
        return userAuswahl;
    }

    public static String dieReiseBeginnt()
    {
        Scanner scanner = new Scanner(System.in);
        Fähigkeiten faehigkeiten = new Fähigkeiten();
        System.out.print("Du verlässt das Dorf Lunaris mit einem Rucksack voller Proviant und einem ");
        if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Schwertkämpfer") { System.out.print(faehigkeiten.sWaffeKrieger); }
        else if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Magier") { System.out.print(faehigkeiten.sWaffeMagier); }
        else if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Bogenschütze") { System.out.print(faehigkeiten.sWaffeBogen); }
        System.out.print(" in der Hand. Du bist aufgeregt und nervös zugleich,\n" +
                "denn du hast noch nie dein Dorf verlassen. Du folgst dem Pfad, der dich durch den Silberwald führt. Du bewunderst die Schönheit der Natur, die dich umgibt.\n" +
                "Du siehst bunte Blumen, riesige Bäume und flinke Tiere. Du atmest die frische Luft ein und fühlst dich frei.\n" +
                "\n" +
                "Plötzlich hörst du ein Rascheln im Gebüsch. Du bleibst stehen und schaust dich um. Du siehst einen großen Pilz aus dem Boden sprießen.\n" +
                "Er hat einen braunen Hut mit weißen Punkten und einen dicken Stiel. Er sieht harmlos aus, aber du spürst etwas Unheimliches an ihm.\n" +
                "Du greifst nach deinem ");
        if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Schwertkämpfer") { System.out.print(faehigkeiten.sWaffeKrieger); }
        else if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Magier") { System.out.print(faehigkeiten.sWaffeMagier); }
        else if(Spieler.spielerListe.elementAt(0).getsBezeichnung()=="Bogenschütze") { System.out.print(faehigkeiten.sWaffeBogen); }
        System.out.println(" des Mondlichts und bereitest dich auf einen Kampf vor.\n" +
                "\n" +
                "Der Pilz bemerkt dich und dreht sich zu dir um. Er hat zwei kleine Augen und ein breites Grinsen auf seinem Hut. Er öffnet seinen Mund und spuckt eine grüne Flüssigkeit auf dich.\n" +
                "Du weichst aus und siehst, wie die Flüssigkeit den Boden verätzt. Du erkennst, dass der Pilz feindlich ist und dich angreifen will. Du musst dich verteidigen oder flüchten.\n" +
                "1) Angreifen\n2) Flüchten");
        String userAuwahl = scanner.nextLine();
        return userAuwahl;
    }

/*
    public static boolean ersterKampf()
    {
        Scanner scanner = new Scanner(System.in);
        String go;

        System.out.print("\nMöchtest du nun deinen ersten Kampf ausführen?\n(j/n) -> ");
        go = scanner.nextLine();
        switch (go)
        {
            case "j": return true;
            case "n":
                System.out.println("Du Feigling! Spiel wird neugestartet...");
                return false;  // Wird nicht funktionieren, weil kein Pointer vorhanden..
        }
        return true;
    }

    public static boolean kaempfe()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDu trittst deinem Gegner gegenüber, ein KAMPFPILZ!\nMöchtest du \n1) angreifen \n2) Flüchten");
        String go = scanner.nextLine();

        switch (go)
        {
            case "1":
                Kampf kampf = new Kampf();
                String nochmal="1";
                do
                {
                    Kampf.starteKampf(); //spieler.spielerListe
                    System.out.println("Möchtest du deinem nächsten Gegener gegenübertreten? Wähle (j/n)");
                    nochmal = scanner.nextLine();
                }while(nochmal.equals("j"));

            case "n":
                System.out.println("\nNächster Gegner wird gesucht...");
                return true;          //wird nicht funktionieren kein pointer
            default:
        }
        return true;
    }
*/

}

