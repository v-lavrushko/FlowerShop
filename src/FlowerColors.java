class FlowerColors {
    private static final String[] tulipAvalibleColors = {"red", "purple", "yellow", "white", "pink"};
    private static final String[] roseAvalibleColors = {"red", "yellow", "cream", "pink"};
    private static final String[] violetAvalibleColors = {"purple", "blue"};

    FlowerColors() {
    }

    static String[] getAvalibleColors(String flowertype) {
        switch (flowertype) {
            case "Rose":
                return roseAvalibleColors;

            case "Tulip":
                return tulipAvalibleColors;

            case "Violet":
                return violetAvalibleColors;

            default:
                return new String[0];
        }
    }
}
