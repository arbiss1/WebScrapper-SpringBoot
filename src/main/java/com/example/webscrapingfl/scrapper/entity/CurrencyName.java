package com.example.webscrapingfl.scrapper.entity;

public class CurrencyName {

    private String name;
    private String valute;
    private String value;
    private String rate;

    public CurrencyName(){}

    public CurrencyName(String name, String valute, String value, String rate) {
        this.name = name;
        this.valute = valute;
        this.value = value;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValute() {
        return valute;
    }

    public void setValute(String valute) {
        this.valute = valute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
