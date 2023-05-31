public class Enemy
{
    protected int level = 1;
    protected String sName = "BasisFeind";
    protected int hp = 200;
    protected int staerke = 15;
    protected int angriffskraft = 12;

    protected Enemy()
    {

    }

    protected Enemy(int level,String sName,int hp,int staerke, int angriffskraft)
    {
        this.hp = hp;
        this.staerke = staerke;
        this.angriffskraft = angriffskraft;
    }

    public int getHp() { return hp; }
    public int getStaerke() { return staerke; }
    public int getAngriffskraft() { return angriffskraft; }
}
