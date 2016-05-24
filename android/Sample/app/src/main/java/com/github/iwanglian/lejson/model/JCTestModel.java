// Generated by LeJson ,  DO NOT EDIT!
// Feedback to https://github.com/iwanglian/LeJson/issues,  DO NOT EDIT!

// Created by alick on 2016-05-24 09:32:11,  DO NOT EDIT!

package com.github.iwanglian.lejson.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JCTestModel {
	@JsonProperty("date")
	private String date; 
	@JsonProperty("top_stories")
	private List<TopStories>  topStories; 
	@JsonProperty("stories")
	private List<Stories>  stories; 

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    } 

    public List<TopStories>  getTopStories() {
        return topStories;
    }

    public void setTopStories(List<TopStories>  topStories) {
        this.topStories = topStories;
    } 

    public List<Stories>  getStories() {
        return stories;
    }

    public void setStories(List<Stories>  stories) {
        this.stories = stories;
    } 

	public static class TopStories {
		@JsonProperty("image")
		private String image; 
		@JsonProperty("type")
		private int type; 
		@JsonProperty("id")
		private int ID; 
		@JsonProperty("ga_prefix")
		private String gaPrefix; 
		@JsonProperty("title")
		private String title; 
	
	    public String getImage() {
	        return image;
	    }
	
	    public void setImage(String image) {
	        this.image = image;
	    } 
	
	    public int getType() {
	        return type;
	    }
	
	    public void setType(int type) {
	        this.type = type;
	    } 
	
	    public int getID() {
	        return ID;
	    }
	
	    public void setID(int ID) {
	        this.ID = ID;
	    } 
	
	    public String getGaPrefix() {
	        return gaPrefix;
	    }
	
	    public void setGaPrefix(String gaPrefix) {
	        this.gaPrefix = gaPrefix;
	    } 
	
	    public String getTitle() {
	        return title;
	    }
	
	    public void setTitle(String title) {
	        this.title = title;
	    } 
	}
	

	public static class Stories {
		@JsonProperty("images")
		private List<String>  images; 
		@JsonProperty("type")
		private int type; 
		@JsonProperty("id")
		private int ID; 
		@JsonProperty("ga_prefix")
		private String gaPrefix; 
		@JsonProperty("title")
		private String title; 
	
	    public List<String>  getImages() {
	        return images;
	    }
	
	    public void setImages(List<String>  images) {
	        this.images = images;
	    } 
	
	    public int getType() {
	        return type;
	    }
	
	    public void setType(int type) {
	        this.type = type;
	    } 
	
	    public int getID() {
	        return ID;
	    }
	
	    public void setID(int ID) {
	        this.ID = ID;
	    } 
	
	    public String getGaPrefix() {
	        return gaPrefix;
	    }
	
	    public void setGaPrefix(String gaPrefix) {
	        this.gaPrefix = gaPrefix;
	    } 
	
	    public String getTitle() {
	        return title;
	    }
	
	    public void setTitle(String title) {
	        this.title = title;
	    } 
	}
	
}

