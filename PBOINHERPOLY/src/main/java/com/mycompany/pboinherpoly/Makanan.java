/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author ikmal
 */

package com.mycompany.pboinherpoly;

public class Makanan extends Menu {
    public Makanan(String name, int price) {
        super(name, price, "Makanan"); 
    }

    // Override method displayInfo untuk menampilkan kategori makanan
    @Override
    public void displayInfo() {
        System.out.println(getName() + " (Makanan) : Rp" + getPrice());
    }
}



