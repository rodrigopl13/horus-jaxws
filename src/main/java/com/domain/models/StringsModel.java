package com.domain.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "strings")
public class StringsModel {

    private String value;
    private int times;
    private char seek;
    private char replace;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public char getSeek() {
        return seek;
    }

    public void setSeek(char seek) {
        this.seek = seek;
    }

    public char getReplace() {
        return replace;
    }

    public void setReplace(char replace) {
        this.replace = replace;
    }
}
