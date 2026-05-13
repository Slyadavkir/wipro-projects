public class FileDecoratorExercise {

    public static void main(String[] args) {

        FileData file = new SimpleFile();

        
        file = new Compression(file);
        file = new Encryption(file);
        file = new Logging(file);

        file.write("Practice questions");
    }
}


interface FileData {
    void write(String data);
}


class SimpleFile implements FileData {
    public void write(String data) {
        System.out.println("Writing data: " + data);
    }
}


abstract class FileDecorator implements FileData {
    protected FileData file;

    FileDecorator(FileData file) {
        this.file = file;
    }
}


class Compression extends FileDecorator {

    Compression(FileData file) {
        super(file);
    }

    public void write(String data) {
        String compressedData = "[Compressed]" + data;
        file.write(compressedData);
    }
}


class Encryption extends FileDecorator {

    Encryption(FileData file) {
        super(file);
    }

    public void write(String data) {
        String encryptedData = "[Encrypted]" + data;
        file.write(encryptedData);
    }
}


class Logging extends FileDecorator {

    Logging(FileData file) {
        super(file);
    }

    public void write(String data) {
        System.out.println("Logging: Writing data...");
        file.write(data);
    }
}
