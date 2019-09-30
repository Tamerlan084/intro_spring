package kz.zhabassov.intro;

import java.util.List;

public interface Interface {
    void printInfo();
    void setClassName(String className);
    void setParentBeanName(String parentBeanName);
    List<Interface> getChildBeans();
    List<Logger> getLoggers();
}
