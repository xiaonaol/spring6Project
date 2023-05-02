package com.xiaonaol.ditest;

//员工类
public class Empolyee {
    //员工属于某个部门
    private Department department;
    private String ename;

    public void work() {
        System.out.println(ename + "are working..." + age);
        department.info();
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;
}
