package com.zapp.zooplication.data.model;

import android.provider.ContactsContract;

import java.util.List;

public class User {
    private String name;
    private String username;
    private String password;
    private String phoneNumber;
    private boolean wantsToFish;
    private List<Recipe> submittedRecipes;
    private WalkingStatus walkingStatus;

}
