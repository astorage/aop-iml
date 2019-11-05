# aop-iml

AOP实现方式

1、代理模式

2、aspectj
  aspectj需要ajc编译器，aspectjtools.jar。
  依赖
  
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjrt</artifactId>
        <version>1.9.4</version>
    </dependency>
  

3、jdk-动态代理

4、cglib-动态代理
   依赖
   
    <dependency>
        <groupId>cglib</groupId>
        <artifactId>cglib</artifactId>
        <version>3.3.0</version>
    </dependency>
