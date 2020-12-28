package me.ixk.design_pattern.bridge;

/**
 * 加盐类型
 *
 * @author Otstar Lin
 * @date 2020/12/27 下午 4:00
 */
public class SaltCookieType implements CookieType {

    @Override
    public String getType() {
        return "加盐";
    }
}
