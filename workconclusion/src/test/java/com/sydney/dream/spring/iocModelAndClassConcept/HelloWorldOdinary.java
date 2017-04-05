package com.sydney.dream.spring.iocModelAndClassConcept;

/**
 * Created by Sydney on 2017/3/31.
 * 普通的java 类 （类的一些基本概念。）
 *
 * 概述：
 * 类是一系列具有相同属性和行为方式的对象的集合
 * 类包含类名以及类体，一个经典的类可以概括为如下：
 * class ClassNmae{}
 * 花括号里面表示的是类体，类体包含属性和行为。也可以称为类变量和类的方法。
 * 如下：
 * class ClassName
 * {
 *     int hello="hello,world!";
 *     void sayHello(){};
 * }
 *
 *  关于类的注意点
 * 1,一个类文件中中只可以有一个public 的类，如下所示
 * 2,并且，public 的类的类名，则文件的名字必须和public 修饰的类，类名完全一致。。
 * 3，如果类中没有public 的类，则文件名可以为任何形式的合法名字。
 * 3,类的默认修饰符有public private protected 和默认的没有添加的情况（在比如C++上，
 *   通常称为friendly 修饰符）以及final，abstract(类的修饰符，分为访问权限修饰符和非访问权限修饰符)
 * 4,类的成员修饰符，public private protected 和默认的，以及final(常量)，static，volatile，transient
 *   {注意，后面需要分析volatile，transient  这两个变量}
 * 5,类的成员方法的修饰符，public private protected 和默认的，以及 final static ,synchronize, native
 *   {注意，后面需要分析synchronize 和native 两个变量}
 *
 * 以下：写到关于类的一些概念，
 * 即，
 * 1，类的初始化以及初始化顺序，类的构造函数，方法的重载，方法的覆盖，类的加载流程
 * 2，类的封装
 * 3，类的抽象
 * 4，类的继承
 * 5，类的多态
 * 6，接口
 * 7，内部类
 * 8，类的加载机制
 *
 */

public class HelloWorldOdinary {
    String greeting = "hello world!";
    public HelloWorldOdinary(){};
    public void sayHello(){
        System.out.print(this.greeting);
    }

    public static void main(String []args){
        new HelloWorldOdinary().sayHello();
    }
}


//public class HelloworldTest{}   这里的定义将会报错。
class Dog{
    private int size;
    public String color;
    protected double hair;
    boolean hot;

    public Dog() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHair() {
        return hair;
    }

    public void setHair(double hair) {
        this.hair = hair;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }
}

