package com.example.stream.streamof;

import java.util.Arrays;

public class streamof2 {

  public static void main(String[] args) {
    String[] names = {
      "AAA", "BBB", "CCC", "DDD", "EEE", "EAB", "EKG", "HHH", "III", "XXX", "PPP", "SSS", "ZZZ"
    };
    Arrays.stream(names)
        .filter(x -> x.startsWith("E"))
        .sorted()
        .forEach(System.out::println); // the same as Stream.of(names)
  }
}
