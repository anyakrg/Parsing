package entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends AbstractCompoundText<SentencePart> implements TextPart {
    public Type type;

    public List<Word> getAllWords() {
        List<Word> result = new ArrayList<Word>();
        for (SentencePart sentencePart : parts) {
            if (sentencePart instanceof Word) {
                result.add((Word) sentencePart);
            }
        }
        return result;
    }

    public enum Type {
        DECLARATIVE, INTERROGATIVE, EXCLAMATORY_IMPERATIVE;


        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }


}
