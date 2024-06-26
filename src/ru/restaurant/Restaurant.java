package ru.restaurant;

public class Restaurant {
    public int pearsCount;
    String[] menu = {"Шарлотка грушевая", "Компот грушевый", "Салат из груш и лисичек", "Рулет с грушами"};
    public void showMenu(){
        for(int i = 0; i < menu.length; i++){
            System.out.println("Сегодня у нас в меню " + menu[i]);
        }
    }
    public void checkPears(){
        if(pearsCount < 5){
            System.out.println("Пора заказать ещё груш");
            pearsCount = pearsCount + 5;
        } else {
            System.out.println("Груш пока достаточно");
        }
    }
    public void cook(String name){
        System.out.println("Готовим " + name);
        pearsCount--;
    }
}

class Praktikum{
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.showMenu();
        restaurant.pearsCount = 5;
        restaurant.cook("Салат из груш и лисичек");
        restaurant.checkPears();
    }
}
