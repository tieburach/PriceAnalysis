package com.example.demo.model;

public class SearchDetails {

    private static int categoryNumber;
    private static String categoryName;
    private static int parameterIndex;

    public static int getCategoryNumber() {
        return categoryNumber;
    }

    public static void setCategoryNumber(int categoryNumber) {
        SearchDetails.categoryNumber = categoryNumber;
    }

    public static String getCategoryName() {
        return categoryName;
    }

    public static void setCategoryName(String categoryName) {
        SearchDetails.categoryName = categoryName;
    }

    public static int getParameterIndex() {
        return parameterIndex;
    }

    public static void setParameterIndex(int parameterIndex) {
        SearchDetails.parameterIndex = parameterIndex;
    }
}
