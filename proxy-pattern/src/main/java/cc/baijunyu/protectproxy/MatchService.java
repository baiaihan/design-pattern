package main.java.cc.baijunyu.protectproxy;

import java.lang.reflect.Proxy;

public class MatchService {
    public MatchService() {
        PersonBean joe = getPersonInfo("", "", "");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        System.out.println("Interets is " + ownerProxy.getInterests());
        ownerProxy.setInterests("吃羊肉串");
        System.out.println("Interets are " + ownerProxy.getInterests());
        ownerProxy.setHotOrNotRating(50);
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        System.out.println("--------------------------------- ");
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        System.out.println("Interets is " + nonOwnerProxy.getInterests());
        ownerProxy.setInterests("吃羊肉串");
        System.out.println("Interets are " + nonOwnerProxy.getInterests());
        ownerProxy.setHotOrNotRating(50);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    private PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }

    private PersonBean getPersonInfo(String name, String gender, String interests) {
        PersonBeanImpl personBean = new PersonBeanImpl();
        personBean.setName(name);
        personBean.setGender(gender);
        personBean.setInterests(interests);
        return personBean;
    }


}
