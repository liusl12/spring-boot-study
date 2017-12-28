package com.liusl.model;

import java.io.Serializable;
import java.util.List;

/**
 * created by l1 on 2017/12/27.
 */
public class Order implements Serializable{
    private Integer id;
    private String code;
    private Double total;

    //订单和用户是多对一的关系
    private User2 user2;

    //订单和商品是多对多的关系
    private List<Article> articles;

    public Order(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public User2 getUser2() {
        return user2;
    }

    public void setUser2(User2 user2) {
        this.user2 = user2;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
