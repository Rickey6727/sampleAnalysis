select
  /*%expand*/*
from
  m_ip_enable
where
  ip_event_id = /* ipEventId */1
  and
  enable_iso_country_cd = /* enableIsoCountryCd */'a'
