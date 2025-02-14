package com.multi.collection.d_mvc.model.dto;

public class MenuItem {
        private String name;       // 메뉴 이름
        private String category;   // 메뉴의 카테고리 (음료, 디저트, 등)
        private int price;         // 메뉴 가격

        // 기본 생성자
        public MenuItem() {
        }

        // 모든 필드를 초기화하는 생성자
        public MenuItem(String name, String category, int price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

        // Getter와 Setter 메서드
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        // toString 메서드 (객체의 상태 출력)
        @Override
        public String toString() {
            return "MenuItem{" +
                    "name='" + name + '\'' +
                    ", category='" + category + '\'' +
                    ", price=" + price +
                    '}';
        }
    }


