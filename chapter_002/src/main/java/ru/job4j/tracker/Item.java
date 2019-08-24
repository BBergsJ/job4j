package ru.job4j.tracker;

import java.util.Objects;

public class Item {
    private String id;
    private String name;
    private String desc;
    private long time;

    Item(String name, String desc, long time) {
        this.name = name;
        this.desc = desc;
        this.time = time;
    }
    Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    String getId() {
        return id;
    }
    void setId(String id) {
        this.id = id;
    }
    String getName() {
        return name;
    }
    String getDesc() {
        return desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time && Objects.equals(id, item.id) && Objects.equals(name, item.name) && Objects.equals(desc, item.desc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, time);
    }
    @Override
    public String toString() {
        return "ID заявки:   |" + this.id + '\n' + '\r' + "Имя заявки:  |" + this.name + '\n' + '\r' + "Описание:    |" + this.desc;
    }
}