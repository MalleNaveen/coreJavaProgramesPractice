package com.practice;

public class Trade {
    private String tradeName;
    private Integer quantity;
    private String dateOfPurchase;

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(final String tradeName) {
        this.tradeName = tradeName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(final String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

}
