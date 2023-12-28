package Week_13.ThirdTask;
interface TextFormatter
{
    String formatText(String text);
}
class UpperCaseFormatter implements  TextFormatter{
    @Override
    public String formatText(String message){
        return message.toUpperCase();
    }

}

class LowerCaseFormatter implements TextFormatter
{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }

}
class CamelCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text){

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            result.append(word.substring(0,1).toUpperCase())
                    .append(word.substring(1,word.length()).toLowerCase())
                    .append(" ");
        }
        return result.toString();

    }
}
class TextEditor
{
private TextFormatter textFormatter;
public void setTextFormatter(TextFormatter textFormatter){

    this.textFormatter = textFormatter;
}
public String formatText(String text){

    return textFormatter.formatText(text);
}
}
class MainStrategy
{
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();
        LowerCaseFormatter lowerCaseFormatter = new LowerCaseFormatter();
        CamelCaseFormatter camelCaseFormatter = new CamelCaseFormatter();

        textEditor.setTextFormatter(upperCaseFormatter);
        System.out.println(upperCaseFormatter.formatText("text to uppercase"));
        System.out.println(lowerCaseFormatter.formatText("TEXT TO LOWERCASE"));
        System.out.println(camelCaseFormatter.formatText("text to camelCase"));

    }
}