package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

public class Parity {
  @EpiTest(testDataFile = "parity.tsv")
  public static short parity(long x) {
    short count = 0;
    for (char c : Long.toBinaryString(x).toCharArray()) {
      if (c == '1') count++;
    }
    if (count % 2 != 0) return 1;
    return 0;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest.runFromAnnotations(
                args, "Parity.java", new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
