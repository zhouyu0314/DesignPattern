package com.adapter3;

public class Main {
    public static void main(String[] args) {


        //这是之前的版本
        OldVersion oldVersion = new OldVersion();
        oldVersion.say();//i am 1.0-version

        /*
        但是现在程序改动了，重新写了一个版本，但是有很多类还是引用的老版本。不方便在老版本上做改动
        只需要在引用的地方，执行如下操作
         */
        OldVersionTarget oldVersionTarget = new VersionAdapter();
        oldVersionTarget.say();//i am 2.0-version

    }
}
