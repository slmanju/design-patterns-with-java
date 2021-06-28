package com.slmanju.iterator;

import java.util.List;

@FunctionalInterface
public interface BatchFunction<T, R> {

  List<R> apply(List<T> nextBatch);

}
