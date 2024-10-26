/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pboinherpoly;



public class Menu {
    private String name; 
    private int price;   
    private String category; 

    // Konstruktor Menu untuk mengatur nama, harga, dan kategori
    public Menu(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getter dan setter untuk setiap atribut
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Method polymorphic untuk menampilkan informasi menu
    public void displayInfo() {
        System.out.println(name + " : Rp" + price);
    }
}

