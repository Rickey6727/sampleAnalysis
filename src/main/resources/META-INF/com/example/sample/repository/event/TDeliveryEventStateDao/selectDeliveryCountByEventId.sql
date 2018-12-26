select
    sum(current_point)
from
    t_delivery_event_state
where
    event_id = /*eventId*/'1'