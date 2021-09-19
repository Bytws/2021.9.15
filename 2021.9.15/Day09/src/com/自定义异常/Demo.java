package com.自定义异常;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String username = "itheima";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要注册的用户名:");
        String name = sc.next();

        if(username.equals(name)){
            //产生注册异常
            throw new RegisterException("亲，该用户名已经被注册");
        }else {
            System.out.println("恭喜你注册成功");
        }
    }
}
