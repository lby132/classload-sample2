package org.example;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {

    public static void main(String[] args) {
//        try {
//            new ByteBuddy().redefine(Moja.class)
//                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("/Users/lby/Downloads/project/classload-sample2/target/classes/"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(new Moja().pullOut());
    }
}
