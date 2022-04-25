package com.pwddd.cpt.enums;

public enum BGColor {
    BLACK("黑色","40"),
    RED("红色","41"),
    GREEN("绿色","42"),
    YELLOW("黄色","43"),
    BLUE("蓝色","44"),
    PURPLE("紫色","45"),
    CYAN("青蓝色","46"),
    WHITE("白色","47");

    private final String value;
    private final String name;

    BGColor(String name,String value) {
        this.name = name;
        this.value = value;

    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
