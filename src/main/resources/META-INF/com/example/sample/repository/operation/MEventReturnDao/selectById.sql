select
  /*%expand*/*
from
  m_event_return
where
  event_id = /* eventId */1
  and
  return_no = /* returnNo */1
