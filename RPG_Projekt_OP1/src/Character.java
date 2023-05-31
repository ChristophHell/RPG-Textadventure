public class Character
{
    protected String sBezeichnung;
    protected int level;
    protected int xp;
    protected int mp;
    protected int hp;
    protected int staerke;
    protected int intelligenz;
    protected int angriffskraft;

    public Character()
    {

    }

    public Character(String sBezeichnung, int level, int mp, int hp, int staerke, int intelligenz, int xp, int angriffskraft)
    {
        this.sBezeichnung = sBezeichnung;
        this.level = level;
        this.mp = mp;
        this.hp = hp;
        this.staerke = staerke;
        this.intelligenz = intelligenz;
        this.xp = xp;
        this.angriffskraft = angriffskraft;
    }

    public int getAngriffskraft() {
        return angriffskraft;
    }
    public void setAngriffskraft(int angriffskraft) {
        this.angriffskraft = angriffskraft;
    }

    public String getsBezeichnung() {
        return sBezeichnung;
    }
    public void setsBezeichnung(String sBezeichnung) { sBezeichnung = sBezeichnung; }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStaerke() {
        return staerke;
    }
    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getIntelligenz() {
        return intelligenz;
    }
    public void setIntelligenz(int intelligenz) {
        this.intelligenz = intelligenz;
    }

    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }

}
