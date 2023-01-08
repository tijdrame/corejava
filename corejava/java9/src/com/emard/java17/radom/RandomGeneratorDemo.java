package com.emard.java17.radom;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        //RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus")
                .create(888);
        System.out.println(randomGenerator.getClass());
        //pour avoir tous les algos
        RandomGeneratorFactory.all().map(f->f.group()+":"+f.name())
                .sorted().forEach(System.out::println);
        int i = 0;
        while (i<=10){
            int num = randomGenerator.nextInt(20);
            System.out.println(num);
            i++;
        }
    }
}
