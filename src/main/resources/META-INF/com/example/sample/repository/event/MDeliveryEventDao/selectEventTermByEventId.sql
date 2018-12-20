select
    extract(epoch from (cast(end_date as timestamp) - cast(start_date as timestamp))) / (60 * 60 * 24) as term
from
    m_delivery_event
where
    event_id = /*eventId*/1