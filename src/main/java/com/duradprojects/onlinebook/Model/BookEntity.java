package com.duradprojects.onlinebook.Model;



import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tbl_book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String sku;
    private String name;
    private String description;
    private BigDecimal unit_price;
    private String image_url;
    private boolean active;
    private int units_in_stock;
    private Date date_created;
    private Date last_updated;


    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private BookCategoryEntity category;


    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit_price=" + unit_price +
                ", image_url='" + image_url + '\'' +
                ", active=" + active +
                ", units_in_stock=" + units_in_stock +
                ", date_created=" + date_created +
                ", last_updated=" + last_updated +
                ", category=" + category +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getUnits_in_stock() {
        return units_in_stock;
    }

    public void setUnits_in_stock(int units_in_stock) {
        this.units_in_stock = units_in_stock;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    public BookCategoryEntity getCategory() {
        return category;
    }

    public void setCategory(BookCategoryEntity category) {
        this.category = category;
    }
}
