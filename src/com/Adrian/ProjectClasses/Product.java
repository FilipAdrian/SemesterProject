package com.Adrian.ProjectClasses;

public class Product {
   private String idProduct;
   private  String nameProduct;
   private Manufacture manufacture;
   private  Float priceProduct;
   private  Float costProduct;
   private  Integer quantity;
   private Warehouse warehouseLocation;

   public Product (String idProduct,String nameProduct, Manufacture manufacture , Float priceProduct,
                    Float costProduct , Integer quantity , Warehouse warehouseLocation){
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

   public Warehouse getWarehouseLocation(){
       return this.warehouseLocation;
   }

}
