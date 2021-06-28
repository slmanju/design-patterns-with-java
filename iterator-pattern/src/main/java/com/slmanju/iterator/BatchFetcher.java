package com.slmanju.iterator;

import java.util.List;

public interface BatchFetcher<T, R> {

  List<R> fetchAll(BatchFunction<T, R> batchFunction);

}
