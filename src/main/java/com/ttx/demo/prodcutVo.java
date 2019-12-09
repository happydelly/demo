package com.ttx.demo;

public class prodcutVo {

    private  String id;

    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public prodcutVo(String id, String color) {
        this.id = id;
        this.color = color;
    }

    @Override
    public String toString() {
        return "prodcutVo{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
