SELECT
    extract(epoch FROM (CAST(end_date AS timestamp) - CAST(start_date AS timestamp))) / (60 * 60 * 24) as term
FROM
    m_capture_event
WHERE
    event_id = /*eventId*/'1'