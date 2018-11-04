package com.domain.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie")
public class Movie {

    private int id;
    private String name;
    private MovieCategories category;
    private Date releaseDate;
    private short rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieCategories getCategory() {
        return category;
    }

    public void setCategory(MovieCategories category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public short getRate() {
        return rate;
    }

    public void setRate(short rate) {
        this.rate = rate;
    }
}
