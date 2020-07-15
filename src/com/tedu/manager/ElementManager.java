package com.tedu.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tedu.element.ElementObj;

/**
 * @author Magic Gunner
 * @˵�� ������Ԫ�ع�������ר�Ŵ洢����Ԫ�أ�ͬʱ�ṩ����
 * ������ͼ�Ϳ��ƻ�ȡ����
 * @����һ���洢����Ԫ�����ݣ���ô��ţ�list map set 3�󼯺�
 * @�����������������ͼ�Ϳ���Ҫ���ʣ�����������ֻ��һ����������ģʽ
 */
public class ElementManager {

    /*
     * String ��Ϊkeyƥ�����е�Ԫ�� play-> List<Object>
     * 						  enemy->List<Object>
     * ö������ ����map��key �������ֲ�һ������Դ�����ڻ�ȡ��Դ
     * List��Ԫ�صķ���Ӧ����Ԫ�ػ���
     * ����Ԫ�ض����Դ�ŵ�map������
     */
    private Map<GameElement, List<ElementObj>> gameElements;

    public Map<GameElement, List<ElementObj>> getGameElements() {
        return gameElements;
    }

    //���Ԫ��
    public void addElement(ElementObj obj, GameElement ge) {
        //��Ӷ��󵽼����У���keyֵ���д洢
        gameElements.get(ge).add(obj);
    }

    //����key����list���ϣ�ȡ��ĳһ��Ԫ��
    public List<ElementObj> getElementsByKey(GameElement ge) {
        return gameElements.get(ge);
    }

    /**
     * ����ģʽ���ڴ�������ֻ��һ��ʵ��
     * ��д��ʽ��
     * 1. ��Ҫһ����̬���ԣ�����һ������������������
     * 2. �ṩһ����̬�������������ʵ����return ����������
     * 3. һ��Ϊ��ֹ�������Լ�ʹ�ã�˽�л����췽��
     * ElementManager em=new ElementManager();
     */
    private static ElementManager EM = null;//����

    public static synchronized ElementManager getManager() {
        //synchronized�߳�����֤������ִ����ֻ��һ���߳�
        if (EM == null) {//��ֵ�ж�
            EM = new ElementManager();
        }
        return EM;
    }

    public ElementManager() {//���췽��˽�л�
        init();//ʵ��������
    }

    /**
     * ��������Ϊ�������ܳ��ֵĹ�����չ����дinit����׼���ġ�
     */
    public void init() {//ʵ����
        gameElements = new HashMap<GameElement, List<ElementObj>>();
        //��ÿ��Ԫ�ؼ��϶����뵽map��
//        gameElements.put(GameElement.PLAY, new ArrayList<ElementObj>());
//        gameElements.put(GameElement.MAPS, new ArrayList<ElementObj>());
//        gameElements.put(GameElement.ENEMY, new ArrayList<ElementObj>());
//        gameElements.put(GameElement.BOSS, new ArrayList<ElementObj>());
        for (GameElement ge :
                GameElement.values()) {
            gameElements.put(ge, new ArrayList<ElementObj>());
        }
        //���ߣ��ӵ�����ըЧ��������Ч��etc
    }
}
