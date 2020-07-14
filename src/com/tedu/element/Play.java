package com.tedu.element;

import com.tedu.manager.GameLoad;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Play extends ElementObj {

    /**
     * �ƶ����ԣ�
     * 1.������ ��� ����ö������ʹ�� һ��ֻ���ƶ�һ������
     * 2.˫���� ���� �� ���� ���booleanֵʹ�� ���磺true������ false������
     * ��Ҫ����һ��������ȷ���Ƿ��·����
     * Լ�� 0������ 1�������� 2��������
     * 3.������ �������Ҷ����� boolean���ʹ�� true�����ƶ� false�����ƶ�
     * ͬʱ���Ϻ��£��󰴵Ļ������Ȱ���
     * ˵������״̬����ʹ��Map<����,boolean>��set<�ж�����>�ж���������ʱ��
     *
     * @���� 1.ͼƬҪ��ȡ���ڴ��У������� ��ʱ����ʽ���ֶ���д�洢���ڴ���
     * 2.ʲôʱ������޸�ͼƬ����ΪͼƬ���ڸ����е����Դ洢��
     * 3.ͼƬӦ��ʹ��ʲô���Ͻ��д洢
     */

    private boolean left = false;
    private boolean up = false;
    private boolean right = false;
    private boolean down = false;

    //ͼƬ���� ʹ��map�����д洢
    private Map<String, ImageIcon> imgMap;
    //����ר��������¼��ǰ�ķ���Ĭ��up
    private String fx = "up";

    public Play(int x, int y, int w, int h, ImageIcon icon) {
        super(x, y, w, h, icon);

    }

    @Override
    public void showElement(Graphics g) {
        g.drawImage(this.getIcon().getImage(), this.getX(), this.getY(), this.getW(), this.getH(), null);
    }

    //��д����
    @Override   //�������Ϊ����߷�������������ӵ�ע��
    public void keyClick(boolean bl, int key) {
        if (bl) {
            switch (key) {
                case 37:
                    this.left = true;
                    this.right = false;
                    this.up = false;
                    this.down = false;
                    this.fx = "left";
                    break;
                case 38:
                    this.up = true;
                    this.down = false;
                    this.left = false;
                    this.right = false;
                    this.fx = "up";
                    break;
                case 39:
                    this.right = true;
                    this.left = false;
                    this.up = false;
                    this.down = false;
                    this.fx = "right";
                    break;
                case 40:
                    this.down = true;
                    this.up = false;
                    this.left = false;
                    this.right = false;
                    this.fx = "down";
                    break;
            }
        } else {
            switch (key) {
                case 37:
                    this.left = false;
                    break;
                case 38:
                    this.up = false;
                    break;
                case 39:
                    this.right = false;
                    break;
                case 40:
                    this.down = false;
                    break;
            }
        }
    }

    @Override
    public void move() {
        if (this.left && this.getX() > 0)
            this.setX(this.getX() - 10);
        if (this.up && this.getY() > 0)
            this.setY(this.getY() - 10);
        if (this.right && this.getX() < 600 - this.getW())
            this.setX(this.getX() + 10);
        if (this.down && this.getY() < 400 - this.getH())
            this.setY(this.getY() + 10);
    }

    @Override
    protected void updateImage() {
        this.setIcon(GameLoad.imgMap.get(fx));
    }
}
