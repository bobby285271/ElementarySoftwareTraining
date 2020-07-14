package com.tedu.element;

import javax.swing.*;
import java.awt.*;

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
     */

    private boolean left = false;
    private boolean up = false;
    private boolean right = false;
    private boolean down = false;

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
//                    this.setX(this.getX() - 10);
                    this.left = true;
                    break;
                case 38:
//                    this.setY(this.getY() - 10);
                    this.up = true;
                    break;
                case 39:
//                    this.setX(this.getX() + 10);
                    this.right = true;
                    break;
                case 40:
//                    this.setY(this.getY() + 10);
                    this.down = true;
                    break;
            }
//            System.out.println(this.getX() + ":" + this.getY());
        } else {
            switch (key) {
                case 37:
//                    this.setX(this.getX() - 10);
                    this.left = false;
                    break;
                case 38:
//                    this.setY(this.getY() - 10);
                    this.up = false;
                    break;
                case 39:
//                    this.setX(this.getX() + 10);
                    this.right = false;
                    break;
                case 40:
//                    this.setY(this.getY() + 10);
                    this.down = false;
                    break;
            }
        }

        if(this.left)
            this.setX(this.getX() - 10);
        if(this.up)
            this.setY(this.getY() - 10);
        if(this.right)
            this.setX(this.getX() + 10);
        if(this.down)
            this.setY(this.getY() + 10);

    }
}
