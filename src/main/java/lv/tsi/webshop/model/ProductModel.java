package lv.tsi.webshop.model;

import lv.tsi.webshop.Enums;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String name;
    public String description;
    public float price;
    public String pictureUrl;
    public Enums.ProductCategory productCategory;
}