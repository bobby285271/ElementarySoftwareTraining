package com.tedu.show;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.*;

import com.tedu.element.ElementObj;
import com.tedu.element.Play;
import com.tedu.manager.ElementManager;
import com.tedu.manager.GameElement;

/**
 * @author Magic Gunner
 * @˵�� ��Ϸ����Ҫ���
 * @����˵�� ��Ҫ����Ԫ�ص���ʾ��ͬʱ���н����ˢ�£����̣߳�
 * java��������˼�����̳л�ӿ�ʵ��
 */
public class GameMainJPanel extends JPanel {
    //����������
    private ElementManager em;

    public GameMainJPanel() {
        init();
        // ���´���������д
        load();
    }

    private void load() {
        ImageIcon icon = new ImageIcon("image/test.jpg");
        //ʵ��������
        ElementObj obj = new Play(100, 100, 100, 100, icon);
        //��������뵽Ԫ�ع�������
        em.addElement(obj, GameElement.PLAY);
    }

    public void init() {
        em = ElementManager.getManager();//�õ�Ԫ�ع���������
    }

    @Override//���ڻ滭 Graphics ����
    public void paint(Graphics g) {
        super.paint(g);
        Map<GameElement, List<ElementObj>> all = em.getGameElements();
        Set<GameElement> set = all.keySet();
        for (GameElement ge : set) {
            List<ElementObj> list = all.get(ge);
            for (int i = 0; i < list.size(); i++) {
                ElementObj obj = list.get(i);
                //����ÿ�����Լ���show��������Լ�����ʾ
                obj.showElement(g);
            }
        }
    }

}
