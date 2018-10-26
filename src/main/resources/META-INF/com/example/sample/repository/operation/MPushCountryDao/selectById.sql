select
  /*%expand*/*
from
  m_push_country
where
  push_message_id = /* pushMessageId */1
  and
  country_cd = /* countryCd */1
