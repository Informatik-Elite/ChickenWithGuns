import SGE.*;

public class Game
{
    private Player players[];
    private Map map;
    private List<Projectile> projectiles;
    private List<Chest> chests;
    private SGLeinwand lw;
    
    public Game()
    {
        lw = new SGLeinwand(1620, 900);
        map = new Map("levels/Level.1.txt");
    }
    public void Update()
    {
    
    }
    public void checkCollisions()
    {
    
    }
    
}
