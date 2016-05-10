package mavenShop3.service;

import mavenShop3.model.Category;
import mavenShop3.model.Good;
import mavenShop3.model.Order;

import java.util.List;


public interface GoodService {

    boolean add(Good good);

    boolean edit(Good good);

    Good find(Integer id);

    List<Category> getCategoruiesList();

    Category getCategory(String name);

    List<Good> getList(Integer category);

    List<Order> getListOfOrder(Integer id);
    
    boolean deleteGood(Integer id);
    
    List<Order> getListOfOrderThisName(Integer id);
    
    List<Order> getListOfOrderAll();
    
    List<Good> findAll();
    
    //boolean addOrderInfo(OrderInfo oi);
    
    boolean addOrders(Order o);
}
