package com.enigma.robotPosition.enumeration;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    // Berpindah ke ordinal selanjutnya
    // Perlu menjaga agar nilai ordinal tidak melebihi jumlah nilai enum
    // Supaya kita dapat mendapatkan nilai untuk melakukan putaran / pindah arah mata angin
    // Dengan menggunakan modulus
    public Direction turnRight() {
        return Direction.values()[(this.ordinal() + 1) % 4];
    }

    // Berpindah ke ordinal sebelumnya
    // Perlu dilakukan penjagaan juga sama seperti di atas
    // Nilai 3 didapatkan untuk mendapatkan ordinal sebelumnya
    // Di ambil dari jumlah enum dikurangi 1
    public Direction turnLeft() {
        return Direction.values()[(this.ordinal() + 3) % 4];
    }
}
