package reader;

import java.io.BufferedReader;
import java.io.IOException;

class UpperCaseReader extends BufferedReader {

    // посилання на вкладений об'єкт
    BufferedReader wrapper;

    protected UpperCaseReader(BufferedReader reader) {
        super(reader);
        wrapper = reader;
    }

    @Override
    public String readLine() {
        String temp = null;
        try {
            // використовуючи збереженний об'єкт буфердРідера читаємо текст
            temp = wrapper.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (temp == null)
            return null;
        // додаємо функціонал і повертаємо значення
        return temp.toUpperCase();
    }

}