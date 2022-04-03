package com.example.demo.user;

public class User {

    private Long id;
    private String name;
    private UserType type;
    private double discount;
    private double total;
    private double netAmount;


    public User(Long id, String name, UserType type, double discount, double total, double netAmount) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.discount = discount;
        this.total = total;
        this.netAmount = netAmount;
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

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (type == UserType.CUSTOMER) {
            this.discount = 0.1;
        } else {
            this.discount = 0.3;
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        if (total >=100) {
            int number = (int) (total / 100);

            this.netAmount = total - (total*this.discount)- 5 * number ;

        } else {
            this.netAmount = total - (total*this.discount) ;

        }
        }

}
