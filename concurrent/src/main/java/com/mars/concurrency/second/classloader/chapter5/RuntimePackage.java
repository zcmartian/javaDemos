package com.mars.concurrency.second.classloader.chapter5;

/***************************************
 * @author:Alex Wang
 * @Date:2017/4/4 QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public class RuntimePackage {
    //RuntimePackage
    //com.mars.concurrent.classloader.chapter5
    //Boot.Ext.App.com.mars.concurrent.classloader.chapter5

    //Boot.Ext.App.com.mars.concurrent.classloader.chapter5.SimpleClassLoaderTest
    //Boot.Ext.App.SimpleClassLoader.com.mars.concurrent.classloader.chapter5.SimpleClassLoaderTest

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        SimpleClassLoader simpleClassLoader = new SimpleClassLoader();
        Class<?> aClass = simpleClassLoader.loadClass("com.mars.concurrent.classloader.chapter5.SimpleObject");
        //sSystem.out.println(aClass.getClassLoader());
        SimpleObject simpleObject = (SimpleObject) aClass.newInstance();
    }
}
