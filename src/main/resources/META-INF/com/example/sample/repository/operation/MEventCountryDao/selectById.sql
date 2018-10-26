select
  /*%expand*/*
from
  m_event_country
where
  event_id = /* eventId */1
  and
  country_cd = /* countryCd */1
