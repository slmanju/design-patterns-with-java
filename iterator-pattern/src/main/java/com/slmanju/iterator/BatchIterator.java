package com.slmanju.iterator;

import java.util.List;

public interface BatchIterator<T> {

  boolean hasNext();

  List<T> nextBatch();

}
