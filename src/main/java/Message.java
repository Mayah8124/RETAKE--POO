import java.time.LocalDate;
import java.time.LocalDateTime;

public class Message {
    private String message;
    private LocalDateTime creationTime;
    private User user;
    private boolean isConfidential;

    public Message(LocalDateTime creationTime, User user, boolean isConfidential, String message) {
        this.creationTime = creationTime;
        this.user = user;
        this.isConfidential = isConfidential;
        this.message = message;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public boolean isConfidential() {
        return isConfidential;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
