public class App {

    private static final int recKeySetCount = 8;

    public static void main(String[] args) throws Exception {
        System.out.println("Recovery Key : " + generateBLRecKey());
    }

    private static String generateBLRecKey() {

        String recKey = "";

        for (int i = 0; i < recKeySetCount; i++) {

            if (i < 7)
                recKey += random16BitNumGenerator() + "-";
            else
                recKey += random16BitNumGenerator();
        }

        return recKey;
    }

    private static String random16BitNumGenerator() {

        String temp = "";

        String interim16Bit = Long.toString(Double.valueOf(Math.random() * 65535).longValue() * 11);

        if (interim16Bit.length() < 6) {
            for (int i = 0; i < (6 - interim16Bit.length()); i++)
                temp += "0";
            interim16Bit = temp + interim16Bit;
        }

        return interim16Bit;
    }
}
