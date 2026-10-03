import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Classe reutilitzable per xifrar i desxifrar missatges amb AES.
 * La clau ha de tenir 16, 24 o 32 caràcters (128, 192 o 256 bits).
 * Cipher.getInstance("AES") equival a AES/ECB/PKCS5Padding.
 */
public class ClasseAES {

    public static String encripta(String missatge, String clau) throws Exception {
        // 1. Preparar la clau: String -> bytes -> SecretKeySpec per a AES
        SecretKeySpec clauAES = new SecretKeySpec(clau.getBytes(StandardCharsets.UTF_8), "AES");

        // 2. Crear i configurar el sistema de xifrat
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, clauAES);

        // 3. Convertir el missatge a bytes i xifrar-lo
        byte[] xifrat = cipher.doFinal(missatge.getBytes(StandardCharsets.UTF_8));

        // 4. Convertir els bytes xifrats en un String llegible (Base64)
        return Base64.getEncoder().encodeToString(xifrat);
    }

    public static String desencripta(String missatgeXifrat, String clau) throws Exception {
        // 1. Preparar la clau
        SecretKeySpec clauAES = new SecretKeySpec(clau.getBytes(StandardCharsets.UTF_8), "AES");

        // 2. Crear i configurar el sistema de desxifrat
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, clauAES);

        // 3. Recuperar els bytes xifrats des del Base64
        byte[] xifrat = Base64.getDecoder().decode(missatgeXifrat);

        // 4. Desxifrar i convertir els bytes novament a text
        byte[] original = cipher.doFinal(xifrat);
        return new String(original, StandardCharsets.UTF_8);
    }
}
