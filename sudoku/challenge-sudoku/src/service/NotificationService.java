package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private Map<EventEnum, List<EventListener>> listeners = new HashMap<>() {{
        put(EventEnum.CLEAR_SPACE, new ArrayList<>());
    }};

    public void subscriber(final EventEnum eventType,EventListener listener) {
        var selectedListeners = listeners.get(eventType);
        selectedListeners.add(listener);
    }

    public void notify(final EventEnum eventType) {
        listeners.get(eventType).forEach(l -> l.update(eventType));
    }
}
