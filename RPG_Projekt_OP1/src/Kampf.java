import java.util.Random;

public class Kampf
{
    private static Random randomAngriff = new Random();
    public static int i;

    public static boolean starteKampf()
    {
        Kampfpilz kampfpilz = new Kampfpilz();
        int kampfpilzHP = kampfpilz.getHp();
        int kampfpilzAK = kampfpilz.getAngriffskraft();
        int kampfpilzLV = kampfpilz.getLevel();
        int spielerHP = Spieler.spielerListe.elementAt(0).getHp();
        int spielerAK = Spieler.spielerListe.elementAt(0).getAngriffskraft();

        boolean kaempferAmZug = true;
        i=0;

        while (spielerHP > 0 && kampfpilzHP > 0)
        {
            if (kaempferAmZug)
            {
                int schaden = berechneSchaden(spielerAK);
                kampfpilzHP-=schaden;
                if(kampfpilzHP<0) { kampfpilzHP = 0; }
                System.out.println("\n"+Spieler.spielerListe.elementAt(0).getsSpielername() + " greift " + kampfpilz.getsName() + " an und verursacht " + schaden + " Schaden.");
                System.out.println(kampfpilz.getsName() + " hat jetzt "+kampfpilzHP+" HP");
                try {
                    for (int i = 1; i > 0; i--)
                    {
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else
            {
                int schaden = berechneSchadenKampfpilz(kampfpilzAK);
                spielerHP-=schaden;
                if(spielerHP<0) { spielerHP = 0; }
                System.out.println("\n"+kampfpilz.getsName() + " greift " + Spieler.spielerListe.elementAt(0).getsSpielername() + " an und verursacht " + schaden + " Schaden.");
                System.out.println(Spieler.spielerListe.elementAt(0).getsSpielername()+" hat jetzt "+spielerHP+" HP");

                try {
                    for (int i = 1; i > 0; i--)
                    {
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            kaempferAmZug = !kaempferAmZug;
            i++;
        }

        if (spielerHP <= 0)
        {
            System.out.println("\nDu hast den Kampf verloren. Game Over!\n");
            return false;
        }
        else
        {
            System.out.println("\nDu hast den Kampf gewonnen!");
            spieleraufstieg(i,kampfpilzLV);
            return true;
        }
    }

    public static int berechneSchaden(int aKspieler)
    {
        int randomHit = randomAngriff.nextInt(25);
        return aKspieler + randomHit;
    }

    public static int berechneSchadenKampfpilz(int aKPilz)
    {
        int randomHit = randomAngriff.nextInt(25);
        return aKPilz + randomHit;
    }

    public static void spieleraufstieg(int i,int kampfpilzLV)
    {
        /*
        System.out.println("Vorher: "+i);
        System.out.println(Spieler.spielerListe.elementAt(0).toString());
        */
        Spieler.spielerListe.elementAt(0).setiXP(Spieler.spielerListe.elementAt(0).getiXP()+i+kampfpilzLV+100);             // Hier wird der Spieler belohnt, Level wird erhöht. Evtl (kampfplilzLV/2)
        //System.out.println("Nachher:");
        System.out.println("Dein XP-Wert steigt!\n");
        System.out.println(Spieler.spielerListe.elementAt(0).toString());
        if(Spieler.spielerListe.elementAt(0).getiLevel() == 1 && Spieler.spielerListe.elementAt(0).getiXP() >= 100)
        {
            Spieler.levelUp();
        }
        else if(Spieler.spielerListe.elementAt(0).getiXP() >= (Spieler.spielerListe.elementAt(0).getiLevel()*100))
        {
            Spieler.levelUp();
        }

    }

    /*
    public int gegnerAuswahl()
    {
        String[] gegner = {"Kampfpilz","Krieger","Bogenschütze","Magier"};

        Random random = new Random();
        int randNr = random.nextInt(gegner.length);
        String tempEnemy = gegner[randNr];

        int gewaehlerGegner = switch (tempEnemy) {
            case "Kampfpilz" -> 1;
            case "Krieger" -> 2;
            case "Magier" -> 3;
            case "Bogenschütze" -> 4;
            default -> 100;
        };
        return gewaehlerGegner;
    }
    */
}
