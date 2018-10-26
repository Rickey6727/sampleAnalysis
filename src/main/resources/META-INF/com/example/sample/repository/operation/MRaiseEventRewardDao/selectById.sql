select
  /*%expand*/*
from
  m_raise_event_reward
where
  event_id = /* eventId */1
  and
  lot_group_id = /* lotGroupId */1
  and
  item_id = /* itemId */1
