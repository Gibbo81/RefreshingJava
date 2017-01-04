package C13Generics;

public interface IReadable {
    String ReadValue();
}

class ReadableA implements IReadable{

    @Override
    public String ReadValue() {
        return "ReadableA";
    }
}

class ReadableB implements IReadable{

    @Override
    public String ReadValue() {
        return "ReadableB";
    }
}