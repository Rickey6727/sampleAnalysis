select
    count(distinct account_id)
from
    t_capture_user_state
where
    event_id = /*eventId*/1
and
    current_point > 0