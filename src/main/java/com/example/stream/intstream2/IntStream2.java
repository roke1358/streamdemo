package com.example.stream.intstream2;

import java.io.IOException;
import java.util.stream.IntStream;

public class IntStream2 {
  public static void main(String[] args) throws IOException {

    IntStream.range(1, 10).skip(5).forEach(System.out::print);
  }
}
