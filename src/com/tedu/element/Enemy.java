package com.tedu.element;

import com.tedu.manager.GameLoad;

import javax.swing.*;
import java.awt.*;

public class Enemy extends ElementObj {
    /**
     * @param x    ���Ͻ�x����
     * @param y    ���Ͻ�y����
     * @param w    w���
     * @param h    h�߶�
     * @param icon ͼƬ
     * @˵�����������Ĺ��췽�������������ഫ�����ݵ�����
     */
    public Enemy(int x, int y, int w, int h, ImageIcon icon) {
        super(x, y, w, h, icon);
    }

    private boolean left = true;
    private boolean up = false;
    private boolean right = false;
    private boolean down = false;
    private String fx = "left";

    @Override
    public void showElement(Graphics g) {
        g.drawImage(this.getIcon().getImage(), this.getX(), this.getY(), this.getW(), this.getH(), null);
    }

    @Override
    public void move() {
        if (this.left) {
            this.setX(this.getX() - 10);
            if (this.getX() < 100) {
                this.left = false;
                this.right = true;
                this.fx = "right";
            }
        }
        if (this.right)
            this.setX(this.getX() + 10);
        if (this.getX() > 300) {
            this.left = true;
            this.right = false;
            this.fx = "left";
        }
    }

    @Override
    protected void updateImage() {
        this.setIcon(GameLoad.imgMap.get(fx));
    }

    @Override
    protected void add(long gameTime) {

    }
}
