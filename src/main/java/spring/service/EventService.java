package spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.domain.Event;
import spring.repository.EventRepository;

@Service
public class EventService {

  @Autowired
  private EventRepository eventRepository;

  public List<Event> findAll() {
    return eventRepository.findAll();
  }

  public Event get(Integer id) {
    return eventRepository.findById(id).orElse(null); // kostil
  }

  public Event add(Event event) {
    return eventRepository.save(event);
  }

  public Event update(int id, Event event) {
    Event updEvent = get(id);
    if (updEvent != null) {
      updEvent.setName(event.getName());
      updEvent.setCity(event.getCity());
      eventRepository.save(updEvent);
    }
    return updEvent;
  }

  public Event delete(Integer id) {
    Event delEvent = get(id);
    if (delEvent != null) {
      eventRepository.delete(delEvent);
    }
    return delEvent;
  }
}
