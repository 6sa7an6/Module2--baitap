package RA.business.entity;

import RA.util.Formatter;

import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable { // lớp POJO
    // Để hỗ trợ đọc ghi nhị phân thì product phải implement Serializable
    private Long ofCatalogId;
    private Long productId;
    private String productName;
    private String descriptionProduct;
    private double unitPrice;
    private int stock;
    private LocalDate create_at;
    private LocalDate update_at;
    private boolean statusProduct;

    public Product() {
    }


    public Product(String productName, String descriptionProduct, double unitPrice, int stock, LocalDate create_at, LocalDate update_at, boolean statusProduct) {
        this.productName = productName;
        this.descriptionProduct = descriptionProduct;
        this.unitPrice = unitPrice;
        this.stock = stock;
        this.create_at = create_at;
        this.update_at = update_at;
        this.statusProduct = statusProduct;
    }

    public Long getOfCatalogId() {
        return ofCatalogId;
    }

    public void setOfCatalogId(Long ofCatalogId) {
        this.ofCatalogId = ofCatalogId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDate create_at) {
        this.create_at = create_at;
    }

    public LocalDate getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDate update_at) {
        this.update_at = update_at;
    }

    public boolean isStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(boolean statusProduct) {
        this.statusProduct = statusProduct;
    }

    @Override
    public String toString() {
        return "[" +
                "catalogId=" + ofCatalogId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", descriptionProduct='" + descriptionProduct + '\'' +
                ", unitPrice=" + Formatter.getNumberFormatterVND().format(unitPrice) +
                ", stock=" + stock +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", statusProduct=" + (statusProduct?"Đang bán":"Ngừng bán") +
                ']';
    }
}
