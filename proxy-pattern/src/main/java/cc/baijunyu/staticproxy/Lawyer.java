package main.java.cc.baijunyu.staticproxy;

public class Lawyer implements ILawsuit {

    private ILawsuit mLawyersuit;

    public Lawyer(ILawsuit mLawyersuit) {
        this.mLawyersuit = mLawyersuit;
    }
    @Override
    public void submit() {
        mLawyersuit.submit();
    }

    @Override
    public void burden() {
        mLawyersuit.burden();
    }

    @Override
    public void defend() {
        mLawyersuit.defend();
    }

    @Override
    public void finish() {
        mLawyersuit.finish();
    }
}
