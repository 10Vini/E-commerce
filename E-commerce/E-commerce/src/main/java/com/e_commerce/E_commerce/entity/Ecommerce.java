package com.e_commerce.E_commerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ecommerce {
@Id
private int userid;
private int productid;
private String Productname;
private Double Price;
private int ProductQuantity;


public int getUserid() {
    return userid;
}
public void setUserid(int userid) {
    this.userid = userid;
}
public int getProductid() {
    return productid;
}
public void setProductid(int productid) {
    this.productid = productid;
}
public String getProductname() {
    return Productname;
}
public void setProductname(String productname) {
    Productname = productname;
}
public Double getPrice() {
    return Price;
}
public void setPrice(Double price) {
    Price = price;
}
public int getProductQuantity() {
    return ProductQuantity;
}
public void setProductQuantity(int productQuantity) {
    ProductQuantity = productQuantity;
}
@Override
public String toString() {
	return "Ecommerce [userid=" + userid + ", productid=" + productid + ", Productname=" + Productname + ", Price="
			+ Price + ", ProductQuantity=" + ProductQuantity + "]";
}


}
