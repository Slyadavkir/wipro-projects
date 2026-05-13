public class EnumStatus {

    public static void main(String[] args) {

        EnumStatus obj = new EnumStatus();

        obj.newSwitch1();
        obj.newSwitch2();
        obj.newSwitch3();
    }

    void newSwitch1() {
        int day = 2;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };

        System.out.println(result);
    }

    void newSwitch2() {
        int day = 2;
        String result = switch (day) {
            case 1, 2, 3, 4, 5 -> "Week days";
            case 6, 7 -> "Weekend";
            default -> "Invalid";
        };

        System.out.println(result);
    }

    void newSwitch3() {

        Status value = Status.SUCCESS;

        String message = switch (value) {
            case SUCCESS -> "Task is completed successfully!";
            case FAILURE -> "Task is failed";
            case PENDING -> "Task is in pending state!";
        };

        System.out.println(message);
    }
}

enum Status {
    SUCCESS, FAILURE, PENDING;
}