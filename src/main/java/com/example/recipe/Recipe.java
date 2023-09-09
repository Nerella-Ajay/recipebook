// Write your code here
package com.example.recipe;

public class Recipe{
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private String ingredients;

    public Recipe(int recipeId, String recipeName, String recipeType, String[] ingredients){
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.ingredients = ingredients;

    }
     public int getRecipeId(){
        return recipeId;
     }

     public void setRecipeId(int recipeId){
        this.recipeId = recipeId;

     }

     public String getRecipeName(){
        return recipeName;
     }

     public void setRecipeName(String recipeName){
        this.recipeName = recipeName;
     }

     public String getRecipeType(){
        return recipeType;
     }

     public void setRecipeType(String recipeType){
        this.recipeType = recipeType;
     }

     public String[] getIngredients(){
        return ingredients;
     }

     public void setIngredients(String[] ingredients){
        this.ingredients = ingredients;
     }
}
