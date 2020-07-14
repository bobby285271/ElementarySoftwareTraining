package com.tedu.element;

import javax.swing.*;
import java.awt.*;

/**
 * @author Magic Gunner
 * @˵�� ����Ԫ�صĻ���
 */
public abstract class ElementObj {
    private int x;
    private int y;
    private int w;
    private int h;
    private ImageIcon icon;

    public void ElementObj() {

    }

    /**
     * @param x    ���Ͻ�x����
     * @param y    ���Ͻ�y����
     * @param w    w���
     * @param h    h�߶�
     * @param icon ͼƬ
     * @˵�����������Ĺ��췽�������������ഫ�����ݵ�����
     */
    public ElementObj(int x, int y, int w, int h, ImageIcon icon) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.icon = icon;
    }

    /**
     * ���󷽷�����ʾԪ��
     *
     * @param g ���� ���ڽ��л滭
     */
    public abstract void showElement(Graphics g);

    /**
     * ʹ�ø��ඨ����ռ����¼��ķ���
     * ֻ����Ҫʵ�ּ��̼��������࣬��д���������Լ����
     * ʹ�ýӿڵķ�ʽ��Ҫ�ڼ������������ת��
     * Լ�������� ���ڴ󲿷�java��ܶ���Ҫ���ã�Լ����������
     *
     * @param bl  ��������� true������ false�����ɿ�
     * @param key ���������̵�codeֵ
     * @��չ �������Ƿ���Է�Ϊ����������һ�����հ���һ�������ɿ�����չ
     */
    public void keyClick(boolean bl, int key) {
        //�����������ǿ�Ʊ���ʵ�ֵ�

    }

    /**
     * ֻҪ��VO���ҪΪ��������get��set����
     */
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
}
