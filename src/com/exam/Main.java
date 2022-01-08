package com.exam;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        JsonSerializer jsonSerializer = new JsonSerializer("cats.json");
        List<Cat> cats = jsonSerializer.getCats();
    }
}
