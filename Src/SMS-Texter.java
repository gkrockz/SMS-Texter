import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSTexter 
{
    // Find your Account Sid and Token at twilio.com/console

    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID"); // Your SID
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN"); // Your AUTH_TOKEN

    public static void main(String[] args) 
    {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+152607737092"), // Your Twilio Generated Number.
                new com.twilio.type.PhoneNumber("+918754105798"), // Reciever Number.
                "HEEELLLOOOOO")
            .create();

        System.out.println(message.getSid());
    }
}
