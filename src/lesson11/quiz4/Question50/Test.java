package lesson11.quiz4.Question50;


interface Document {

    default String getType() {
        return "TEXT";
    }
}

interface WordDocument extends Document {

    @Override
    String getType();
}

class Word implements WordDocument {
}

public class Test {

    public static void main(String[] args) {
        Document doc = new Word(); // Line n1
        System.out.println(doc.getType()); // Line n2
    }
}
