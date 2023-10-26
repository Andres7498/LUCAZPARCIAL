package com.example;

import static spark.Spark.*;
    
public class LucazService {

    public static void main(String... args){
        LucazSequence lucazSequence = new LucazSequence();
        port(getPort());
        staticFileLocation("/");
        get("/lucazsequence", (req, res) -> {
            int value = Integer.parseInt(req.queryParams("value"));
            String sequence = lucazSequence.calculateSequence(value);
            String response = 	"{\n" +
            "\n" +
            " \"operation\": \"lucazsequence\",\n" +
            "\n" +
            " \"input\": \"" + value + "\",\n" +
            "\n" +
            " \"output\":  \"" + sequence + "\"\n" +
            "\n" +
            "}";
            return response;
        });
        get("hello", (req,res) -> "Hello Local!");
    }
    
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}
    
