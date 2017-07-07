package edu.design.patterns.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData() {
        empList.add("John");
        empList.add("David");
        empList.add("Joe");
        empList.add("Steven");
        empList.add("Luisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ArrayList<String> temp = new ArrayList<>();
        temp.addAll(this.getEmpList());
        return new Employees(temp);
    }
}
