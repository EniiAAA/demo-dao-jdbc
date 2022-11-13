package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1,"Book");
        Seller seller = new Seller(1,"Elvio","elvio@gmail.com",new Date(),3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
