


import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;

    public Sprite(int x, int y) {					// для задания начальных координат объекту
    		
        this.x = x;									//
        this.y = y;									//
        visible = true;								// логическая переменная для отображения выпущенных ракет
    }

    protected void loadImage(String imageName) {	//для инициализации изображения картинки

        ImageIcon ii = new ImageIcon(imageName);	
        image = ii.getImage();
    }
    
    protected void getImageDimensions() {			// получение размеров загруженного объект

        width = image.getWidth(null);				// возращает ссылку на следующий загруженный объект ????
        height = image.getHeight(null);
    }    

    public Image getImage() {						// возращает картинку 
        return image;
    }

    public int getX() {								// возращает x
        return x;
    }

    public int getY() {								// возращает y
        return y;
    }

    public boolean isVisible() {					// возращает логическое значение видна ли ракета (выпущена) или нет
        return visible;
    }

    public void setVisible(Boolean visible) {		// устанавливает требуемое  логическое значение для ракета выпущена/или нет 
        this.visible = visible;
    }
}
