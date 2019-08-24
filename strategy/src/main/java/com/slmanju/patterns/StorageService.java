package com.slmanju.patterns;

public class StorageService implements FileService {

    private FileService fileService;

    public StorageService(FileService fileService) {
        this.fileService = fileService;
    }

    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }


    @Override
    public void retrieve() {
        fileService.retrieve();
    }

    @Override
    public void save() {
        fileService.save();
    }

}
