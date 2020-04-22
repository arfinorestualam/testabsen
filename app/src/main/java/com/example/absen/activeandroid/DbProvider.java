package com.example.absen.activeandroid;

import com.activeandroid.Configuration;
import com.activeandroid.content.ContentProvider;

import static java.security.AccessController.getContext;


public class DbProvider extends ContentProvider {

    @Override
    protected Configuration getConfiguration() {
        Configuration.Builder builder = new Configuration.Builder(getContext());
        builder.addModelClass(DbAbsenModel.class);

        return builder.create();
    }
}
