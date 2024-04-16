public class QuestionsNigeria 
{
    private String[] questions;
    private char[] answers;

    QuestionsNigeria()
    {
        questions = new String[]{
            "\nWhat is the climate like in northern Nigeria?\nA. Tropical monsoon\nB. Semi-arid and hot, dry conditions",
            "\nWhich region of Nigeria receives the highest amount of annual rainfall?\nA. Northern regions\nB. Southern coastal areas",
            "\nHow are climatic zones in Nigeria shifting due to climate change?\nA. The desert region is expanding southwards\nB. The desert region is receding northwards, and the savanna climate is expanding",
            "\nWhat is one of the effects of climate change in Nigeria?\nA. Decrease in extreme weather events\nB. Increase in extreme weather events like droughts, floods, and storms",
            "\nWhich statement best describes Nigeria's climate?\nA. Uniform climate across the country\nB. Diverse climate ranging from semi-arid to tropical monsoon, with significant variations"
        };

        answers = new char[]{'B', 'B', 'B', 'B', 'B'};
    }

    public String[] getQuestions()
    {
        return questions;
    }

    public char[] getAnswers()
    {
        return answers;
    }
}
