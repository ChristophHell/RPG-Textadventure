import java.util.Scanner;
import java.util.Vector;

public class Spieler
{
    protected static Vector<Spieler> spielerListe = new Vector<>();

    private String sVorname;
    private String sNachname;
    private String sSpielername;
    private String sBezeichnung;
    private int iLevel;
    private int iXP;
    private int hp;
    private int mp;
    private int staerke;
    private int intelligenz;
    private int angriffskraft;

     @Override
    public String toString() {
        return  "Level:         " + Spieler.spielerListe.elementAt(0).getiLevel() +
                "\nLeben          " + Spieler.spielerListe.elementAt(0).getHp() +
                "\nMana:          " + Spieler.spielerListe.elementAt(0).getMp() +
                "\nStärke:        " + Spieler.spielerListe.elementAt(0).getStaerke() +
                "\nIntelligenz:   " + Spieler.spielerListe.elementAt(0).getIntelligenz() +
                "\nAngriffskraft: " + Spieler.spielerListe.elementAt(0).getAngriffskraft() +
                "\nXP:            " + Spieler.spielerListe.elementAt(0).getiXP() +
                "\n";
    }

    public Spieler()
    {}

    public Spieler(String sVorname, String sNachname, String sSpielername, String sBezeichnung, int iLevel, int iXP, int hp, int mp, int staerke, int intelligenz, int angriffskraft) {
        this.sVorname = sVorname;
        this.sNachname = sNachname;
        this.sSpielername = sSpielername;
        this.sBezeichnung = sBezeichnung;
        this.iLevel = iLevel;
        this.iXP = iXP;
        this.mp = mp;
        this.hp = hp;
        this.staerke = staerke;
        this.intelligenz = intelligenz;
        this.angriffskraft = angriffskraft;
        spielerListe.add(this);
    }

    public String getsVorname() { return sVorname; }
    public void setsVorname(String sVorname) { sVorname = sVorname; }

    public String getsNachname() { return sNachname; }
    public void setsNachname(String sNachname) { sNachname = sNachname; }

    public String getsSpielername() { return sSpielername; }
    public void setsSpielername(String sSpielername) { sSpielername = sSpielername; }

    public String getsBezeichnung() { return sBezeichnung; }
    public void setsBezeichnung(String sBezeichnung) { sBezeichnung = sBezeichnung; }

    public int getMp() { return mp; }
    public void setMp(int mp) { this.mp = mp; }

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public int getStaerke() { return staerke; }
    public void setStaerke(int staerke) { this.staerke = staerke; }

    public int getIntelligenz() { return intelligenz; }
    public void setIntelligenz(int intelligenz) { this.intelligenz = intelligenz; }

    public int getAngriffskraft() { return angriffskraft; }
    public void setAngriffskraft(int angriffskraft) { this.angriffskraft = angriffskraft; }

    public int getiXP() { return iXP; }
    public void setiXP(int iXP) { this.iXP = iXP; }

    public int getiLevel() { return iLevel; }
    public void setiLevel(int iLevel) { this.iLevel = iLevel; }

    public static Vector<Spieler> getSpielerListe() { return spielerListe; }

    public static void setSpielerListe(Vector<Spieler> spielerListe) { Spieler.spielerListe = spielerListe; }


    public static String[] spielerAnmeldung()
    {
        Spieler spieler = new Spieler();
        Scanner scanner = new Scanner(System.in);
        String[] name = {"",""};
        System.out.print("\nGeben Sie Ihren Vornamen ein: ");
        name[0] = scanner.nextLine();
        System.out.print("Geben Sie jetzt Ihren Nachnamen ein: ");
        name[1] = scanner.nextLine();
        System.out.println("\nHallo "+name[0]+" "+name[1]+"\nVielen Dank für deine Anmeldung!");
        System.out.println();
        System.out.println();
        System.out.println("#######################################################");
        System.out.println("#######################################################");
        System.out.println();
        return name;
    }


    public static void characterAuswahl(String[] vorNachname)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLass uns mit der Erstellung deines Characters beginnen!");
        System.out.print("\nGebe zuerst deinen gewünschten Spielername ein: ");
        String spielerNameTemp = scanner.nextLine();
        System.out.println("\nWelcher Klasse soll "+spielerNameTemp+" angehören?");

        System.out.println("[1] Schwertkämpfer\n[2] Magier\n[3] Bogenschütze");
        String eingabe = scanner.nextLine();

        Krieger krieger = new Krieger();
        Magier magier = new Magier();
        Bogenschütze bogen = new Bogenschütze();

