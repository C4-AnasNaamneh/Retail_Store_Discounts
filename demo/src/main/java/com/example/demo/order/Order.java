package com.example.demo.order;

public class Order {

    private Long id;
    private String name;
    private Integer userDiscount;
    private Integer subTotal;
    private Integer totalAmount;

    public Order() {
    }


    public Order(Long id, String name, Integer userDiscount, Integer subTotal, Integer totalAmount) {
        this.id = id;
        this.name = name;
        this.userDiscount = userDiscount;
        this.subTotal = subTotal;
        this.totalAmount = totalAmount;
    }

    public Order(String name, Integer userDiscount, Integer subTotal, Integer totalAmount) {
        this.name = name;
        this.userDiscount = userDiscount;
        this.subTotal = subTotal;
        this.totalAmount = totalAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserDiscount() {
        return userDiscount;
    }

    public void setUserDiscount(Integer userDiscount) {
        this.userDiscount = userDiscount;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userDiscount=" + userDiscount +
                ", subTotal=" + subTotal +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
