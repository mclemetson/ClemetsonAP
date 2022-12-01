public class RPSGamePlayer
{
    //Attributes 
    private int health; 
    private int armor; 
    private int magicArmor; 
    //Constructors 
    //Default
    public RPSGamePlayer()
    {
        health = 10; 
        armor = 10; 
        magicArmor = 10; 
    }
    //Parameterized 
    public RPSGamePlayer(int healthIn, int armorIn, int magicArmorIn)
    {
        health = healthIn; 
        armor = armorIn; 
        magicArmor = magicArmorIn; 
    }
    //Copy 
    public RPSGamePlayer(RPSGamePlayer in)
    {
        health = in.health; 
        armor = in.armor; 
        magicArmor = in.magicArmor;
    }
    //Getters 
    public int getHealth()
    {
        return health; 
    }
    public int getArmor()
    {
        return armor; 
    }
    public int getMagicArmor()
    {
        return magicArmor; 
    }
    //Setters 
    public void setHealth(int in)
    {
        health = in;  
    }
    public void setArmor(int in)
    {
        armor = in;  
    }
    public void setMagicArmor(int in)
    {
        magicArmor = in;  
    }
    //Methods 
    public void subHealth(int val)
    {
        health -= val; 
    }
    public void addHealth(int val)
    {
        health+= val;  
    }
    public void subArmor(int val)
    {
        armor -= val; 
    }
    public void subMagicArmor(int val)
    {
        magicArmor -= val;  
    }
    public void actionList()
    {
        System.out.println("Your list of actions:");
        System.out.println("Attack - Press 1 -(this will win against a player casting a spell)");
        System.out.println("Spell - Press 2 -(this will win against a player defending)");  
        System.out.println("Defend - Press 3 -(this will win against a player defending)");
        System.out.println("Heal - Press 4 -(heals the player by 1 point, player healing will take 2 points of damage if the other is attacking or casting a spell)");
        System.out.println("Note that armor can be used to block attacks and magic armor can be used to block spells, defenses, and protect you while you are healing."); 
    }
    public void combatCheck(String command1, String command2, RPSGamePlayer one, RPSGamePlayer two)
    {
        if(command1 == "Attack")
        {
            if(command2 == "Spell")
            {
                if(two.getArmor() > 0)
                {
                    two.subArmor(1);
                    System.out.println("Your opponent played spell, it is ineffective. You take one of his armor points.");
                }
                else
                {
                    two.subHealth(1);
                    System.out.println("Your opponent played spell, your attack outpowers it. You deal a point of damage to your opponent.");
                }
            }
            else if(command2 == "Defend")
            {
                if(one.getMagicArmor() > 0)
                {
                    one.subMagicArmor(1); 
                    System.out.println("Your opponent defended your attack, and cost you a magic armor point."); 
                }
                else
                {
                    one.subHealth(1);
                    System.out.println("Your opponent defended your attack. You lose a point of health.");
                }

            }
            else if(command2 == "Heal")
            {
                if(two.getArmor() > 0)
                {
                    two.subArmor(1); 
                    System.out.println("Your opponent tried to heal, but you attacked and took one of his armor points."); 
                }
                else
                {
                    two.subHealth(2); 
                    System.out.println("Your opponent tried to heal but lost two points of health from your attack.");
                }
            }
            else
            {
                System.out.println("Both players played attack. Nothing happens.");
            }
        }
        if(command1 == "Spell")
        {
            if(command2 == "Attack")
            {
                if(one.getArmor() > 0)
                {
                    one.subArmor(1);
                    System.out.println("Your opponent attacked and negated your spell. You lose one of your armor points.");
                }
                else
                {
                    one.subHealth(1);
                    System.out.println("Your opponent attacked and negated your spell. You lost a point of health.");
                } 
            }
            else if(command2 == "Defend")
            {
                if(two.getMagicArmor() > 0)
                {
                    two.subMagicArmor(1); 
                    System.out.println("Your opponent defended, your spell takes a magic armor point from him."); 
                }
                else
                {
                    two.subHealth(1);
                    System.out.println("Your opponent defended. You deal a point of damage.");
                }

            }
            else if(command2 == "Heal")
            {
                if(two.getMagicArmor() > 0)
                {
                    two.subMagicArmor(1); 
                    System.out.println("Your opponent tried to heal, you take a magic armor point from him."); 
                }
                else
                {
                    two.subHealth(2); 
                    System.out.println("Your opponent tried to heal but took two points of damage.");
                }
            } 
            else
            {
                System.out.println("Both players played spell. Nothing happens.");
            }
        }
        if(command1 == "Defend")
        {
            if(command2 == "Spell")
            {
                if(one.getMagicArmor() > 0)
                {
                    one.subMagicArmor(1); 
                    System.out.println("Your opponent cast a spell while you defended, you lose a magic armor point"); 
                }
                else
                {
                    one.subHealth(1);
                    System.out.println("Your opponent played spell while you defended. You lose a point of health.");
                }
            }
            else if(command2 == "Attack")
            {
                if(two.getMagicArmor() > 0)
                {
                    two.subMagicArmor(1); 
                    System.out.println("Your opponent attacked while you defended. They lose a magic armor point."); 
                }
                else
                {
                two.subHealth(1);
                System.out.println("Your opponent attacked while you defended. You deal a point of damage."); 
                }
            }
            else if(command2 == "Heal")
            {
                two.addHealth(1); 
                System.out.println("Your opponent healed and gained a point of health."); 
            }
            else 
            {
                System.out.println("Both players defended. Nothing happens.");
            }
        }
        if(command1 == "Heal")
        {
            if(command2 == "Attack")
            {
                if(one.getArmor() > 0)
                {
                    one.subArmor(1); 
                    System.out.println("Your opponent tried to attack while you healed. You lose an armor point."); 
                }
                else 
                {
                    one.subHealth(2);
                    System.out.println("You tried to heal but your opponent attacked you. You lose 2 points of health.");
                }
            }
            else if(command2 == "Defend")
            {
                one.addHealth(1);
                System.out.println("Your opponent defended while you were healing. You gain a point of health.");
            }
            else if(command2 == "Spell")
            {
                if(one.getMagicArmor() > 0)
                {
                    one.subMagicArmor(1); 
                    System.out.println("Your opponent tried to cast a spell while you were healing. You lose a magic armor point."); 
                }
                else
                {
                    one.subHealth(2); 
                    System.out.println("You tried to heal but your opponent cast a spell on you. You lose 2 points of health.");
                }
            }
            else 
            {
                one.addHealth(1); 
                two.addHealth(1);
                System.out.println("Both players played heal. Both gain a point of health.");
            }
        }
        System.out.println("______________________________________________");
    }
}