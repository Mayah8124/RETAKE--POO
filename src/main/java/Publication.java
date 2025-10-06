import java.util.List;

public class Publication {
    private String Id;
    private User user;
    List<Message> messageList;

    public Publication(String id , User user, List<Message> messageList) {
        Id = id;
        this.user = user;
        this.messageList = messageList;
    }

    public String getId() {
        return Id;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public User getUser() {
        return user;
    }


}
