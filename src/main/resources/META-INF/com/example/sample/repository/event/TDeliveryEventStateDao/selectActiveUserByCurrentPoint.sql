select
    count(distinct account_id)
from
    t_delivery_event_state
where
    event_id = /*eventId*/1
and
    current_point > 0