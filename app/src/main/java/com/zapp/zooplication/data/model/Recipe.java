package com.zapp.zooplication.data.model;

import android.icu.util.CurrencyAmount;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Recipe {

    private List<Ingredient> ingredients;
    private List<String> instructions;
    private Date dateAdded;
    private Date dateModified;

    public Recipe(List<Ingredient> ingredients, List<String> instructions, Date dateAdded) {
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.dateAdded = dateAdded;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) { this.ingredients.add(ingredient); }

    public void removeIngredient(Ingredient ingredient){
        this.ingredients.remove(ingredient);
    }

    public void setIngredients(List<Ingredient> ingredients){ this.ingredients = ingredients; }

    public List<String> getInstructions() {
        return instructions;
    }

    public void addInstruction(String instruction){
        this.instructions.add(instruction);
    }

    public void removeInstruction(String instruction){
        this.instructions.remove(instruction);
    }

    public void setInstructions(List<String> instructions) { this.instructions = instructions; }

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
