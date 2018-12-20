select
  event_id, start_date, end_date, create_date, update_date, lucky_gacha_id, lucky_gacha_ticket_id, start_tutorial_id, end_tutorial_id
from
  m_delivery_event
where
  event_id = /* eventId */1
