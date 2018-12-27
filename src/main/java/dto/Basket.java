package dto;

import java.util.List;

public class Basket {

    private String productName;
    private List<ProductCategory> productCategoryList;

    public Basket() {
    }

    public Basket(String productName, List<ProductCategory> productCategoryList) {
        this.productName = productName;
        this.productCategoryList = productCategoryList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<ProductCategory> getProductCategoryList() {
        return productCategoryList;
    }

    public void setProductCategoryList(List<ProductCategory> productCategoryList) {
        this.productCategoryList = productCategoryList;
    }
}

