package com.pwddd.cpt;

import com.pwddd.cpt.enums.BGColor;
import com.pwddd.cpt.enums.FontColor;
import com.pwddd.cpt.enums.FontType;


public class Colorful {

    private static final String PREFIX = "\033[";
    private static final String SUFFIX = "\033[0m";
    private static final String SPLIT_M = "m";
    private static final String SPLIT = ";";

    /**
     * 为指定文本设置字体颜色。背景色和样式默认。
     * @param context 文字内容
     * @param fontColor 字体颜色
     * @return 格式化之后的字符串
     */
    public static String format(String context, FontColor fontColor){
        return PREFIX + fontColor.getValue() + SPLIT_M + context + SUFFIX;
    }

    /**
     * 使用全部样式
     * @param context 文字内容
     * @param fontColor 字体颜色
     * @param bgColor 背景颜色
     * @param fontType 字体类型
     * @return 格式化结果
     */
    public static String format(String context, FontColor fontColor, BGColor bgColor, FontType fontType){
        return PREFIX + fontType.getValue() + SPLIT + fontColor.getValue() + SPLIT + bgColor.getValue() + SPLIT_M + context + SUFFIX;

    }

    /**
     * 添加字体和样式
     * @param context 文字内容
     * @param fontColor 字体颜色
     * @param fontType 字体类型
     * @return 格式化结果
     */
    public static String format(String context, FontColor fontColor,FontType fontType){
        return PREFIX + fontType.getValue() + SPLIT + fontColor.getValue() + SPLIT_M + context + SUFFIX;
    }


    public static void main(String[] args) {
        System.out.println(Colorful.format("hello Wolrd", FontColor.CYAN, FontType.HIGH_LIGHT));
    }

}
