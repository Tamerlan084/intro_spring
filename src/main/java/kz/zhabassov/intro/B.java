package kz.zhabassov.intro;

import java.util.ArrayList;
import java.util.List;

public class B implements Interface{
    private String className = null;
    private String parentBeanName = null;
    private List<Interface> childBeans = new ArrayList<>();
    @Override
    public void printInfo() {
        System.out.println(className + parentBeanName);
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void setParentBeanName(String parentBeanName) {
        this.parentBeanName = parentBeanName;
    }

    @Override
    public List<Interface>  getChildBeans() {
        return childBeans;
    }

    @Override
    public List<Logger> getLoggers() {
        return null;
    }
}
