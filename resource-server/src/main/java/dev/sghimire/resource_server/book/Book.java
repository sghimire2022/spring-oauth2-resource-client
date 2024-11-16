package dev.sghimire.resource_server.book;

public class Book {

    private String title;
    private  int cost;

    public Book(int cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
