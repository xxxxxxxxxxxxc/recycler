package com.thoughtworks.recyclerview;

public class Data {
    DataType type;
    public String title;
    public String description;
    public int number;

    public Data(DataType type, String title, String description, int number) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.number = number;
    }


    enum DataType {
        Header(0),
        Data(1);

        int type;

        DataType(int type) {
            this.type = type;
        }
    }
}
