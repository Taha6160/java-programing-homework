
public class test {
    // Değişkenleri tanımlayın
    private static final float EARTH_GRAVITY = 9.81f;
    private static final float MARS_GRAVITY = 3.71f;
    private static float earthWeightKuresa = 70.0f;
    private static float marsWeightKuresa;
    private static double marsWeightDoubleKuresa;
    private static int marsWeightIntKuresa;
    private static char marsWeightCharKuresa;

    public static void main(String[] args) {
        // Mars'ta ağırlık hesapla
        marsWeightKuresa = earthWeightKuresa * (MARS_GRAVITY / EARTH_GRAVITY);
        System.out.println("Weight on Mars: " + String.format("%.4f", marsWeightKuresa));

        // Double'ı int'e dönüştür
        marsWeightDoubleKuresa = marsWeightKuresa;
        marsWeightIntKuresa = (int) marsWeightDoubleKuresa;
        System.out.println("Weight on Mars as int: " + marsWeightIntKuresa);

        // Int'i char'a dönüştür
        marsWeightCharKuresa = (char) marsWeightIntKuresa;
        System.out.println("Weight on Mars as char: " + marsWeightCharKuresa);

        // Char üzerinde matematiksel işlem yap ve int'e ata
        int charMath = marsWeightCharKuresa + 10;
        System.out.println("Char math result: " + charMath);
    }
}
