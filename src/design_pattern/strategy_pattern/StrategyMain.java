package design_pattern.strategy_pattern;

import util.Util;

import java.util.Random;

import static design_pattern.strategy_pattern.SorterContext.MODE;


/**
 * 策略模式模型：
 * 一个算法功能，需要有某些具体同一类的行为结果， 抽象行为
 * 有一些具体的算法行为， 是对抽象行为的实现
 * 有一个算法控制环境，在初始化时指明算法类别，根据算法类别获取具体的算法行为
 * 将用户输入通过具体的算法行为进行处理
 *
 * 如此，用户只需要知道 算法控制环境及其提供的算法类别，不用再调用其它的类，降低使用复杂度
 */
public class StrategyMain {

    public static void main(String[] args){
        int[] arr = new int[20];
        Random rnd = new Random(0);
        for(int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(100);
        }

        Util.showArr(arr);
        SorterContext sorterContext = new SorterContext(MODE.SELECT);
        sorterContext.sort(arr);
        Util.showArr(arr);

    }
}
