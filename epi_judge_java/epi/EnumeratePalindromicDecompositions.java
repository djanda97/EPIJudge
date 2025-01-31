package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.EpiTestComparator;
import epi.test_framework.GenericTest;
import epi.test_framework.LexicographicalListComparator;

import java.util.List;
import java.util.function.BiPredicate;

public class EnumeratePalindromicDecompositions {
  @EpiTest(testDataFile = "enumerate_palindromic_decompositions.tsv")
  public static List<List<String>> palindromeDecompositions(String text) {
    // TODO - you fill in here.
    return null;
  }

  @EpiTestComparator
  public static boolean comp(List<List<String>> expected, List<List<String>> result) {
    if (result == null) {
      return false;
    }
    expected.sort(new LexicographicalListComparator<>());
    result.sort(new LexicographicalListComparator<>());
    return expected.equals(result);
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest.runFromAnnotations(
                args,
                "EnumeratePalindromicDecompositions.java",
                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
