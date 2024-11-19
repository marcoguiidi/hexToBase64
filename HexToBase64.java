import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

public class HexToBase64 {
    public static void main(String[] args) throws Exception {
        String hexString = "4a1b48d7322394a78326cd283f0834093e65421a7e98e90e5b452d160b5d07d8";

        byte[] bytes = Hex.decodeHex(hexString);

        byte[] b64String = Base64.encodeBase64(bytes);

        System.out.println(new String(b64String));
    }
}