package com.tedu.game;

import com.tedu.controller.GameListener;
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
        /**ʵ������壬ע�뵽jframe��**/
        GameMainJPanel jp = new GameMainJPanel();
        GameListener listener = new GameListener();


        gj.setjPanel(jp);
        gj.setKeyListener(listener);

        gj.start();

    }

}
