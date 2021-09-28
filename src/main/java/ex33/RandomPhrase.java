package ex33;

class RandomPhrase
{
    private String phrases[] = {"Yes", "No", "Maybe", "Ask again later"};

    public static int randomNumber()
    {
        return (int)(Math.random()*4);
    }

    public String generatePhrase(){
        return phrases[randomNumber()];
    }
}
