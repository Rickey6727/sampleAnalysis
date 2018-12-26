select
    sum(capture_count)
from
    t_capture_captured
where
    event_id = /*eventId*/'1'