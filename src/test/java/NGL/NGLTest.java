package NGL;

import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import retake.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NGLTest {
    private Publication pub;

    @BeforeEach
    void setUp() {
        User user1 = new User(
                "001" , "Rakoto" , "Rabe" , "rabe@gmail.com"
        );

        SuscribedUser sUser = new SuscribedUser(
                "002" , "Rasoa" , "Mino" , "Mino@gmail.com"
        );

        AnonymeUser aUser = new AnonymeUser(
                "003"
        );

        Message mess1 = new Message(
                LocalDate.now().atStartOfDay(),sUser,true,"Hello"
        );

        Message mess2 = new Message(
                LocalDate.now().atStartOfDay(),aUser,false,"Bye"
        );

        pub.messageList = List.of(
                mess2 , mess1
        );

        Publication pub2 = new Publication(
                "P001" , user1 , pub.messageList
        );

    }
    @Test
    public void createPublicationTest(){
        String publication = pub.createPublication();
        assertEquals( "P001" , publication );
    };

    @Test
    public void addMessageTest(){
        List<Message> messageList = pub.addMessage(mess1);
        assertEquals(messageList.getFirst().getMessage(), 2);
    }

}
