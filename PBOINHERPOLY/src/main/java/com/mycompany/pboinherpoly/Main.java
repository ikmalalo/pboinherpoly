package com.mycompany.pboinherpoly;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Membuat objek Pesanan untuk menyimpan data pesanan pengguna
        Pesanan pesanan = new Pesanan();

        // Menyiapkan daftar menu makanan
        Menu[] makanan = {
            new Makanan("Ayam Biasa", 6000),
            new Makanan("Geprek Sambal Matah", 11000),
            new Makanan("Geprek Sambal Ijo", 11000),
            new Makanan("Geprek Keju Mozarella", 15000),
            new Makanan("Kripik Usus", 10000)
        };

        // Menyiapkan daftar menu minuman
        Menu[] minuman = {
            new Minuman("Es Teh", 5000),
            new Minuman("Es Jeruk", 5000)
        };

        // Logika utama program untuk memproses pilihan pengguna
        boolean pesan = true;
        while (pesan) {
            System.out.println("Pilih Menu:");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda (1/2/3): ");
            int mainChoice = scanner.nextInt();

            if (mainChoice == 1) {
                // Menampilkan kategori menu yang tersedia
                System.out.println("Pilih Kategori:");
                System.out.println("1. Makanan");
                System.out.println("2. Minuman");
                System.out.print("Pilihan Anda (1/2): ");
                int categoryChoice = scanner.nextInt();

                // Variabel untuk menyimpan kategori menu yang dipilih
                Menu[] selectedMenu = null;

                // Memilih kategori menu berdasarkan pilihan pengguna
                if (categoryChoice == 1) {
                    selectedMenu = makanan;
                } else if (categoryChoice == 2) {
                    selectedMenu = minuman;
                } else {
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    continue;
                }

                boolean kategoripesanan = true;
                while (kategoripesanan) {
                    // Menampilkan menu berdasarkan kategori yang dipilih
                    System.out.println("Menu yang tersedia:");
                    for (int i = 0; i < selectedMenu.length; i++) {
                        selectedMenu[i].displayInfo(); // Memanggil method polymorphic displayInfo()
                    }

                    System.out.print("Pilih nomor menu yang ingin dipesan (atau 0 untuk kembali): ");
                    int itemChoice = scanner.nextInt();

                    if (itemChoice > 0 && itemChoice <= selectedMenu.length) {
                        // Menambahkan menu ke pesanan
                        pesanan.addMenu(selectedMenu[itemChoice - 1]);
                        System.out.println("Menu '" + selectedMenu[itemChoice - 1].getName() + "' berhasil dipesan.");
                    } else if (itemChoice == 0) {
                        kategoripesanan = false; // Kembali ke menu utama
                    } else {
                        System.out.println("Pilihan tidak valid, coba lagi.");
                    }
                }
            } else if (mainChoice == 2) {
                // Menampilkan daftar pesanan pengguna
                pesanan.displayOrder();
            } else if (mainChoice == 3) {
                // Keluar dari program
                System.out.println("Terima kasih telah memesan!");
                pesan = false;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
        scanner.close(); // Menutup scanner setelah selesai
    }
}
