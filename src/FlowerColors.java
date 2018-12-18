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

    public String toString(String flowertype) {
        String str = "";
        switch (flowertype) {
            case "Rose":
                for (String color: roseAvalibleColors) {
                    str = str.concat(color);
                }
                break;
            case "Tulip":
                for (String color: tulipAvalibleColors) {
                    str = str.concat(color);
                }
                break;
            case "Violet":
                for (String color: violetAvalibleColors) {
                    str = str.concat(color);
                }
                break;
        }
        return str;
    }
}
