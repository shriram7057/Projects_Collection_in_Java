// ChatSimulation.java
import java.util.Scanner; 
class ChatSimulation
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("🤖 Chat Simulation Started! Type 'exit' to quit.");

        while (true)
        {
            System.out.print("You: ");
            String msg = sc.nextLine();

            // 1. Check for exit condition
            if (msg.trim().equalsIgnoreCase("exit"))
            {
                System.out.println("Bot: Goodbye! Have a nice day! 👋");
                break;
            }

            // 2. Get the bot's reply
            System.out.println("Bot: " + autoReply(msg));
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }

    /**
     * Generates an automated reply based on the user's message.
     * Uses lowercase conversion and checks for whole words.
     * @param msg The user's input message.
     * @return The bot's response.
     */
    static String autoReply(String msg)
    {
        // Convert the message to lowercase for case-insensitive matching
        String lowerMsg = msg.toLowerCase();

        // Use 'matches' with a simple regex to check for a whole word match
        // to avoid matching "hi" in "high" or "hitchhiker".
        // The regex '.*\\bKEYWORD\\b.*' checks for the keyword as a whole word (\b is a word boundary).

        if (lowerMsg.matches(".*\\bhi\\b.*|.*\\bhello\\b.*"))
        {
            return "Hello! How can I help you today?";
        }

        if (lowerMsg.matches(".*\\bweather\\b.*|.*\\btemp\\b.*"))
        {
            return "The local weather is sunny with clear skies! ☀️";
        }

        if (lowerMsg.matches(".*\\bbye\\b.*|.*\\badios\\b.*|.*\\bgoodbye\\b.*"))
        {
            return "Goodbye! Come chat again soon!";
        }

        // Default response for unhandled inputs
        return "Hmm, I don't quite understand that. Can you rephrase?";
    }
}