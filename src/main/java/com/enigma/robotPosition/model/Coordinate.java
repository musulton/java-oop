package com.enigma.robotPosition.model;

public class Coordinate {
    private int coordinateX;
    private int coordinateY;

    // Perlu untuk inisialisasi koordinat / sumbu kartesian awal
    public Coordinate(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    // Sumbu X maju (positif)
    // Berarti maju 1 langkah ke kanan / arah mata angin east
    public void moveToRight() {
        this.coordinateX += 1;
    }

    // Sumbu X mundur (negatif)
    // Berarti maju 1 langkah ke kiri / arah mata angin west
    public void moveToLeft() {
        this.coordinateX -= 1;
    }

    // Sumbu Y maju (positif)
    // Berarti maju 1 langkah ke atas / arah mata angin north
    public void moveToTop() {
        this.coordinateY += 1;
    }

    // Sumbu Y mundur (negatif)
    // Berarti maju 1 langkah ke bawah / arah mata angin south
    public void moveToBottom() {
        this.coordinateY -= 1;
    }

    @Override
    public String toString() {
        return "(" + coordinateX + "," + coordinateY + ')';
    }
}
