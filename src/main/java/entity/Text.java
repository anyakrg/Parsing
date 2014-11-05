package entity;

import java.util.ArrayList;
import java.util.List;

public class Text extends AbstractCompoundText<Paragraph>  {
    public List<Sentence> getAllSentences() {
        List<Sentence> result = new ArrayList<Sentence>();
        for (Paragraph paragraph : parts) {
            result.addAll(paragraph.parts);
        }
        return result;
    }
}
