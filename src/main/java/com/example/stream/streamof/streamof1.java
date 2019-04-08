package com.example.stream.streamof;

import java.util.stream.Stream;

public class streamof1 {

  // this print "ave"
  public static void main(String[] args) {
    Stream.of("ave", "bardagul", "katrina", "zulu", "xyclope")
        .sorted()
        .findFirst()
        .ifPresent(System.out::println);
  }
}
