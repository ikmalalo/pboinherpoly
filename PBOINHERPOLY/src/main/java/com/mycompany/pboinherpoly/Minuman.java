/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.pboinherpoly;


public class Minuman extends Menu {
    public Minuman(String name, int price) {
        super(name, price, "Minuman");
    }

    // Override method displayInfo untuk menampilkan kategori minuman
    @Override
    public void displayInfo() {
        System.out.println(getName() + " (Minuman) : Rp" + getPrice());
    }
}



