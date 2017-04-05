package com.sydney.dream.spring.iocModelAndClassConcept;

/**
 * Created by Sydney on 2017/3/30.
 * 接口：interface
 * 通常可以理解为基于行为的抽象，里面放一些公用的常用方法以及常量
 *  接口中可以含有变量和方法，
 * 变量，会被默认的定义为public static final，不可以用private 修饰,也不可以用protected 修饰，
 * 另外，既然是private 的变量，则必须初始化，
 * 方法，会被默认的定义为public，不可以加private,static,final,protected这样的modifier(修饰符)
 * 另外接口可以继承于另一个接口，
 * 接口谈不上实现另一个接口implements,首先，接口不可以当成类来看，其次，如果实现了方法，那就
 * 与接口的定义相违背了。
 */
/*public interface HelloWorldInterface extends HelloWorldInterfaceParent {
    //int a;  a wrong example
    int a=0; // 不建议这样写，既然final 是全量的。
    int PLUG_ON=0;//建议写成这样，这样可以避免像魔鬼数字这样不规范的代码
    //protected int PLUG_OFF=3;   a wrong example
    void sayHello();
}*/
public interface HelloWorldInterface {
    //int a;  a wrong example
    int a=0; // 不建议这样写，既然final 是全量的。
    int PLUG_ON=0;//建议写成这样，这样可以避免像魔鬼数字这样不规范的代码
    //protected int PLUG_OFF=3;   a wrong example
    void sayHello();
}

