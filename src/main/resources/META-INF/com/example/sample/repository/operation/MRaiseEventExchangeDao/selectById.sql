select
  /*%expand*/*
from
  m_raise_event_exchange
where
  event_id = /* eventId */1
  and
  exchange_no = /* exchangeNo */1
