package com.xizhan.entity;

/**
 * @author shkstart
 * @create 2022-04-11 15:11
 */
public class Paper {

    private int paperid;

    private String name;

    private String autor;

    public Paper() {
    }

    public Paper(int paperid, String name, String autor) {
        this.paperid = paperid;
        this.name = name;
        this.autor = autor;
    }

    public int getPaperid() {
        return paperid;
    }

    public void setPaperid(int paperid) {
        this.paperid = paperid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public String toString() {
        return "Paper{" +
                "paperid=" + paperid +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

