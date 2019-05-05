/*public class Missile extends Sprite {

    private final int BOARD_WIDTH = 390;				// край доски до которой долетает ракета (может не совпадать с фактическим значением)
    private final int MISSILE_SPEED = 5;				// длина которую пройдет снаряд за некоторое время n 

    public Missile(int x, int y) {						// для начальных координат ракеты
        super(x, y);
        
        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("src/missile.png");  					// загрузка изображения
        getImageDimensions();							// получение его размеров
     //   System.out.println(width);
    }

    public void move() {								//
        
        x += MISSILE_SPEED;								// для смещения ракеты за некоторое время n на величину MISSILE_SPEED
        												
        if (x > BOARD_WIDTH) {							// когда достигнет края 
            visible = false;							// ракеты не должны быть видны
        }
    }
}

*/


public class Missile extends Sprite {

    private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 5;

    public Missile(int x, int y) {
        super(x, y);

        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("src/missile.png");
        getImageDimensions();        
    }

    public void move() {
        
        x += MISSILE_SPEED;
        
        if (x > BOARD_WIDTH)
            visible = false;
    }
}