public class FacadeEncryptor {

    private aesEncryptor aesEncryptor = new aesEncryptor();

    private md5Encryptor md5Encryptor = new md5Encryptor();

    private shaEncryptor shaEncryptor = new shaEncryptor();

    public void encrypt(String text, EncType encType){
        switch (encType) {
            case AES: aesEncryptor.encrypt(text); break;
            case MD5: md5Encryptor.encrypt(text,"ER"); break;
            case SHA: shaEncryptor.encrypt(text,"ER",false); break;
            default: throw new IllegalArgumentException(encType.toString()+" unkown!");
        }
    }

    public enum EncType {
        SHA,
        MD5,
        AES
    }
}
