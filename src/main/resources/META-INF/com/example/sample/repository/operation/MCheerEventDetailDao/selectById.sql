select
  /*%expand*/*
from
  m_cheer_event_detail
where
  cheer_event_id = /* cheerEventId */1
  and
  event_type_id = /* eventTypeId */1
  and
  condition_order = /* conditionOrder */1
