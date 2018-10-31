package main.java.cc.baijunyu;

import main.java.cc.baijunyu.dynamicproxy.DynamicProxy;
import main.java.cc.baijunyu.protectproxy.MatchService;
import main.java.cc.baijunyu.staticproxy.ILawsuit;
import main.java.cc.baijunyu.staticproxy.Lawyer;
import main.java.cc.baijunyu.staticproxy.XiaoHui;
import main.java.cc.baijunyu.staticproxy.XiaoMing;

import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        //静态代理
        XiaoMing xiaoMing = new XiaoMing();
        Lawyer xiaominglawyer = new Lawyer(xiaoMing);
        xiaominglawyer.submit();
        xiaominglawyer.burden();
        xiaominglawyer.defend();
        xiaominglawyer.finish();
        XiaoHui xiaoHui = new XiaoHui();
        Lawyer xiaohuilawyer = new Lawyer(xiaoHui);
        xiaohuilawyer.submit();
        xiaohuilawyer.burden();
        xiaohuilawyer.defend();
        xiaohuilawyer.finish();
        //动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(xiaoMing);
        ClassLoader classLoader = xiaoMing.getClass().getClassLoader();
        ILawsuit lawyer=(ILawsuit)Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, dynamicProxy);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();

        MatchService matchService = new MatchService();
    }
}
