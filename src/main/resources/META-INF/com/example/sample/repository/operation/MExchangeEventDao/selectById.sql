select
  /*%expand*/*
from
  m_exchange_event
where
  event_id = /* eventId */1
  and
  event_type = /* eventType */1
  and
  exchange_id = /* exchangeId */1
