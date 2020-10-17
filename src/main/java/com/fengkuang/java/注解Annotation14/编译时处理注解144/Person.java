package com.fengkuang.java.注解Annotation14.编译时处理注解144;
@Persistent(table = "person_inf")
public class Person {
    @Id(column = "person_id", type = "integer", generator = "identity")
    private int id;
    @Property(column = "person_name", type = "string")
    private String name;
    @Property(column = "person_age", type = "integer")
    private int age;
    //无参数的构造器
    public Person() {
    }
    //初始化全部成员变量的构造器
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // 下面省略所有成员变量的setter和getter方法
    //id的setter和getter方法
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    //name的setter和getter方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    //age的setter和getter方法
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
}