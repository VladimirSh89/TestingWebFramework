package Driver;

public enum Drivers {
    IE, FF, CH, SF;
    public static Drivers driverForName(String stringDriver) {
        for(Drivers driver : values()) {
            if(driver.toString().equalsIgnoreCase(stringDriver)) {
                return driver;
            }
        }
        throw driverNotFound(stringDriver);
    }

    private static IllegalArgumentException driverNotFound(String outcome) {
        return  new IllegalArgumentException(("Invalid driver [" + outcome + "]"));
    }
}
