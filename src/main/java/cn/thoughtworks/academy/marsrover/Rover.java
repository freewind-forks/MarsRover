package cn.thoughtworks.academy.marsrover;

import java.util.List;

import static cn.thoughtworks.academy.marsrover.Direction.*;

public class Rover {
    private Direction direction;
    private MarsRover marsRover;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void execute(List<RoverCommand> commands) {
        for (RoverCommand command : commands) {
            command.execute(this);
        }
    }

    public void turnRight() {
        if (direction.equals(NORTH)) {
            this.direction = EAST;
        } else if (direction.equals(WEST)) {
            this.direction = NORTH;
        } else if (direction.equals(SOUTH)) {
            this.direction = WEST;
        } else if (direction.equals(EAST)) {
            this.direction = SOUTH;
        }
    }

    public void moveForward() {
        try {
            marsRover.move(this).to(this.direction);
        } catch (RoverNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void turnLeft() {
        if (direction.equals(NORTH)) {
            this.direction = WEST;
        } else if (direction.equals(WEST)) {
            this.direction = SOUTH;
        } else if (direction.equals(SOUTH)) {
            this.direction = EAST;
        } else if (direction.equals(EAST)) {
            this.direction = NORTH;
        }
    }

    public void setMarsRover(MarsRover marsRover) {
        this.marsRover = marsRover;
    }
}
