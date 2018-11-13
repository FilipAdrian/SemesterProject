//package com.walle;
//
//
//import com.walle.entities.*;
//import com.walle.repository.*;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.layout.AnchorPane;
//
//
//
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        /**
//         country repozitory
//         verification of all methods
////         */
////        Country country = new Country (1,"namecountry");
//        CountryRepository countryRepository = new CountryRepository ();
////        System.out.println (countryRepository.getById (61001) );
////        countryRepository.insert (country);
////        countryRepository.update (country);
////        System.out.println (countryRepository.getAll ());
////        countryRepository.deleteByIdById (1);
//        /**
//         manufacture repozitory
//         verification of all methods
//         */
//ManufactureRepository manufactureRepository = new ManufactureRepository ();
////        System.out.println (manufactureRepository.getById (11016) );
////        System.out.println (manufactureRepository.getAll () );
////        Manufacture manufacture = new Manufacture (1, "newname",countryRepository.getById (61001),"456");
////        manufactureRepository.insert (manufacture);
////        manufactureRepository.deleteById (1);
////        manufactureRepository.update (manufacture);
//
//        /**
//         product repozitory
//         verification of all methods
////         */
//ProductRepository productRepository = new ProductRepository ();
//WarehouseRepository warehouseRepository = new WarehouseRepository ();
////        System.out.println ( productRepository.getByID ("MPH35"));
////        System.out.println (productRepository.getAll());
//        Product product = new Product ("23H2","wheles",3,23d,45d,manufactureRepository.getById (11016),warehouseRepository.getById (71001));
////        productRepository.insert(product);
//        product.setName ("roti");
////        productRepository.update (product);
//        productRepository.deleteById ("23H2");
//
////        ProductController productController = new ProductController ();
////        System.out.println (productController.displayProducts () );
////
//        /**
//         manufacture repozitory
//         verification of all methods
//         */
//
////        System.out.println (warehouseRepository.getAll () );
//        Warehouse warehouse = new Warehouse (1,"Depozit 666",countryRepository.getById (61001),"sfasdf","+56565656565");
////        warehouseRepository.insert (warehouse);
//        warehouse.setName ("Depozit 999");
////        warehouseRepository.update (warehouse);
////        warehouseRepository.deleteByIdById (1);
//        /**
//         * role repository
//         */
//RoleRepository roleRepository = new RoleRepository ();
////        System.out.println (roleRepository.getAll () );
//        Role role = new Role (1,"1");
////        roleRepository.insert (role);
//        role.setName ("2");
////        roleRepository.update (role);
////        roleRepository.deleteById (1);
//        /**
//         * user repository
//         */
//        UserRepository userRepository = new UserRepository ( );
////        System.out.println (userRepository.getById (51001));
//        User user = new User (1,"eu","filip","+56546464","afsf@gmail.com",countryRepository.getById (61001),"panasesti");
////        user.setRole ();
//
//        /**
//         * purchase repository
//         */
//        PurchaseRepository purchaseRepository = new PurchaseRepository ();
//        Client client = new ClientRepository ().getById (21001);
//        Product product1 =new ProductRepository ().getByID ("565211H000");
//        User user1 = new UserRepository ().getById (51002);
//        Purchase purchase = new Purchase (666,"2019-11-06",3,user1,product1,client);
////        purchase.setProductQuantity (8989);
////        purchaseRepository.update(purchase);
////        purchaseRepository.delete(666);
////        purchaseRepository.insert (purchase);
////        System.out.println (purchaseRepository.getById (31007) );
//        /**
//         * sales repository
//         */
//        SalesRepository salesRepository = new SalesRepository ();
//        Sales sales = new Sales (666,"2019-11-06",3,user1,product1,client);
////        salesRepository.insert (sales);
////        sales.setProductQuantity (333);
////        salesRepository.update (sales);
//        salesRepository.delete (666);
//        System.out.println ( salesRepository.getById (41001));
//    }
//
//}
