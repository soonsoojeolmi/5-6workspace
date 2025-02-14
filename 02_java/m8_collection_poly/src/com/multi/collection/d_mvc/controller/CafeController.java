package com.multi.collection.d_mvc.controller;

import com.multi.collection.d_mvc.model.dto.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CafeController {
    private List<MenuItem> menuItemList = new ArrayList<>(); // ✅ 리스트 변수명 유지

    public void addMenuItem(String name, String category, int price) {
        MenuItem menuItem = new MenuItem(name, category, price); // ✅ 오타 수정 (manuItem → menuItem)
        menuItemList.add(menuItem);
    }

    public List<MenuItem> getMenuList(){
        return menuItemList;
    }

    public boolean deleteMenuItem(String name){
        return menuItemList.removeIf(menuItem -> menuItem.getName().equals(name));
    }

    public MenuItem findMenuItem(String name){
        for (MenuItem menuItem : menuItemList) {
            if (menuItem.getName().equals(name)) {
                return menuItem;
            }
        }
        return null;
    }

    public boolean updatePrice(String name, int newPrice){
        for (MenuItem menuItem : menuItemList) {
            if (menuItem.getName().equals(name)) {
                menuItem.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }
}
