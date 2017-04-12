package CreateType.Singleton;

import sun.org.mozilla.javascript.internal.Synchronizer;

/**
 * Created by flying on 2016/12/21.
 */

/**
 * 单例使用环境：
 * 1大家都使用这些数据（包括配置文件）。没必要为了每次取这些数据都创建对象
 */
/**要点：
 * 1、该类只能有一个实例
 * 2、必须自行创建整个实例
 * 2、必须自行向整个系统提供这个实例
 */
public class SingleTon {
    private  static int count;
    private static String record;
    private static SingleTon singleTon;

    private SingleTon(){
        init();     //初始化单例中的一些数据资源
    }
    private void init(){
        count = 15;
        record = "good";
    }

    /**
     * 懒加载模式，当init()中的初始化内容非常多的时候，第一次的初始化尚未完成，第二次调用
     * 会返回对象，则会出现半个对象的情况
     * @return
     */
    public synchronized static SingleTon getInstance(){
        if (singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }

    public void getString(){
        System.out.println("count="+count+ "\trecord="+record);
    }
}

