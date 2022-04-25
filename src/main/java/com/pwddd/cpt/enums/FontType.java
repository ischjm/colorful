package com.pwddd.cpt.enums;

public enum FontType {

    DEFAULT("默认","0"),
    HIGH_LIGHT("高亮","1"),
    UNDERLINE("下划线","4"),
    FLASHING("闪烁","5"),
    REVERSE("反色","7"),
    HIDDEN("消失","8");

    private final String name;
    private final String value;

    FontType(String name,String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
