package com.tlglearning.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Wolf> wolves = new ArrayList<>();
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Dog());
    wolves.add(new Dog());
    wolves.add(new Dog());
    Collections.shuffle(wolves);
    for (Wolf w: wolves) { //enhanced for loop read "for each wolf in the list wolves and referring to each one in turn as w, perform the steps below
      System.out.println();
      System.out.println(w.getClass().getName());
      w.hunt();
      w.vocalize();
      if (w instanceof Dog) {
        ((Dog) w).rollOver();
      }

    }
  }

}
