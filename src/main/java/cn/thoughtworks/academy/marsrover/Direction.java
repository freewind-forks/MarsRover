package cn.thoughtworks.academy.marsrover;

public enum Direction {
    WEST() {
        public Direction left() {
            return SOUTH;
        }

        public Direction right() {
            return NORTH;
        }
    },
    SOUTH() {
        public Direction left() {
            return EAST;
        }

        public Direction right() {
            return WEST;
        }
    },
    EAST() {
        public Direction left() {
            return NORTH;
        }

        public Direction right() {
            return SOUTH;
        }
    },
    NORTH() {
        public Direction left() {
            return WEST;
        }

        public Direction right() {
            return EAST;
        }
    };

    public abstract Direction left();

    public abstract Direction right();
}
