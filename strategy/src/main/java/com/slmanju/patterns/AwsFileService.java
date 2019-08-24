package com.slmanju.patterns;

public class AwsFileService implements FileService {

    @Override
    public void retrieve() {
        System.out.println("Retrieving file from S3 bucket.");
    }

    @Override
    public void save() {
        System.out.println("Saving file in S3 bucket.");
    }

}
