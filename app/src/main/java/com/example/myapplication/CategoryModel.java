package com.example.myapplication;

public class CategoryModel {
    private String imageURL,title;

    public CategoryModel(String imageURL, String title)
    {
        this.imageURL=imageURL;
        this.title=title;

    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getTitle() {
        return title;
    }
}
