package com.slmanju.patterns;

public class App {

    public static void main(String[] args) {
        FileService localFileService = new LocalFileService();

        StorageService storageService = new StorageService(localFileService);
        storageService.save();
        storageService.retrieve();

        System.out.println("------");

        FileService awsFileService = new AwsFileService();
        storageService.setFileService(awsFileService);
        storageService.save();
        storageService.retrieve();
    }

}
