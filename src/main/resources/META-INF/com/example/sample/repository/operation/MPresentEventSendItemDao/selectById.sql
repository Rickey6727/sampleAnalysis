select
  /*%expand*/*
from
  m_present_event_send_item
where
  event_id = /* eventId */1
  and
  sub_id = /* subId */1
