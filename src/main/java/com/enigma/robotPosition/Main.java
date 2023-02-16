package com.enigma.robotPosition;

import com.enigma.robotPosition.enumeration.Direction;
import com.enigma.robotPosition.model.Coordinate;
import com.enigma.robotPosition.model.Robot;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(2, 3);
        Direction direction = Direction.EAST;
        Robot robot = new Robot(direction, coordinate);

        String commands = "AARAAAA";
        robot.moves(commands);
    }
}
