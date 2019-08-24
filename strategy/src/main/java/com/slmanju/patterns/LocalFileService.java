package com.slmanju.patterns;

public class LocalFileService implements FileService {

    @Override
    public void retrieve() {
        System.out.println("Retrieving file from local disk.");
    }

    @Override
    public void save() {
        System.out.println("Save file in local disk.");
    }

}
