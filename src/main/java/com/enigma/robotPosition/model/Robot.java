package com.enigma.robotPosition.model;

import com.enigma.robotPosition.enumeration.Command;
import com.enigma.robotPosition.enumeration.Direction;

public class Robot {
    private Direction direction;
    private final Coordinate coordinate;

    // inisialisasi koordinat dan arah awal
    public Robot(Direction direction, Coordinate coordinate) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    // perlu membagi setiap karakter dalam string
    // nilai tersebut akan digunakan untuk berpindah posisi dan arah
    public void moves(String commands) {
        // Kita men-split string menjadi array
        // dan setiap itemnya akan digunakan untuk berpindah posisi dan arah
        String[] commandsArr = commands.split("");
        for (String command: commandsArr) {
            move(command);
        }
    }

    private void move(String commandString) {
        try {
            // convert string menjadi enum
            // akan ada potensi error saat konversi string ke enum
            // karena nilai yang di konversi belum tentu didefine di dalam enum
            // maka kita perlu membungkus program
            // yang kemungkinan dapat menimbulkan crash app di dalam blok try catch
            Command command = Command.valueOf(commandString);
            switch (command) {
                case A -> forward();
                case L -> this.direction = this.direction.turnLeft();
                case R -> this.direction = this.direction.turnRight();
            }

            System.out.println(this.getCoordinate(commandString));
        } catch (Exception e) {
            System.out.println(commandString + " -> not a valid command!");
        }
    }

    // maju 1 langkah ke mata angin yang sedang dipilih
    private void forward() {
        switch (this.direction) {
            case EAST -> this.coordinate.moveToRight();
            case NORTH -> this.coordinate.moveToTop();
            case SOUTH -> this.coordinate.moveToBottom();
            case WEST -> this.coordinate.moveToLeft();
        }
    }

    // untuk mencetak letak posisi dan arah mata angin
    private String getCoordinate(String command) {
        return command + " -> " + coordinate;
    }
}
