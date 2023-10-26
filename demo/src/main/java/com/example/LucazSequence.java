package com.example;
public class LucazSequence {

    public static String calculateSequence(int n) {
        int a = 2;
        int b = 1;
      
        StringBuilder lucasString = new StringBuilder();
      
        lucasString.append(a);
        lucasString.append(", ");
        lucasString.append(b);
      
        for (int i = 2; i <= n; i++) {
          int lucasTerm = a + b;
      
          lucasString.append(lucasTerm);
          lucasString.append(", ");
      
          a = b;
          b = lucasTerm;
        }
      
        lucasString.delete(lucasString.length() - 2, lucasString.length());
      
        return lucasString.toString();
      }
    }