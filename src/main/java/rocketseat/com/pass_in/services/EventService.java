package rocketseat.com.pass_in.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rocketseat.com.pass_in.domain.attendee.Attendee;
import rocketseat.com.pass_in.domain.event.Event;
import rocketseat.com.pass_in.dto.event.EventDetailDTO;
import rocketseat.com.pass_in.dto.event.EventResponseDTO;
import rocketseat.com.pass_in.repositores.AttendeeRepository;
import rocketseat.com.pass_in.repositores.EventRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;
    private final AttendeeRepository attendeeRepository;

    public EventResponseDTO getEventDetail(String id) {
        Event event = this.eventRepository.findById(id).orElseThrow(() -> new RuntimeException("Event not found with ID: " + id));
        List<Attendee> attendeeList = this.attendeeRepository.findByEventId(id);
        return new EventResponseDTO(event, attendeeList.size());
    }
}
