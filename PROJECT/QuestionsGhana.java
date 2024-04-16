public class QuestionsGhana 
{
    private String[] questions;
    private char[] answers;
    
    public QuestionsGhana()
    {
        questions = new String[]{
            "\n1. How has Ghana's economy been affected by climate change?\nA. Through impacts on climate-sensitive sectors such as agriculture and energy, leading to economic instability.\nB. By completely eliminating all industrial activity across the country.",
            "\n2. What impact does climate change have on hydropower in Ghana?\nA. Climate change affects hydropower by altering rainfall patterns and water availability, leading to power shortages and uncertainty in electricity supply.\nB. Hydropower remains unaffected by climate change due to modern technology.",
            "\n3. What is the expected impact of climate change on Ghana's food security?\nA. Climate change increases food production, leading to an abundance of resources.\nB. Climate change affects food security by disrupting farming and fishing due to erratic rainfall and changing weather conditions.",
            "\n4. How is sea-level rise affecting Ghana's coastal areas?\nA. Sea-level rise causes coastal areas to expand, providing more land for development.\nB. Sea-level rise increases salinity in coastal waters, threatens coastal communities, and could lead to displacement of people.",
            "\n5. What health challenges are projected to increase due to climate change in Ghana?\nA. Waterborne and mosquito-borne diseases, such as cholera and malaria, are expected to increase due to changing water conditions.\nB. Climate change reduces the spread of diseases due to higher temperatures."
        };
        answers = new char[] {'A', 'A', 'B', 'A', 'A'};

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
