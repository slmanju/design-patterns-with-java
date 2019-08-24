package com.slmanju.patterns;

public class StorageService {

    private FileService fileService;

    public StorageService(FileService fileService) {
        this.fileService = fileService;
    }

    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }


    public void retrieve() {
        fileService.retrieve();
    }

    public void save() {
        fileService.save();
    }

}
