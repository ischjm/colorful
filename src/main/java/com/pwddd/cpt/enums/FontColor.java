package com.pwddd.cpt.enums;

public enum FontColor {
    BLACK("黑色","30"),
    RED("红色","31"),
    GREEN("绿色","32"),
    YELLOW("黄色","33"),
    BLUE("蓝色","34"),
    PURPLE("紫色","35"),
    CYAN("青蓝色","36"),
    WHITE("白色","37");

    private final String value;
    private final String name;

    FontColor(String name, String value) {
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
