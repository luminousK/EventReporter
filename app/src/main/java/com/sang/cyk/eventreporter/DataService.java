package com.sang.cyk.eventreporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyk on 2017/9/29.
 */

public class DataService {
    /*
    * Fake all the event data for now
    * */

    public static List<Event> getEventData(){
        List<Event> eventData = new ArrayList<>();
        for(int i=0; i<10; ++i) {
            eventData.add(
                    new Event("Event", "1184 W valley Blvd, CA 90101", "This is a huge event")
            );

        }
        return eventData;
    }
}
