package redischool.Lesson11;

enum Turn {
    LEFT, RIGHT
}

enum Directions {
    // "East" in parenthesis is customized value
    EAST("East") {
        Directions left() {
            return NORTH;
        }
        Directions right() {
            return SOUTH;
        }
    },
    NORTH("North") {
        Directions left() {
            return WEST;
        }
        Directions right() {
            return EAST;
        }
    },
    SOUTH("South") {
        Directions left() {
            return EAST;
        }
        Directions right() {
            return WEST;
        }
    },
    WEST("West") {
        Directions left() {
            return SOUTH;
        }
        Directions right() {
            return NORTH;
        }
    };

    private String move;
    // Constructor is in this case used to get customizes values
    // enum constructor - ca be private or default
    Directions(String move) {
        this.move = move;

        // enum constructor called separately for each constant
        System.out.println("Constructor called for : " + this.toString());
    }
    // getter method for getting customized values
    public String getMove() {
        return move;
    }


    // If an enum class has an abstract method, then each instance of the enum class must implement it
    // Otherwise we can use just concrete methods
    abstract Directions left();
    abstract Directions right();

    public Directions turn(Turn where) {
        return where == Turn.LEFT ? this.left() : this.right();
    }
}

 class EnumDirections {
    Directions dir;
    public EnumDirections(Directions dir) {
        this.dir = dir;
    }

    public void getMyDirection() {
        switch (dir) {
            case EAST:
                System.out.println("Turned in East Direction");
                break;

            case WEST:
                System.out.println("Turned in West Direction");
                break;

            case NORTH:
                System.out.println("Turned in North Direction");
                break;

            default:
                System.out.println("Turned in South Direction");
                break;
        }
    }


    public static void main(String[] args) {
        // values() method - can be used to return all values present inside enum
        Directions[] array = Directions.values();
        System.out.println("\n");

        // let's print name of each enum - values(), it's index- ordinal() & it's 'move' customized value
        // ordinal() method -  each enum constant index can be found (just like array index)
        for (Directions singleDirection : array) {
            System.out.println("There is " + singleDirection + " at index " + singleDirection.ordinal() + " and it's customized value is: " + singleDirection.getMove());
        }
        System.out.println("\n");

        EnumDirections northObj = new EnumDirections(Directions.NORTH);
        northObj.getMyDirection();
        System.out.println("\n");

        String s = "SOUTH";
        // valueOf() method - to obtain an instance of the enum class for a given String value
        EnumDirections southObj = new EnumDirections(Directions.valueOf(s));
        southObj.getMyDirection();


        Directions d = Directions.SOUTH;
        System.out.println("Start in " +  d);               // start in south
        System.out.println(Directions.valueOf("SOUTH"));               // prints SOUTH
        // and here we make our turns in different directions and it works:)
        Directions currentDirection = d.turn(Turn.LEFT);
        System.out.println("Turn left to " + currentDirection);    // east
        currentDirection = currentDirection.turn(Turn.RIGHT);
        System.out.println("Turn right to " + currentDirection);    // south
        currentDirection = currentDirection.turn(Turn.RIGHT);
        System.out.println("Turn right to " + currentDirection);    // west
    }
}
