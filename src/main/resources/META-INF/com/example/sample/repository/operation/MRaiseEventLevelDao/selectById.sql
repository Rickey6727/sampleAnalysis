select
  /*%expand*/*
from
  m_raise_event_level
where
  event_id = /* eventId */1
  and
  point = /* point */1
