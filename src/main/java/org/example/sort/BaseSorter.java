package org.example.sort;

public class BaseSorter {

  public void swap(Comparable<Long>[] toSwap, int index, int otherIndex) {
    Comparable savedValue = toSwap[index];
    toSwap[index] = toSwap[otherIndex];
    toSwap[otherIndex] = savedValue;
  }

  public boolean isLess(Comparable value, Comparable otherValue) {
    return value.compareTo(otherValue) < 0;
  }
}
