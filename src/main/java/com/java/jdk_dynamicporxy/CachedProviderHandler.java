package com.java.jdk_dynamicporxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CachedProviderHandler implements InvocationHandler{

    private Map<String, Object> cached = new HashMap<String, Object>();
    private Object target;

    public CachedProviderHandler(Object target) {
        this.target = target;
    }

    /**
     * invoke方法可以处理target的所有方法，这里用if判断只处理了getXXX()方法，增加了缓存功能。
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("使用动态代理了！");
        Class<?>[] types = method.getParameterTypes();
        if(method.getName().matches("get.+") && types.length == 1 && types[0] == String.class) {
            System.out.println("getXXX()方法，使用缓存");
            String key = (String)args[0];
            Object value = cached.get(key);
            if(value == null) {
                value = method.invoke(target, args);
                cached.put(key, value);
            }
            return value;
        }
        return method.invoke(target, args);
    }

}