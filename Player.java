import SGE.*;
public class Player
{
    private SGBild sprite;
    private boolean lookLeft;
    private int hp;
    private int maxHP;
    private boolean jumping;
    private double vY;
    private double vX;
    private boolean alive;
    private Weapon myWeapon;
    private SGTastatur keyboard;
    
    public Player()
    {
        keyboard = new SGTastatur();
        sprite = new SGBild(100,100,"Egg.png");
    }

    public void update()
    {
        
    }
    public void move()
    {
        
    }
    public void jump()
    {
    
    }
    public void shoot()
    {
    
    }
    public void die()
    {
    
    }
    public void takeChest(Chest chest)
    {
    
    }
    
}
