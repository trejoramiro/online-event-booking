import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Event {
    private String eventName;
    private String date;
    private Location location;
    private List<BigDecimal> ticketPrices;
}
