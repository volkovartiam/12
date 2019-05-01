import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprite {

    private int dx;								// на эту величину будет смещаться корабль при нажатии кнопок
    private int dy;
    private List<Missile> missiles;				// лист связный список для отображения n-го количества ракет

    public SpaceShip(int x, int y) {			// также для установки начального положения корабля
        super(x, y);
        
        initSpaceShip();
    }

    private void initSpaceShip() {

        missiles = new ArrayList<>();			// автоматически увеличивающийся массив (что происходит с ним когда ракеты становятся не видны)
        
        loadImage("src/craft.png"); 			// загрузка изображения корабля и его параметров
        getImageDimensions();					//
    }

    public void move() {						// для движения ракеты метод
        x += dx;
        y += dy;
    }

    public List<Missile> getMissiles() {		// геттер возращает список всех ракет
        return missiles;
    }

    public void keyPressed(KeyEvent e) {		// метод определяет нажатие кнопки и устанавливает соответственные приращения

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {			// при нажатии пробела вызывается метод fire
            fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    public void fire() {
        missiles.add(new Missile(x + width, y + height / 2));		// в лист ракет добавляется новая ракета 
    }																// появляется с правого края корабля x + width
    																//                           по середине y + height / 2

    public void keyReleased(KeyEvent e) {							// для того чтобы корабль стоял на месте при отсутствия 
    																// один из 3-х типов клавиатурных событий pressed / released / typed из класса KeyEvent
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}