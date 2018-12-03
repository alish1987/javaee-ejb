package service;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class CounterStateFullBean {
    public CounterStateFullBean() {
    }

    private Integer count = 0;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void addOneToCount() {
        this.count += 1;
    }
}
