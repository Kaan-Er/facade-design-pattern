public class CustomEncryptor {

    public static void main(String[] args) {

        String text = "Kaan";

        /*
        aesEncryptor aesEncryptor = new aesEncryptor();
        aesEncryptor.encrypt(text);

        md5Encryptor md5Encryptor = new md5Encryptor();
        md5Encryptor.encrypt(text,"ER");

        shaEncryptor shaEncryptor = new shaEncryptor();
        shaEncryptor.encrypt(text,"ER",false);

        */

        FacadeEncryptor facadeEncryptor = new FacadeEncryptor();
        facadeEncryptor.encrypt(text, FacadeEncryptor.EncType.SHA);
    }
}
