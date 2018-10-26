select
  /*%expand*/*
from
  m_present_message
where
  message_id = /* messageId */1
  and
  country_cd = /* countryCd */1
