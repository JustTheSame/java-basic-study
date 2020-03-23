package com.lance.study.apache;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhaotian
 */
public class CommonLang3 {
    public static void main(String[] args) {
        String ori = "It doesn't matter what they call you. It's the deeds that make the man.";
//        System.out.println(StringUtils.abbreviate("apple", 20));
//        System.out.println(StringUtils.abbreviate(ori, 10));

        System.out.println(StringUtils.appendIfMissing("apple"," pie"));
        System.out.println(StringUtils.appendIfMissing("apple","le"));
    }
}
