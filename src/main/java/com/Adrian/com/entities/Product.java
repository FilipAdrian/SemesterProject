package com.Adrian.com.entities;


public class Product {
   private String idProduct;
   private  String nameProduct;
   private Manufacture manufacture;
   private  Float priceProduct;
   private  Float costProduct;
   private  Integer quantity;
   private String warehouseLocation;

   public Product (String idProduct,String nameProduct, Manufacture manufacture , Float priceProduct,
                    Float costProduct , Integer quantity , String warehouseLocation){
       this.idProduct = idProduct;
       this.nameProduct = nameProduct;
       this.manufacture = manufacture;
       this.priceProduct = priceProduct;
       this.costProduct = costProduct;
       this.quantity = quantity;
       this.warehouseLocation = warehouseLocation;
   }

   public String getIdProduct(){
       return this.idProduct;
   }

   public  String getNameProduct(){
       return this.getNameProduct ();
   }

   public  Manufacture getManufacture(){
      return this.manufacture;
   }

   public  Float getPriceProduct(){
       return  this.priceProduct;
   }

   public Float getCostProduct(){
       return  this.costProduct;
   }

   public Integer getQuantity(){
       return  this.quantity;
   }

   public String getWarehouseLocation(){
       return this.warehouseLocation;
   }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public void setPriceProduct(Float priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void setCostProduct(Float costProduct) {
        this.costProduct = costProduct;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }
}
