select
  /*%expand*/*
from
  m_coin_event_url
where
  event_id = /* eventId */1
  and
  country_cd = /* countryCd */1
