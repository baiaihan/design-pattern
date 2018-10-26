package main.java.cc.baijunyu.staticproxy;

public class XiaoMing implements ILawsuit {
    @Override
    public void submit() {
        //
        System.out.println("老板拖欠小明工资，特此申请仲裁！");
    }

    @Override
    public void burden() {
        System.out.println("这是合同书和过去一年的工资流水！");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿不需要再说什么");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功，判决7日内结清工资");
    }
}
