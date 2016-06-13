package cn.thoughtworks.academy.marsrover;

public enum Direction {
    WEST() {
        @Override
        public Direction left() {
            return SOUTH;
        }

        @Override
        public Direction right() {
            return NORTH;
        }
    },
    SOUTH() {
        @Override
        public Direction left() {
            return EAST;
        }

        @Override
        public Direction right() {
            return WEST;
        }
    },
    EAST() {
        @Override
        public Direction left() {
            return NORTH;
        }

        @Override
        public Direction right() {
            return SOUTH;
        }
    },
    NORTH() {
        @Override
        public Direction left() {
            return WEST;
        }

        @Override
        public Direction right() {
            return EAST;
        }
    };

    public abstract Direction left();

    public abstract Direction right();
}
