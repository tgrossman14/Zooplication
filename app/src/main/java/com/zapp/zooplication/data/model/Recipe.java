package com.zapp.zooplication.data.model;

import android.icu.util.CurrencyAmount;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Recipe {

    private List<HashMap<String, String>> ingredients;
    private List<String> instructions;
    private Date dateAdded;
    private Date dateModified;

    public Recipe(List<HashMap<String, String>> ingredients, List<String> instructions, Date dateAdded) {
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.dateAdded = dateAdded;
    }

    public List<HashMap<String, String>> getIngredients() {
        return ingredients;
    }

    public void addIngredient(HashMap<String, String> ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(String name){
        this.ingredients.remove(name);
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void addInstruction(String instruction){
        this.instructions.add(instruction);
    }

    public void removeInstruction(String instruction){
        this.instructions.remove(instruction);
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}
