package ru.strike;

public class MyInterfaceFactory {

    private static final String COMMON = "common";
    private static final String CROP = "crop";

    public static MyInterface getMyInterface() {

        String profile = ProfileUtil.getProfile();
        try {
            switch (profile) {
                case COMMON:
                    return (MyInterface) createInstance("ru.strike.common.CommonClass");
                case CROP:
                    return (MyInterface) createInstance("ru.strike.crop.CropClass");
                default:
                    throw new IllegalArgumentException("Not supported profile: " + profile);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    private static Object createInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(className);
        return clazz.newInstance();
    }

}
