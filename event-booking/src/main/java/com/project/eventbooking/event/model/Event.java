import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Event {
    private String eventName;
    private String description;
    private LocalDateTime startDateTime;
    private LocalDatetime endDateTime;
    private Location location;
    private List<Ticket> tickets;
}
