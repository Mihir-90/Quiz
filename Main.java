package Quiz;


    public class Main {
        public static void main(String[] args) {
            Question[] questions = new Question[] {
                new Question(
                    "What is the capital city of Tamilnadu?",
                    new String[] {"Mumbai", "Chennai", "Hyderabad", "Ahemedabad"},
                1
                ),
                new Question(
                    "What is 5! ?",
                    new String[] {"60", "90", "120", "150"},
                    2
                ),
                new Question(
                    "What is the largest planet in our solar system?",
                    new String[] {"Earth", "Mars", "Jupiter", "Saturn"},
                    2
                ),
                new Question("What is the full form of CSE?",
                new String[] {"Computer Science and Engineering","Computer Science Engineer","Common Science Engineering","Community Science Engineering"},
                0 
                ),
                new Question(
                    "Which of the following is also known as liquid metal?",
                    new String[] {"Gallium", "Silicon", "Steel", "Mercury"},
                    3
                ),
                new Question(
                    "Which programming language is used for Data Science?",
                    new String[] {"C++", "Java", "Python", "C#"},
                    2
                ),
                new Question(
                    "When was the first processor invented?",
                    new String[] {"1969", "1970", "1971", "1972"},
                    2
                ),
                new Question(
                    "What is name of india's current prime minister?",
                    new String[] {"Rahul Gandhi", "Arvind Kejriwal", "Mamata Banerjee ", "Narendra Modi"},
                    3
                ),
                new Question(
                    "Which year did the moon landing occur?",
                    new String[] {"1969", "1974", "1971 ", "1979"},
                    0
                ),
                new Question(
                    "What is synonym of uncouth?",
                    new String[] {"Unfriendly", "ill-mannered", "Polite ", "boring"},
                    1
                )
                
            };
    
            Quiz quiz = new Quiz(questions);
            quiz.start();
        }
    }

