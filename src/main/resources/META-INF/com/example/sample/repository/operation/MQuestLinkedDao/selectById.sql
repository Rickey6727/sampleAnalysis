select
  /*%expand*/*
from
  m_quest_linked
where
  quest_id = /* questId */1
  and
  linked_quest_id = /* linkedQuestId */1
