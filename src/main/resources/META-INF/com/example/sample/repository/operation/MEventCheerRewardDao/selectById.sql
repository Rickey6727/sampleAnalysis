select
  /*%expand*/*
from
  m_event_cheer_reward
where
  event_id = /* eventId */1
  and
  show_action_type = /* showActionType */1
