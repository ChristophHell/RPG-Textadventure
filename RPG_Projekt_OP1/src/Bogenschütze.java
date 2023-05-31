public class Bogenschütze extends Character
{
    protected String sBezeichnung = "Bogenschütze";
    protected int level = 1;
    protected int mp = 50;
    protected int hp = 350;
    protected int staerke = 35;
    protected int intelligenz = 45;
    protected int angriffskraft = staerke*intelligenz/23;;

    public Bogenschütze()
    {

    }

    public String getsBezeichnung() { return sBezeichnung; }
    public void setsBezeichnung(String sBezeichnung) { this.sBezeichnung = sBezeichnung; }


    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

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

}

