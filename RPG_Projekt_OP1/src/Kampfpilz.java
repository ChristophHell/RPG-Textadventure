import java.util.Random;

public class Kampfpilz extends Enemy
{
    public Kampfpilz() {}

    Random random = new Random();
    int randNr = random.nextInt(10);

    private int level = randNr+1;
    private String sName = "Kampfpilz Lvl " + getLevel();
    private int hp = super.getHp() + level * 15;
    private int staerke = super.getStaerke() + level * 10;
    private int angriffskraft = super.getAngriffskraft() + staerke;

    public String getsName() { return sName; }
    public int getLevel() { return level; }
    @Override
    public int getHp() { return hp; }
    public int getStaerke() { return staerke; }
    public int getAngriffskraft() { return angriffskraft; }

    public void setHp(int hp) { this.hp = hp; }
}
