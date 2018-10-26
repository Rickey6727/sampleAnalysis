select
  /*%expand*/*
from
  m_raise_event_npc_use_item
where
  event_id = /* eventId */1
  and
  rare = /* rare */1
  and
  use_item_type = /* useItemType */1
