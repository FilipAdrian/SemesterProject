package com.walle.services;

import com.walle.entities.Product;
import com.walle.repository.ProductRepository;
import java.util.List;

public class ProductService {
  private   ProductRepository productRepository ;

   public  ProductService(){
       this.productRepository = new ProductRepository ();
   }

   public List<Product> getAllProducts() throws Exception {
       return productRepository.getAll ();
   }

}
