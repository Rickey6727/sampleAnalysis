select
  /*%expand*/*
from
  m_exchange_sp_message
where
  message_type = /* messageType */1
