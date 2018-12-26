SELECT
    extract(epoch FROM (cast(end_date as timestamp) - cast(start_date as timestamp))) / (60 * 60 * 24) as term
FROM
    m_delivery_event
WHERE
    event_id = /*eventId*/'1'