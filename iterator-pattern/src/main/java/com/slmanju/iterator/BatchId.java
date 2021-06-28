package com.slmanju.iterator;

import java.util.List;

public class BatchId<T> implements Batchable<T> {

  private List<T> ids;

  public BatchId(List<T> ids) {
    this.ids = ids;
  }

  @Override
  public BatchIterator<T> batchIterator() {
    return new IdIterator<>(ids);
  }

}
