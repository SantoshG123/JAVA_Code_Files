import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EconomicsQuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit 5 Key Terms");

        Map<String, String> quizQuestions = createQuizQuestions();

        int score = 0;

        for (Map.Entry<String, String> entry : quizQuestions.entrySet()) {
            String definition = entry.getKey();
            String term = entry.getValue();

            System.out.println("\n" + definition);
            System.out.print("Definition ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(term)) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("Incorrect. The correct term is: " + term);
            }
        }

        System.out.println("\nQuiz completed! Your score: " + score + " out of " + quizQuestions.size());
    }

    private static Map<String, String> createQuizQuestions() {
        Map<String, String> definitionsAndTerms = new HashMap<>();

        definitionsAndTerms.put("An estimate of what the budget balance would be if real GDP were exactly equal to potential output.",
                "Cyclically Adjusted Budget Balance");
        definitionsAndTerms.put("The amount of money the federal government has borrowed to cover the outstanding balance of expenses incurred over time.",
                "Government Debt");
        definitionsAndTerms.put("Runs from October 1 to September 30 and is labeled according to the calendar year in which it ends.",
                "Fiscal Year");
         definitionsAndTerms.put("Government debt held by individuals and institutions outside the government.",
                "Public Debt");
         definitionsAndTerms.put("Spending promises made by governments that are effectively a debt despite the fact that they are not included in the usual debt statistics.",
                "Implicit Liabilities");
        definitionsAndTerms.put("The Federal Reserve can move the interest rate through open-market operations that shift the money supply curve. In practice, the Fed sets a ___________ and uses open-market operations to achieve the target.",
                "Target Federal Funds Rate");
        definitionsAndTerms.put("Monetary policy that increases aggregate demand.",
                "Expansionary Monetary Policy");
        definitionsAndTerms.put("Monetary policy that reduces aggregate demand. ",
                "Contractionary Monetary Policy");
        definitionsAndTerms.put("A rule for setting the federal funds rate that takes into account both the inflation rate and the output gap.",
                "Taylor Rule for Monetary Policy");
        definitionsAndTerms.put("Occurs when the central bank sets an explicit target for the inflation rate and sets monetary policy in order to hit that target. ",
                "Inflation Targeting");
        definitionsAndTerms.put("This concept signifies that changes in the money supply have no real effects on the economy. ",
                "Monetary Neutrality");
        
        

        return definitionsAndTerms;
    }
}



