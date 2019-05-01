public class Missile extends Sprite {

    private final int BOARD_WIDTH = 390;				// ���� ����� �� ������� �������� ������ (����� �� ��������� � ����������� ���������)
    private final int MISSILE_SPEED = 2;				// ����� ������� ������� ������ �� ��������� ����� n 

    public Missile(int x, int y) {						// ��� ��������� ��������� ������
        super(x, y);
        
        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("src/missile.png");  					// �������� �����������
        getImageDimensions();							// ��������� ��� ��������
     //   System.out.println(width);
    }

    public void move() {								//
        
        x += MISSILE_SPEED;								// ��� �������� ������ �� ��������� ����� n �� �������� MISSILE_SPEED
        												
        if (x > BOARD_WIDTH) {							// ����� ��������� ���� 
            visible = false;							// ������ �� ������ ���� �����
        }
    }
}