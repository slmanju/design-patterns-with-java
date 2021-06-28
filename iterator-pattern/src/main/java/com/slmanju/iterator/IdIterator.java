package com.slmanju.iterator;

import java.util.List;

public class IdIterator<T> implements BatchIterator<T> {

  private static final int BATCH_LIMIT = 5;
  private List<T> ids;
  private int total;
  private int currentIndex;

  public IdIterator(List<T> ids) {
    this.ids = ids;
    this.total = ids.size();
  }

  @Override
  public boolean hasNext() {
    return currentIndex < total;
  }

  @Override
  public List<T> nextBatch() {
    int next = Math.min((currentIndex + BATCH_LIMIT), total);
    List<T> idSlice = ids.subList(currentIndex, next);
    currentIndex = next;
    return idSlice;
  }

}
