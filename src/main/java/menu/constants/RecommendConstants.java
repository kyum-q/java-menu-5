package menu.constants;

public enum RecommendConstants {
    COACH_MIN_COUNT(2),
    COACH_MAX_COUNT(5),
    COACH_MIN_NAME_LEN(2),
    COACH_MAX_NAME_LEN(4),
    DONT_EAT_MENU_MIN(0),
    DONT_EAT_MENU_MAX(2);

    private int number;
    RecommendConstants(int n) {
        number = n;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%d", number);
    }
}
