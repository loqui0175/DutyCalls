package dutycalls;

public abstract class Character{
    protected String name;
    protected int maxHealth;
    protected int currentHealth;
    protected int attackPower;
    protected int mana;


    public Character(String name, int maxHealth, int attackPower) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth; // Initialize currentHealth to maxHealth
        this.attackPower = attackPower;
    }

    public abstract void attack(Character player);

    public String getName() {
        return name;
    }

    public int getHealth() {
        return Math.max(currentHealth, 0); // Ensure it returns 0 if health goes below
    }

    public void receiveDamage(int damage) {
        currentHealth -= damage;
        currentHealth = Math.max(currentHealth, 0); // Ensure health does not go below zero
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    void attack(Enemy enemy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
