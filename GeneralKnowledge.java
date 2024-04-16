public class GeneralKnowledge 
{
    private String[] questions;
    private char[] answers;
    
    
    GeneralKnowledge()
    {
        questions = new String[] 
        {
            "\nWhat is the primary cause of climate change?\nA. Natural climate cycles\nB. Human activities like burning fossil fuels and deforestation.",
            "\nHow much have average global temperatures risen since the pre-industrial era?\nA. 0.5°C (0.9°F)\nB. 1.2°C (2.2°F)",
            "\nWhat is one of the impacts of climate change?\nA. Decreased frequency of extreme weather events\nB. Increased frequency and severity of extreme weather events",
            "\nWhat was the estimated economic loss in the United States due to extreme weather events in 2021?\nA. $75 billion\nB. $155 billion",
            "\nWhat is a necessary step to mitigate climate change?\nA. Increasing the use of fossil fuels\nB. Reducing carbon emissions and transitioning to renewable energy"
        };

        answers = new char[]
        {
            'B', 'B', 'B', 'B', 'B'
        };
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
