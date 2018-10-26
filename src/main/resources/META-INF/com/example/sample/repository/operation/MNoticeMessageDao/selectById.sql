select
  /*%expand*/*
from
  m_notice_message
where
  notice_type = /* noticeType */1
  and
  country_cd = /* countryCd */1
  and
  message_id = /* messageId */1
