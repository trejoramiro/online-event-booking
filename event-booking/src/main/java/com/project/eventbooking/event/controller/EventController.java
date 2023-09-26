
@RestController("/event")
public class EventController {

    private final EventRepository eventRepository;

    //CRUD

    @PostMapping()
    Event createEvent(@RequestBody Event newEvent) {
        return eventRepository.save(newEvent);
    }

    @GetMapping("/{id}")
    Event getEvent(@PathVariable Long id ) {
        return eventRepository.findById(id);
    }

    @PutMapping("/{id}")
    Event updateEvent(@RequestBody Event newEvent) {
        // todo: implement
    }

    @DeleteMapping("/{id}")
    void deleteEvent(@PathVariable long id) {
        eventRepository.deleteById(id);
    }
}