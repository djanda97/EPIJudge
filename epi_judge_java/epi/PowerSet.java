package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.EpiTestComparator;
import epi.test_framework.GenericTest;
import epi.test_framework.LexicographicalListComparator;

import java.util.Collections;
import java.util.List;

public class PowerSet {
  @EpiTest(testDataFile = "power_set.tsv")
  public static List<List<Integer>> generatePowerSet(List<Integer> inputSet) {
    // TODO - you fill in here.
    return null;
  }

  @EpiTestComparator
  public static boolean comp(List<List<Integer>> expected, List<List<Integer>> result) {
    if (result == null) {
      return false;
    }
    for (List<Integer> l : expected) {
      Collections.sort(l);
    }
    expected.sort(new LexicographicalListComparator<>());
    for (List<Integer> l : result) {
      Collections.sort(l);
    }
    result.sort(new LexicographicalListComparator<>());
    return expected.equals(result);
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest.runFromAnnotations(
                args, "PowerSet.java", new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