        switch(eingabe)
        {
            case "1":
                Spieler spielerSchwertkaempfer = new Spieler(vorNachname[0], vorNachname[1],spielerNameTemp, krieger.getsBezeichnung(), 1, 0, krieger.getHp(), krieger.getMp(), krieger.getStaerke(), krieger.getIntelligenz(), krieger.getAngriffskraft());
                System.out.println("\nDein " + krieger.getsBezeichnung() + " wurde erstellt!\n" + Spieler.spielerListe.elementAt(0).getsSpielername() + " hat folgende Anfangswerte");
                System.out.println(Spieler.spielerListe.elementAt(0).toString());
                break;

            case "2":
                Spieler spielerMagier = new Spieler(vorNachname[0], vorNachname[1],spielerNameTemp, magier.getsBezeichnung(), 1, 0, magier.getHp(), magier.getMp(), magier.getStaerke(), magier.getIntelligenz(), magier.getAngriffskraft());
                System.out.println("\nDein " + magier.getsBezeichnung() + " wurde erstellt!\n" + Spieler.spielerListe.elementAt(0).getsSpielername() + " hat folgende Anfangswerte!");
                System.out.println(Spieler.spielerListe.elementAt(0).toString());
                break;

            case "3":
                Spieler spielerBogenschütze = new Spieler(vorNachname[0], vorNachname[1],spielerNameTemp, bogen.getsBezeichnung(), 1, 0, bogen.getHp(), bogen.getMp(), bogen.getStaerke(), bogen.getIntelligenz(), bogen.getAngriffskraft());
                System.out.println("\nDein " + bogen.getsBezeichnung() + " wurde erstellt!\n" + Spieler.spielerListe.elementAt(0).getsSpielername() + " hat folgende Anfangswerte!");
                System.out.println(Spieler.spielerListe.elementAt(0).toString());
                break;
            default:
                System.out.println("\nUngültige Eingabe, wähle erneut!!!!");
                characterAuswahl(vorNachname);      // wird nicht funktionieren kein pointer?
        }
    }

    public static void levelUp()
    {
        if(spielerListe.elementAt(0).getiLevel() == 1 && spielerListe.elementAt(0).getiXP() >= 100)
        {
            spielerListe.elementAt(0).setiLevel(spielerListe.elementAt(0).getiLevel()+1);
            spielerListe.elementAt(0).setStaerke(spielerListe.elementAt(0).getStaerke()+10);
            spielerListe.elementAt(0).setIntelligenz(spielerListe.elementAt(0).getIntelligenz()+10);
            spielerListe.elementAt(0).setHp(spielerListe.elementAt(0).getHp()+10);
            spielerListe.elementAt(0).setMp(spielerListe.elementAt(0).getMp()+10);
            spielerListe.elementAt(0).setAngriffskraft(spielerListe.elementAt(0).getAngriffskraft()+10);
            System.out.println("Herzlichen Glückwunsch, du hast Level " + spielerListe.elementAt(0).getiLevel() + " erreicht!\n");
            System.out.println("Hier deine neuen Werte:\n");
            System.out.println(Spieler.spielerListe.elementAt(0).toString());
        }
        else if(spielerListe.elementAt(0).getiXP() >= (spielerListe.elementAt(0).getiLevel() * 100))
        {
            spielerListe.elementAt(0).setiLevel(spielerListe.elementAt(0).getiLevel()+1);
            spielerListe.elementAt(0).setStaerke(spielerListe.elementAt(0).getStaerke()+spielerListe.elementAt(0).getiLevel()*2);
            spielerListe.elementAt(0).setIntelligenz(spielerListe.elementAt(0).getIntelligenz()+spielerListe.elementAt(0).getiLevel()*2);
            spielerListe.elementAt(0).setHp(spielerListe.elementAt(0).getHp()+spielerListe.elementAt(0).getiLevel()*10);
            spielerListe.elementAt(0).setMp(spielerListe.elementAt(0).getMp()+spielerListe.elementAt(0).getiLevel()*5);
            spielerListe.elementAt(0).setAngriffskraft(spielerListe.elementAt(0).getMp()+spielerListe.elementAt(0).getiLevel()*2);
            System.out.println("Herzlichen Glückwunsch, du hast Level " + spielerListe.elementAt(0).getiLevel() + " erreicht!\n");
            System.out.println("Hier deine neuen Werte:\n");
            System.out.println(Spieler.spielerListe.elementAt(0).toString());
        }
    }
}
