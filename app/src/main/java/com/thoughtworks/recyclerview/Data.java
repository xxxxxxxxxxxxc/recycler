package com.thoughtworks.recyclerview;

public class Data {
    DataType type;
    String title;
    String description;
    int number;
    String avatar;

    public Data(DataType type, String title, String description, String avatar, int number) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.number = number;
        this.avatar = avatar;
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
