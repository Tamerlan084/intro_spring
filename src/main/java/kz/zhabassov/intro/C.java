package kz.zhabassov.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

public class C implements Interface{
    private String className = null;
    private String parentBeanName = null;
    @Autowired
    @Qualifier("childBeansC")
    private List<Interface> childBeans = new ArrayList<>();
    @Autowired
    @LoggerAnnotation
    private List<Logger> loggers = new ArrayList<>();
    @Override
    public void printInfo() {
        System.out.println(className + parentBeanName);
        for (Interface childBean: getChildBeans()) {
            childBean.printInfo();
        }
        for (Logger logger:loggers) {
            logger.log(className);
        }
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
        return loggers;
    }
}
