package redischool.Lesson11;

public class SimpleDirections {
    enum Direction {
        EAST,
        NORTH,
        SOUTH,
        WEST;

        Direction turnRight() {
            if (this == EAST) {
                return SOUTH;
            } else if (this == SOUTH) {
                return WEST;
            } else if (this == WEST) {
                return NORTH;
            } else {
                return EAST;
            }
        }

        Direction turnLeft() {
            if (this == EAST) {
                return NORTH;
            } else if (this == NORTH) {
                return WEST;
            } else if (this == WEST) {
                return SOUTH;
            } else {
                return EAST;
            }
        }
    }

    private static void printDirectionAfterTurningRightOrLeft(Direction direction) {
        System.out.println(String.format("When I am facing %s and turn right " +
                "then I'll be facing %s", direction, direction.turnRight()));
        System.out.println(String.format("When I am facing %s and turn left " +
                "then I'll be facing %s", direction, direction.turnLeft()));
    }

    public static void main(String[] args) {
        Direction direction = Direction.EAST;
        printDirectionAfterTurningRightOrLeft(direction);
    }
}
