package retake;

import java.util.List;
import java.util.stream.Collectors;

public class Publication {
    private String Id;
    private User link;
    public List<Message> messageList;

    public Publication(String id , User link, List<Message> messageList) {
        Id = id;
        this.link = link;
        this.messageList = messageList;
    }

    public String getId() {
        return Id;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public String createPublication() {
        return Id + " " + link ;
    }

    public List<Message> addMessage(Message messages) {
        messageList.add(messages);
        return messageList;
    }

    public List<User> showAuthor() {
        return messageList.stream()
                .map(Message::getUser)
                .collect(Collectors.toList());
    }
}
