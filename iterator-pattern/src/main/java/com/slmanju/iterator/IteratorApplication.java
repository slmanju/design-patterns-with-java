package com.slmanju.iterator;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class IteratorApplication {

  public static void main(String[] args) {
    List<Pet> pets = IntStream.range(0, 25).mapToObj(value -> new Pet(value, "Pet-".concat(String.valueOf(value)))).collect(toList());
    List<Integer> ids = IntStream.range(3, 21).boxed().collect(toList());

    BatchFetcher<Integer, Pet> petBatchFetcher = new IdBatchFetcher<>(ids);

    List<Pet> collectedPets = petBatchFetcher.fetchAll(nextBatch -> {
      System.out.println("fetching batch from data store " + nextBatch);
      return pets.stream().filter(pet -> nextBatch.contains(pet.id)).collect(toList());
    });

    collectedPets.forEach(pet -> System.out.println(pet.name));
  }

  private static class Pet {
    public Integer id;
    public String name;

    public Pet(Integer id, String name) {
      this.id = id;
      this.name = name;
    }
  }

}
