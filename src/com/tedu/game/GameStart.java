package com.tedu.game;

import com.tedu.show.GameJFrame;
import com.tedu.show.GameMainJPanel;

public class GameStart {

	/**
	 * �����Ψһ���
	 * @param args
	 */
	public static void main(String[] args) {
		GameJFrame gj=new GameJFrame();
		/**ʵ������壬ע�뵽jframe��**/
		GameMainJPanel jp=new GameMainJPanel();
		
		gj.setjPanel(jp);
		gj.start();

	}

}
