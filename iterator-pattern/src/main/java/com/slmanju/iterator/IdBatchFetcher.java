package com.slmanju.iterator;

import java.util.ArrayList;
import java.util.List;

public class IdBatchFetcher<T, R> implements BatchFetcher<T, R> {

  private BatchId<T> batchId;

  public IdBatchFetcher(List<T> ids) {
    this.batchId = new BatchId<>(ids);
  }

  @Override
  public List<R> fetchAll(BatchFunction<T, R> batchFunction) {
    List<R> result = new ArrayList<>();
    BatchIterator<T> batchIterator = batchId.batchIterator();

    while (batchIterator.hasNext()) {
      List<T> nextBatch = batchIterator.nextBatch();
      List<R> nextBatchResult = batchFunction.apply(nextBatch);
      result.addAll(nextBatchResult);
    }

    return result;
  }

}
