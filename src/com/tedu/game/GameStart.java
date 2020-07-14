package com.tedu.game;

import com.tedu.controller.GameListener;
import com.tedu.controller.GameThread;
import com.tedu.show.GameJFrame;
import com.tedu.show.GameMainJPanel;

public class GameStart {

    /**
     * �����Ψһ���
     *
     * @param args
     */
    public static void main(String[] args) {
        GameJFrame gj = new GameJFrame();
        //ʵ������壬ע�뵽jframe��
        GameMainJPanel jp = new GameMainJPanel();
        //ʵ��������
        GameListener listener = new GameListener();
        //ʵ�������߳�
        GameThread th = new GameThread();

        gj.setjPanel(jp);
        gj.setKeyListener(listener);
        gj.setThread(th);

        gj.start();

    }

}
