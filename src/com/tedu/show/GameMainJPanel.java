package com.tedu.show;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

import com.tedu.manager.ElementManager;

/**
 * @author Rui
 * @˵�� ��Ϸ����Ҫ���
 * @����˵�� ��Ҫ����Ԫ�ص���ʾ��ͬʱ���н����ˢ�£����̣߳�
 * java��������˼�����̳л�ӿ�ʵ��
 */
public class GameMainJPanel extends JPanel {
    //����������
    private ElementManager em;

    public GameMainJPanel() {
        init();
    }

    public void init() {
        em = ElementManager.getManager();//�õ�Ԫ�ع���������
    }

    @Override//���ڻ滭 Graphics ����
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(255, 0, 0));
        g.setFont(new Font("΢���ź�", Font.BOLD, 48));
        //һ��Ҫ�ڻ滭֮ǰ����������ʽ
        g.drawString("i love curry", 200, 200);

        g.fillOval(300, 300, 100, 100);//Բ
        g.drawOval(400, 400, 100, 200);//ԲȦ

    }

}
