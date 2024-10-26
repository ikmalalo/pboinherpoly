/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pboinherpoly;

/**
 *
 * @author ikmal
 */
import java.util.ArrayList;

public class Pesanan {
    private ArrayList<Menu> orderList = new ArrayList<>();

    // Method untuk menambahkan menu ke pesanan
    public void addMenu(Menu menu) {
        orderList.add(menu);
    }

    // Method untuk menghitung total harga pesanan
    public int calculateTotal() {
        int total = 0;
        for (Menu menu : orderList) {
            total += menu.getPrice();
        }
        return total;
    }

    // Method untuk menampilkan pesanan
    public void displayOrder() {
        System.out.println("Pesanan Anda:");
        for (Menu menu : orderList) {
            menu.displayInfo(); // Memanggil method polymorphic displayInfo() di setiap item
        }
        System.out.println("Total Harga: Rp" + calculateTotal());
    }
}

