package com.exam;

import com.exam.Cat;
import com.google.gson.Gson;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonSerializer {
    private String fileName = "cats.json";
    public JsonSerializer(String fileName) throws IOException {
        this.fileName = fileName;
    }

    public ArrayList<Cat> getCats() throws IOException, RuntimeException {
        Gson gson = new Gson();
        try(Reader reader = new FileReader(fileName)){
            Cat[] cats = gson.fromJson(reader,Cat[].class);
            List<Cat> catsList = Arrays.asList(cats);
            return new ArrayList<>(catsList);
        }
    }

    public void writeCats(List<Cat> cats) throws IOException {
        Gson gson = new Gson();
        try(Writer writer = new FileWriter(fileName)){
            String json = gson.toJson(cats);
            writer.write(json);
        }
    }
}
