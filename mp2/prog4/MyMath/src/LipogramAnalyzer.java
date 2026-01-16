public class LipogramAnalyzer
{
  private String text;

  public LipogramAnalyzer(String text)
  {
    this.text = text;
  }

  public String mark(char letter)
  {
    return text.replace(letter, '#');
  }

  public String allWordsWith(char letter)
  {
    String result = "";
    int pos = 0;

    while (pos >= 0 && pos < text.length())
    {
      pos = text.indexOf(letter, pos);
      if (pos >= 0)
      {
        String word = extractWord(pos) + "\n";
        if (result.indexOf("\n" + word) < 0 &&
             result.indexOf(word) != 0)
          result += word;
        pos++;
      }
    }
    return result;
  }


  private String extractWord(int pos)
  {
    int pos0 = pos - 1, pos1 = pos + 1;

    while (pos0 >= 0 && Character.isLetter(text.charAt(pos0)))
      pos0--;

    while (pos1 < text.length() && Character.isLetter(text.charAt(pos1)))
      pos1++;

    return text.substring(pos0 + 1, pos1);
  }
}
