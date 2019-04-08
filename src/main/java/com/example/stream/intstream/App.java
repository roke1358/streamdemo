package com.example.stream.intstream;

import java.io.IOException;
import java.util.stream.IntStream;

public class App {
  public static void main(String[] args) throws IOException {

    IntStream.range(1, 10).forEach(System.out::print);
  }
}
