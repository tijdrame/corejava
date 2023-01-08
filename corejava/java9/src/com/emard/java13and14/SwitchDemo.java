package com.emard.java13and14;

public class SwitchDemo {
    public static void main(String[] args) {
        int key = 2;
        String result = switch (key){
            case 1: {
                yield "Choice 1";
            }
            default:
                yield "Unpected value: "+key;
                //throw new IllegalArgumentException("Unpected value: "+key);
        };
        System.out.println(result);
        int choice = 2;
        String response = switch (choice){
            case 1 -> {
                yield "You have zero balance";
            }
            case 2 -> {
                yield "You can get loan";
            }
            case 3 -> {
                yield "Are you sure you have money";
            }
            default -> throw new IllegalArgumentException("Unpected value: "+key);
        };
        System.out.println(response);
    }
}
