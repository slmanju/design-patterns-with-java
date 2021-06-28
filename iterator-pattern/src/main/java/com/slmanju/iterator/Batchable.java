package com.slmanju.iterator;

public interface Batchable<T> {

  BatchIterator<T> batchIterator();

}
